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
 * 模型TestOrder对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestOrderService")
@Slf4j
public class TestOrderController {
  @Autowired private TestOrderService testorderService;

  @Autowired private TestOrderValidator testorderValidator;

  @InitBinder("testorderDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testorderValidator);
  }

  /**
   * 插入一条TestOrder记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestOrderDTO create(@Valid @RequestBody TestOrderDTO dto) {
    return testorderService.create(dto);
  }
}
