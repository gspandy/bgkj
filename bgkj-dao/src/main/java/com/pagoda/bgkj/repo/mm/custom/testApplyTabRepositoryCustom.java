package com.pagoda.bgkj.repo.mm.custom;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * testApplyTab扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface testApplyTabRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param testApply
   * @param orderNo
   * @param pageable
   * @return
   */
  Page<testApplyTabDTO> findBy(
      @Param("testApply") String testApply,
      @Param("orderNo") String orderNo,
      @Param("pageable") Pageable pageable);
}
