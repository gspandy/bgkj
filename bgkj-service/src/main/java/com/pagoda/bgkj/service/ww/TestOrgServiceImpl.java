package com.pagoda.bgkj.service.ww;

import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.service.ww.base.*;
import com.pagoda.bgkj.api.*;
import com.pagoda.bgkj.api.ww.*;
import com.pagoda.bgkj.api.dto.ww.*;
import com.pagoda.bgkj.domain.ww.*;
import com.pagoda.bgkj.repo.ww.*;
import com.pagoda.platform.jms.util.SqlWrapper;
import static com.pagoda.bgkj.domain.ww.sql.TestOrgDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.update;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import io.swagger.annotations.*;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * TestOrg服务实现类TestOrgServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class TestOrgServiceImpl extends BaseTestOrgServiceImpl {

  /*  // 动态sql演示，正式的sql需要在开发平台定义 ， 参考 https://blog.olowolo.com/post/new-mybatis-dynamic-sql/
   public Page<TestOrgDTO> dynamicSqlSelectTest(@ApiParam("nameVal") String nameVal){
        // 开发测试
        // 方法 1, 注意生产环境不要使用字符串拼接构造sql，避免注入攻击
        Page<TestOrgDTO> result1 = repository.dynamicSelectPage(SqlWrapper.asSelect("select * from TestOrg"), new PageParam(0, 10), TestOrgDTO.class);
        System.out.println(result1);
        // 方法 2
        SelectStatementProvider selectStatement = select(id)
                .from(testorgTable)
                .build()
                .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
        Page<TestOrgDTO> result2 =  repository.dynamicSelectPage(selectStatement, new PageParam(0, 10), TestOrgDTO.class);
        System.out.println(result2);
        return result1;
   }

   @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
   public void dynamicSqlUpdateTest(@ApiParam("idVal")Long idVal, @ApiParam("nameVal") String nameVal) {
      // 开发测试sql更新
      // 方法 1，注意生产环境不要使用字符串拼接构造sql，避免注入攻击
      int ret1 = repository.dynamicUpdate(SqlWrapper.asUpdate("update TestOrg set name=\"" + nameVal + "\" where id=" + idVal));

      // 方法 2
      UpdateStatementProvider updateStatement = SqlBuilder.update(testorgTable).set(name).equalTo(nameVal).where(id, isEqualTo(idVal))
              .build()
              .render(RenderingStrategy.SPRING_NAMED_PARAMETER);
      int ret2 = repository.dynamicUpdate(updateStatement);
  }
   */
}
