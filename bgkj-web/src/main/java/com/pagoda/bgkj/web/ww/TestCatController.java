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
 * 模型TestCat对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestCatService")
@Slf4j
public class TestCatController {
  @Autowired private TestCatService testcatService;

  @Autowired private TestCatValidator testcatValidator;

  @InitBinder("testcatDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testcatValidator);
  }

  /**
   * 插入一条TestCat记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestCatDTO create(@Valid @RequestBody TestCatDTO dto) {
    return testcatService.create(dto);
  }
}
