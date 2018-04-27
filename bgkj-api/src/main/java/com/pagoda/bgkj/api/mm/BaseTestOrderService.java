package com.pagoda.bgkj.api.mm;

import com.pagoda.bgkj.api.dto.mm.*;
import com.pagoda.bgkj.api.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Service继承的父接口,定义一些平台共用的方法
 *
 * @author PagodaGenerator
 * @generated
 */
@Validated
public interface BaseTestOrderService {

  /**
   * Create a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "create", notes = "新增一条记录")
  TestOrderDTO create(@ApiParam(value = "entity", required = true) @Valid TestOrderDTO entity)
      throws ServiceException;

  /**
   * Create all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchCreate", notes = "批量插入多条记录")
  Iterable<TestOrderDTO> batchCreate(
      @ApiParam(value = "entities", required = true) @Valid Iterable<TestOrderDTO> entities)
      throws ServiceException;

  /**
   * Update a given entity. Use the returned instance for further operations as the save operation
   * might have changed the entity instance completely.
   *
   * @param entity
   * @return the saved entity
   * @throws ServiceException
   */
  @ApiOperation(value = "update", notes = "更新一条记录")
  TestOrderDTO update(@ApiParam(value = "entity", required = true) TestOrderDTO entity)
      throws ServiceException;

  /**
   * Update all given entities.
   *
   * @param entities
   * @return the saved entities
   * @throws IllegalArgumentException in case the given entity is {@literal null}.
   * @throws ServiceException
   */
  @ApiOperation(value = "batchUpdate", notes = "批量更新多条记录")
  Iterable<TestOrderDTO> batchUpdate(
      @ApiParam(value = "entities", required = true) Iterable<TestOrderDTO> entities)
      throws ServiceException;

  /**
   * Deletes the entity with the given id.
   *
   * @param id must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "delete", notes = "删除一条记录")
  void delete(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * Deletes the entities in a batch with the given ids.
   *
   * @param ids must not be {@literal null}.
   * @throws IllegalArgumentException in case the given {@code ids} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "batchDelete", notes = "批量删除多条记录")
  void batchDelete(@ApiParam(value = "ids", required = true) Iterable<Long> ids)
      throws ServiceException;

  /**
   * Retrieves an entity by its id.
   *
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   * @throws IllegalArgumentException if {@code id} is {@literal null}
   * @throws ServiceException
   */
  @ApiOperation(value = "getById", notes = "根据id查询记录")
  TestOrderDTO getById(@ApiParam(value = "id", required = true) Long id) throws ServiceException;

  /**
   * 取得id之下的子树，以一个树形结构返回。
   *
   * @param id
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "getTree", notes = "取得id之下的子树，以一个树形结构返回")
  Iterable<TestOrderDTO> getTree(@ApiParam(value = "id", required = true) Long id)
      throws ServiceException;

  /**
   * 所有可查询的字段
   *
   * @param orderStatus
   * @param orderNo
   * @param productCount
   * @param shopId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findBy", notes = "根据非空字段查询")
  Page<TestOrderDTO> findBy(
      @ApiParam("orderStatus") Integer orderStatus,
      @ApiParam("orderNo") String orderNo,
      @ApiParam("productCount") Integer productCount,
      @ApiParam("shopId") Integer shopId,
      @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 通过shopid查询用户与订单信息
   *
   * @param shopId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findOrderAndUserById", notes = "")
  Page<FindOrderAndUserByIdDTO> findOrderAndUserById(
      @ApiParam("shopId") Integer shopId, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * 通过shopid查询
   *
   * @param shopId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findOrderAndUserByShopId", notes = "")
  Page<FindOrderAndUserByShopIdDTO> findOrderAndUserByShopId(
      @ApiParam("shopId") Integer shopId, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;

  /**
   * @param shopId
   * @param pageable
   * @return
   * @throws ServiceException
   */
  @ApiOperation(value = "findByShopId", notes = "")
  Page<FindByShopIdDTO> findByShopId(
      @ApiParam("shopId") Integer shopId, @ApiParam("pageable") Pageable pageable)
      throws ServiceException;
}
