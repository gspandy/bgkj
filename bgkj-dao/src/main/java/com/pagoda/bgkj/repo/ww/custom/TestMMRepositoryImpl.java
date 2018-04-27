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
 * TestMM扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestMMRepositoryImpl extends BaseRepositoryCustomImpl<TestMM, Long>
    implements TestMMRepositoryCustom {

  @Override
  protected Class<TestMM> getDomainClass() {
    return TestMM.class;
  }

  @Override
  public Page<TestMMDTO> findBy(
      @Param("status") String status, @Param("pageable") Pageable pageable) {
    TestMM obj = new TestMM();
    obj.setStatus(status);
    Example<TestMM> example = Example.of(obj);

    return findAll(example, pageable).map(TestMM.DTO_CONVERTER);
  }
}
