package com.pagoda.bgkj.web.mm;

import com.pagoda.bgkj.api.*;
import com.pagoda.bgkj.api.mm.*;
import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.validator.mm.*;

import io.micrometer.core.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

/**
 * 模型TestAddress对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestAddressService")
@Slf4j
public class TestAddressController {
  @Autowired private TestAddressService testaddressService;

  @Autowired private TestAddressValidator testaddressValidator;

  @InitBinder("testaddressDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testaddressValidator);
  }

  /**
   * 插入一条TestAddress记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestAddressDTO create(@Valid @RequestBody TestAddressDTO dto) {
    return testaddressService.create(dto);
  }
}
