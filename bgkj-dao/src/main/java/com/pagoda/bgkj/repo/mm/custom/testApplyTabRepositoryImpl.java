package com.pagoda.bgkj.repo.mm.custom;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.platform.jms.jpa.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * testApplyTab扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class testApplyTabRepositoryImpl extends BaseRepositoryCustomImpl<testApplyTab, Long>
    implements testApplyTabRepositoryCustom {

  @Override
  protected Class<testApplyTab> getDomainClass() {
    return testApplyTab.class;
  }

  @Override
  public Page<testApplyTabDTO> findBy(
      @Param("testApply") String testApply,
      @Param("orderNo") String orderNo,
      @Param("pageable") Pageable pageable) {
    testApplyTab obj = new testApplyTab();
    obj.setTestApply(testApply);
    obj.setOrderNo(orderNo);
    Example<testApplyTab> example = Example.of(obj);

    return findAll(example, pageable).map(testApplyTab.DTO_CONVERTER);
  }
}
