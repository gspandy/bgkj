package com.pagoda.bgkj.web.ww;

import com.pagoda.bgkj.api.*;
import com.pagoda.bgkj.api.ww.*;
import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.validator.ww.*;

import io.micrometer.core.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

/**
 * 模型TestMM对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestMMService")
@Slf4j
public class TestMMController {
  @Autowired private TestMMService testmmService;

  @Autowired private TestMMValidator testmmValidator;

  @InitBinder("testmmDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testmmValidator);
  }

  /**
   * 插入一条TestMM记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestMMDTO create(@Valid @RequestBody TestMMDTO dto) {
    return testmmService.create(dto);
  }
}
