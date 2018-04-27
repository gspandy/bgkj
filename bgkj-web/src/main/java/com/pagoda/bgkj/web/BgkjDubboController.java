package com.pagoda.bgkj.web;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.*;

import com.pagoda.platform.dubbo.consumer.*;
import com.pagoda.platform.dubbo.metadata.EntityFeatureInfo;
import com.pagoda.platform.dubbo.metadata.FieldMetaInfo;
import com.pagoda.platform.dubbo.metadata.MetadataService;
import cn.com.pagoda.common.shiro.subject.*;

import io.micrometer.core.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用的Dubbo调用服务，将Dubbo RPC转换成Rest API
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/dubboAPI")
@Slf4j
public class BgkjDubboController {

  /** 模块名 * */
  public static final String MODULE_NAME = "Bgkj";

  /** 模块包名 * */
  public static final String MODULE_PACKAGE = "com.pagoda.bgkj";

  /** DTO包名 * */
  public static final Map<String, String> DTO_PACKAGES = new HashMap<>();

  static {
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.ww.TestCatDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.FindOrderAndUserByShopIdDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.ww.TestOrgDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.testApplyTabDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.FindOrderAndUserByIdDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.TestOrderDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.TestAddressDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.FindByShopIdDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.ww.TestMMDTO");
    putInMap(DTO_PACKAGES, "com.pagoda.bgkj.api.dto.mm.TestUserDTO");
  }

  /** api包名 * */
  public static final Map<String, String> API_PACKAGES = new HashMap<>();

  static {
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.ww.TestMMService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.ww.TestOrgService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.mm.TestOrderService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.mm.testApplyTabService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.mm.TestUserService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.mm.TestAddressService");
    putInMap(API_PACKAGES, "com.pagoda.bgkj.api.ww.TestCatService");
  }

  /** 查询方法名 * */
  public static final String QUERY_METHOD = "findBy";

  /** 路径分隔符 * */
  public static final String PATH_SEP = "/";

  /** 包名分隔符 * */
  public static final String PACKAGE_SEP = ".";

  /** 请求路径 * */
  public static final String REQUEST_PATH = "/dubboAPI";

  /** 调用dubbo rpc */
  @Autowired private DubboGenericInvoker dubboGenericServiceInvoker;

  /** 前端查询元数据 */
  @Autowired private MetadataService metadataService;

  @Value("${dubbo.enabled:true}")
  private boolean dubboEnabled;

  @Autowired private ReflectionInvoker reflectionInvoker;

  // @FastJsonView(exclude = {@FastJsonFilter(clazz = HashMap.class, props = {"class"})})
  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/{service}/{method}")
  public Object getInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    service = addPackageName(service);
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
  }

  static void putInMap(Map<String, String> map, String fullName) {
    map.put(getClassName(fullName), fullName);
  }

  static String addPackageName(String service) {
    if (service.indexOf(PACKAGE_SEP) < 0) {
      return API_PACKAGES.get(service);
    } else {
      return service;
    }
  }

  static String getClassName(String name) {
    return name.substring(name.lastIndexOf(PACKAGE_SEP) + 1);
  }

  static String getApiServiceClass(String dtoClass) {
    return dtoClass.replace("DTO", "Service");
  }

  /**
   * 将Dubbo RPC转换成Rest API
   *
   * @param httpRequest
   * @param service 接口的全路径名称（带包名）
   * @param method 要调用的接口方法名
   * @param timeout 超时时间，单位毫秒
   * @param retries 重试次数
   * @return
   * @throws Exception
   */
  @Timed
  @ResponseBody
  @PostMapping(value = "/{service}/{method}")
  public Object postInvokeApi(
      HttpServletRequest httpRequest,
      @PathVariable("service") String service,
      @PathVariable("method") String method,
      @RequestHeader(value = "timeout", required = false, defaultValue = "5000") int timeout,
      @RequestHeader(value = "retries", required = false, defaultValue = "2") int retries)
      throws Exception {
    service = addPackageName(service);
    if (dubboEnabled) {
      return dubboGenericServiceInvoker.invokeApi(httpRequest, service, method, timeout, retries);
    } else {
      return reflectionInvoker.invokeApi(httpRequest, service, method);
    }
  }

  /**
   * 前端组件查询类型的元数据
   *
   * @param httpRequest
   * @param className 类型的全路径名称（带包名）
   * @return
   */
  @Timed
  @ResponseBody
  @GetMapping(value = "/metadata/{className:.+}")
  public Object metadata(
      HttpServletRequest httpRequest, @PathVariable("className") String className) {
    EntityFeatureInfo classMeta = null;
    List<FieldMetaInfo> feilds = null;
    String serviceClass = "";
    if (className.indexOf(PACKAGE_SEP) > -1) {
      classMeta = metadataService.getDtoClassMetadata(className);
      feilds = metadataService.getDtoFieldsMetadata(className);
      serviceClass = API_PACKAGES.get(getApiServiceClass(getClassName(className)));
    } else {
      classMeta = metadataService.getDtoClassMetadata(DTO_PACKAGES.get(className));
      feilds = metadataService.getDtoFieldsMetadata(DTO_PACKAGES.get(className));
      serviceClass = API_PACKAGES.get(getApiServiceClass(className));
    }

    JSONObject json = new JSONObject();
    json.put("head", feilds);

    String requestUrl = classMeta.getRequestUrl();
    if (StringUtils.isEmpty(requestUrl)) {
      requestUrl = REQUEST_PATH + PATH_SEP + serviceClass + PATH_SEP + QUERY_METHOD;
    }
    json.put("requestUrl", requestUrl);
    json.put("tableMultiSelect", classMeta.isTableMultiSelect());
    return json;
  }

  /*
  private void checkUserPermission() {
      try {
          PagodaSubject subject = (PagodaSubject) SecurityUtils.getSubject();
          // 用户代码
          String userCode = subject.getUserCode();
          // 员工号，用于记录操作人
          String employeeCode = subject.getEmployeeCode();
          // 部门，用于记录操作人
          String orgCode = subject.getOrgCode();
          System.out.println(userCode);
      } catch (Exception e) {
          log.error("checkUserPermission", e);
      }
  }
  */
}
