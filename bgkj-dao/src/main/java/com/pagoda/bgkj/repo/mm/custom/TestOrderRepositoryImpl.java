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
 * TestOrder扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestOrderRepositoryImpl extends BaseRepositoryCustomImpl<TestOrder, Long>
    implements TestOrderRepositoryCustom {

  @Override
  protected Class<TestOrder> getDomainClass() {
    return TestOrder.class;
  }

  @Override
  public Page<TestOrderDTO> findBy(
      @Param("orderStatus") Integer orderStatus,
      @Param("orderNo") String orderNo,
      @Param("productCount") Integer productCount,
      @Param("shopId") Integer shopId,
      @Param("pageable") Pageable pageable) {
    TestOrder obj = new TestOrder();
    obj.setOrderStatus(orderStatus);
    obj.setOrderNo(orderNo);
    obj.setProductCount(productCount);
    obj.setShopId(shopId);
    Example<TestOrder> example = Example.of(obj);

    return findAll(example, pageable).map(TestOrder.DTO_CONVERTER);
  }
}
