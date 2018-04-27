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
 * 模型TestUser对应的Controller
 *
 * @author PagodaGenerator
 * @generated
 */
@RestController
@RequestMapping("/TestUserService")
@Slf4j
public class TestUserController {
  @Autowired private TestUserService testuserService;

  @Autowired private TestUserValidator testuserValidator;

  @InitBinder("testuserDTO")
  public void setupBinder(WebDataBinder binder) {
    binder.addValidators(testuserValidator);
  }

  /**
   * 插入一条TestUser记录
   *
   * @param dto
   * @return
   */
  @Timed
  @PostMapping(value = "/create")
  public TestUserDTO create(@Valid @RequestBody TestUserDTO dto) {
    return testuserService.create(dto);
  }
}
