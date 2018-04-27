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
 * TestUser扩展数据访问接口实现类
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestUserRepositoryImpl extends BaseRepositoryCustomImpl<TestUser, Long>
    implements TestUserRepositoryCustom {

  @Override
  protected Class<TestUser> getDomainClass() {
    return TestUser.class;
  }

  @Override
  public Page<TestUserDTO> findBy(
      @Param("phone") String phone,
      @Param("userName") String userName,
      @Param("pageable") Pageable pageable) {
    TestUser obj = new TestUser();
    obj.setPhone(phone);
    obj.setUserName(userName);
    Example<TestUser> example = Example.of(obj);

    return findAll(example, pageable).map(TestUser.DTO_CONVERTER);
  }
}
