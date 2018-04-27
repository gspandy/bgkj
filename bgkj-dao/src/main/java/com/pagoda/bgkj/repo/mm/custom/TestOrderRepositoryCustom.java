package com.pagoda.bgkj.repo.mm.custom;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * TestOrder扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface TestOrderRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orderStatus
   * @param orderNo
   * @param productCount
   * @param shopId
   * @param pageable
   * @return
   */
  Page<TestOrderDTO> findBy(
      @Param("orderStatus") Integer orderStatus,
      @Param("orderNo") String orderNo,
      @Param("productCount") Integer productCount,
      @Param("shopId") Integer shopId,
      @Param("pageable") Pageable pageable);
}
