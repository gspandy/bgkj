package com.pagoda.bgkj.repo.ww.custom;

import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.domain.ww.*;
import com.pagoda.platform.jms.jpa.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * TestCat扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestCatRepositoryImpl extends BaseRepositoryCustomImpl<TestCat, Long>
    implements TestCatRepositoryCustom {

  @Override
  protected Class<TestCat> getDomainClass() {
    return TestCat.class;
  }

  @Override
  public Page<TestCatDTO> findBy(@Param("orgId") Long orgId, @Param("pageable") Pageable pageable) {
    TestCat obj = new TestCat();
    obj.setOrgId(orgId);
    Example<TestCat> example = Example.of(obj);

    return findAll(example, pageable).map(TestCat.DTO_CONVERTER);
  }
}
