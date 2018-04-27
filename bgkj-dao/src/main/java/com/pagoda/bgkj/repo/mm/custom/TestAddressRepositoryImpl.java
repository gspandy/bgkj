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
 * TestAddress扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestAddressRepositoryImpl extends BaseRepositoryCustomImpl<TestAddress, Long>
    implements TestAddressRepositoryCustom {

  @Override
  protected Class<TestAddress> getDomainClass() {
    return TestAddress.class;
  }

  @Override
  public Page<TestAddressDTO> findBy(
      @Param("orderNo") String orderNo,
      @Param("status") String status,
      @Param("pageable") Pageable pageable) {
    TestAddress obj = new TestAddress();
    obj.setOrderNo(orderNo);
    obj.setStatus(status);
    Example<TestAddress> example = Example.of(obj);

    return findAll(example, pageable).map(TestAddress.DTO_CONVERTER);
  }
}
