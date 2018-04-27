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
public class TestCatValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return TestCatDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    TestCatDTO dto = (TestCatDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
