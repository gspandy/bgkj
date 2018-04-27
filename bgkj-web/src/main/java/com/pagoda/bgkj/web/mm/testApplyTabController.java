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
 * 模型testApplyTab对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/testApplyTabService")
@Slf4j
public class testApplyTabController {
  @Autowired private testApplyTabService testapplytabService;

  @Autowired private testApplyTabValidator testapplytabValidator;

  @InitBinder("testapplytabDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testapplytabValidator);
  }

  /**
   * 插入一条testApplyTab记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public testApplyTabDTO create(@Valid @RequestBody testApplyTabDTO dto) {
    return testapplytabService.create(dto);
  }
}
