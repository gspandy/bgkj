package com.pagoda.bgkj.repo.ww.custom;

import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.domain.ww.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * TestCat扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface TestCatRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orgId
   * @param pageable
   * @return
   */
  Page<TestCatDTO> findBy(@Param("orgId") Long orgId, @Param("pageable") Pageable pageable);
}
