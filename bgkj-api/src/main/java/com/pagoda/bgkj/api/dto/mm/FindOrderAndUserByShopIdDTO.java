package com.pagoda.bgkj.api.dto.mm;

import com.pagoda.bgkj.api.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pagoda.platform.jms.annotation.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.*;

/**
 * 查询方法返回的DTO对象
 *
 * @author PagodaGenerator
 * @generated
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ApiModel(value = "FindOrderAndUserByShopIdDTO", description = "通过shopid查询")
@EntityFeature(
  entityName = "FindOrderAndUserByShopIdDTO",
  persistent = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class FindOrderAndUserByShopIdDTO implements Serializable {
  @FieldMeta(
    name = "phone",
    scene = "phone",
    nameCN = "用户电话",
    comment = "用户电话",
    nameEN = "phone",
    type = "字符串",
    format = "",
    displayLen = 11,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "phone",
    value = "用户电话",
    dataType = "字符串",
    notes = "5adaf3917c51e0fcf5c234cc"
  )
  private String phone;

  @FieldMeta(
    name = "productCount",
    scene = "",
    nameCN = "商品数量",
    comment = "商品数量",
    nameEN = "productCount",
    type = "整型",
    format = "",
    displayLen = 11,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "productCount",
    value = "商品数量",
    dataType = "整型",
    notes = "5ad99bfb7c51e0fcf5b2a928"
  )
  private Integer productCount;

  @FieldMeta(
    name = "userName",
    scene = "userName",
    nameCN = "用户名",
    comment = "用户名",
    nameEN = "userName",
    type = "字符串",
    format = "",
    displayLen = 40,
    formSize = "",
    constraint = "",
    constraintParams = "",
    persistent = true,
    canQuery = true,
    readOnly = false,
    required = false,
    visible = true,
    defaultValue = "",
    tag = "",
    sortable = false,
    total = false,
    pageTotal = false,
    enumerationType = false,
    constraintParamsExtra = "",
    fixed = "",
    sensitive = false,
    index = 0
  )
  @ApiModelProperty(
    name = "userName",
    value = "用户名",
    dataType = "字符串",
    notes = "5adaf3727c51e0fcf5c234bd"
  )
  private String userName;
}
