package com.pagoda.bgkj.repo.mm.custom;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * TestAddress扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface TestAddressRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param orderNo
   * @param status
   * @param pageable
   * @return
   */
  Page<TestAddressDTO> findBy(
      @Param("orderNo") String orderNo,
      @Param("status") String status,
      @Param("pageable") Pageable pageable);
}
