package com.pagoda.bgkj.validator.mm;

import com.pagoda.bgkj.api.dto.mm.*;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 使用spring校验，参考http://www.bbenson.co/post/spring-validations-with-examples/
 *
 * @author PagodaGenerator
 * @generated
 */
@Component
public class testApplyTabValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return testApplyTabDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    testApplyTabDTO dto = (testApplyTabDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
