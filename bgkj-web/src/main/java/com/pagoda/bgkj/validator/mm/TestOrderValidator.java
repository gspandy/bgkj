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
public class TestOrderValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return TestOrderDTO.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    TestOrderDTO dto = (TestOrderDTO) target;

    // errors.reject(ALREADY_EXISTS.getCode());
  }
}
