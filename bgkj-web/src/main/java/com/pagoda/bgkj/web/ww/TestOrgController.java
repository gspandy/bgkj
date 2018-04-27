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
 * 模型TestOrg对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestOrgService")
@Slf4j
public class TestOrgController {
  @Autowired private TestOrgService testorgService;

  @Autowired private TestOrgValidator testorgValidator;

  @InitBinder("testorgDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testorgValidator);
  }

  /**
   * 插入一条TestOrg记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestOrgDTO create(@Valid @RequestBody TestOrgDTO dto) {
    return testorgService.create(dto);
  }
}
