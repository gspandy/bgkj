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
 * TestOrg扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestOrgRepositoryImpl extends BaseRepositoryCustomImpl<TestOrg, Long>
    implements TestOrgRepositoryCustom {

  @Override
  protected Class<TestOrg> getDomainClass() {
    return TestOrg.class;
  }

  @Override
  public Page<TestOrgDTO> findBy(@Param("orgId") Long orgId, @Param("pageable") Pageable pageable) {
    TestOrg obj = new TestOrg();
    obj.setOrgId(orgId);
    Example<TestOrg> example = Example.of(obj);

    return findAll(example, pageable).map(TestOrg.DTO_CONVERTER);
  }
}
