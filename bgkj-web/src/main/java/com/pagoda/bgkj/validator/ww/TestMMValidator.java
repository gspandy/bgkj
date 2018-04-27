package com.pagoda.bgkj.validator.ww;

import com.pagoda.bgkj.api.dto.ww.*;

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
public class TestMMValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return TestMMDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    TestMMDTO dto = (TestMMDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
