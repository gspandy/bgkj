package com.pagoda.bgkj.repo.mm.custom;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * TestUser扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface TestUserRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param phone
   * @param userName
   * @param pageable
   * @return
   */
  Page<TestUserDTO> findBy(
      @Param("phone") String phone,
      @Param("userName") String userName,
      @Param("pageable") Pageable pageable);
}
