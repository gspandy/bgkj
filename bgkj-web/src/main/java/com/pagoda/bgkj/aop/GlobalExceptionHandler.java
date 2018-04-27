package com.pagoda.bgkj.aop;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * 统一的web异常处理类,
 * 可以继承org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
 *
 * @author ???
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  /**
   * 处理dubbo泛化调用异常
   *
   * @param e
   * @return
   */
  @ExceptionHandler(GenericException.class)
  @ResponseBody
  public JSONObject handleGenericException(GenericException e) {
    // GenericFilter将堆栈转成字符串了
    return toErrorJsonResponse(-1, ((GenericException) e).getExceptionMessage(), e);
  }

  /**
   * 处理校验异常
   *
   * @param e
   * @return
   */
  @ExceptionHandler(ConstraintViolationException.class)
  @ResponseBody
  public JSONObject handleConstraintViolationException(ConstraintViolationException e) {
    // 处理验证异常
    Set<ConstraintViolation<?>> validations =
        ((ConstraintViolationException) e).getConstraintViolations();
    if (validations != null) {
      StringBuilder buf = new StringBuilder();
      validations.forEach(validation -> buf.append(validation.getMessage()));
      return toErrorJsonResponse(400, buf.toString(), e);
    } else {
      return toErrorJsonResponse(400, e.getMessage(), e);
    }
  }

  /**
   * web方法参数错误
   *
   * @param e
   * @return
   */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseBody
  public JSONObject handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
    BindingResult bindingResult = e.getBindingResult();
    StringBuilder buf = new StringBuilder();
    bindingResult
        .getFieldErrors()
        .stream()
        .forEach(
            fieldError -> {
              buf.append("field=")
                  .append(fieldError.getField())
                  .append(", ")
                  .append("code=")
                  .append(fieldError.getCode())
                  .append(", ")
                  .append("rejectedValue=")
                  .append(fieldError.getRejectedValue())
                  .append(", ");
            });
    bindingResult
        .getGlobalErrors()
        .stream()
        .forEach(
            globalError -> {
              buf.append("globalErrorCode=").append(globalError.getCode()).append("\n");
            });
    return toErrorJsonResponse(400, buf.toString(), e);
  }

  /**
   * 处理所有其他异常
   *
   * @param e
   * @return
   */
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public JSONObject handleAllException(Exception e) {
    return toErrorJsonResponse(-1, e.getMessage(), e);
  }

  private JSONObject toErrorJsonResponse(int code, String errorMsg, Exception e) {
    if (StringUtils.isEmpty(errorMsg)) {
      errorMsg = "系统异常";
    }
    JSONObject result = new JSONObject();
    result.put("errorMsg", errorMsg);
    if (e instanceof IllegalArgumentException || e instanceof ConstraintViolationException) {
      result.put("resultCode", 400);
    } else if (code != -1) {
      result.put("resultCode", code);
    } else {
      result.put("resultCode", 500);
    }

    log.error("GlobalExceptionHandler | err=" + errorMsg, e);
    return result;
  }
}
