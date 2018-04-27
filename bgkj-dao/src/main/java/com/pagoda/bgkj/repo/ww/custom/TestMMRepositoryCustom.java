package com.pagoda.bgkj.repo.ww.custom;

import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.domain.ww.*;
import com.pagoda.platform.jms.jpa.*;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

/**
 * TestMM扩展数据访问接口
 *
 * @author PagodaGenerator
 * @generated
 */
public interface TestMMRepositoryCustom {

  /**
   * 包含所有可查询的字段
   *
   * @param status
   * @param pageable
   * @return
   */
  Page<TestMMDTO> findBy(@Param("status") String status, @Param("pageable") Pageable pageable);
}
