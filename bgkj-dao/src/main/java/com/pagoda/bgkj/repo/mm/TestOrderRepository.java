package com.pagoda.bgkj.repo.mm;

import com.pagoda.platform.jms.annotation.SqlTemplate;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.domain.mm.*;
import com.pagoda.bgkj.repo.mm.custom.*;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * TestOrderJPA数据访问接口
 * @author PagodaGenerator
 * @generated
 */
public interface TestOrderRepository extends TestOrderRepositoryCustom, PagodaJpaRepository<TestOrder,Long>  {

    /**
     * 通过shopid查询用户与订单信息
     * @param shopId
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findOrderAndUserById" , sql="SELECT t.productCount,u.phone,u.userName FROM TestOrder t,TestUser u WHERE t.shopId = u.id and t.shopId =:shopId")
    Page<FindOrderAndUserByIdDTO> findOrderAndUserById(@Param("shopId") Integer shopId,  @Param("pageable") Pageable pageable);

    /**
     * 通过shopid查询
     * @param shopId
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findOrderAndUserByShopId" , sql="SELECT t.active active,t.productCount,u.phone,u.userName FROM TestOrder t
LEFT JOIN TestUser u on t.shopId = u.id where t.shopId =:shopId")
    Page<FindOrderAndUserByShopIdDTO> findOrderAndUserByShopId(@Param("shopId") Integer shopId,  @Param("pageable") Pageable pageable);

    /**
     * 
     * @param shopId
     * @param pageable
     * @return
     */
    @SqlTemplate(name="findByShopId" , sql="SELECT t.productCount,u.phone,u.userName FROM TestOrder t,TestUser u WHERE t.shopId = u.id and t.shopId =:shopId")
    Page<FindByShopIdDTO> findByShopId(@Param("shopId") Integer shopId,  @Param("pageable") Pageable pageable);


    /**
     * 动态执行一个无参数的sql,返回分页的结果
     *
     * @param selectProvider   通过SqlWrapper.asSelect封装sql
     * @param pageable     分页，排序参数
     * @param <T>
     * @return
     */
    @SqlTemplate(name="dynamicSelectPage", dynamic=true)
    public <T> Page<T> dynamicSelectPage(@Param("selectProvider") SelectStatementProvider selectProvider, @Param("pageable") Pageable pageable, @Param("returnType") Class<T> returnType);


   /**
    * 动态执行一个无参数的sql,返回单个结果
    *
    * @param selectProvider   通过SqlWrapper.asSelect封装sql
    * @param <T>
    * @return
    */
    @SqlTemplate(name="dynamicSelectOne", dynamic=true, multiple=false)
    public <T> T dynamicSelectOne(@Param("selectProvider") SelectStatementProvider selectProvider, @Param("returnType") Class<T> returnType);

    /**
     * 动态执行一个无参数的sql update 语句
     *
     * @param updateProvider
     * @return
     */
    @SqlTemplate(name="dynamicUpdate", dynamic=true)
    @Modifying
    public int dynamicUpdate(@Param("updateProvider")UpdateStatementProvider updateProvider);
}