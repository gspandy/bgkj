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
public class TestOrgValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return TestOrgDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    TestOrgDTO dto = (TestOrgDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
