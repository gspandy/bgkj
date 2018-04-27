package com.pagoda.bgkj.domain.mm;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.mm.*;

import lombok.Data;
import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.hibernate.annotations.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TestOrder实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@ValidateProperties(rulePrefix = "validator.TestOrder")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`TestOrder`")
@org.hibernate.annotations.Table(appliesTo = "`TestOrder`", comment = "TestOrder")
@SQLDelete(sql = "update `TestOrder` set deleted = id where id = ? and version = ?")
@Where(clause = "deleted = 0")
@EntityListeners({AuditingEntityListener.class, PagodaEntityListener.class})
@EntityFeature(
  entityName = "TestOrder",
  idField = "id",
  persistent = true,
  generationType = "auto",
  batchImport = true,
  treeStyle = true,
  auditable = true,
  traceable = true,
  approvalRequired = true,
  requestUrl = "",
  tableMultiSelect = true
)
public class TestOrder extends TestOrderDTO implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @FieldMeta(
    name = "id",
    nameCN = "主键id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  private Long id;

  @FieldMeta(
    name = "deleted",
    nameCN = "软删除标记",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(
    name = "deleted",
    insertable = false,
    columnDefinition = "bigint default 0 COMMENT '软删除标记'"
  )
  private Long deleted = 0L;

  @FieldMeta(name = "enabled", nameCN = "是否启用", type = "boolean", visible = true, canQuery = false)
  @Column(
    name = "enabled",
    insertable = false,
    columnDefinition = "boolean default 1 COMMENT '是否启用'"
  )
  private Boolean enabled = true;

  @FieldMeta(
    name = "parentId",
    nameCN = "父节点id",
    type = "long",
    visible = false,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "parentId", columnDefinition = "bigint(20) COMMENT '父节点id'")
  private Long parentId;

  @FieldMeta(
    name = "createdAt",
    nameCN = "创建时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "createdAt", updatable = false, columnDefinition = "datetime COMMENT '创建时间'")
  @CreatedDate
  private Date createdAt;

  @FieldMeta(
    name = "createdBy",
    nameCN = "创建人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "createdBy", columnDefinition = "varchar(30) COMMENT '创建人'")
  @CreatedBy
  private String createdBy;

  @FieldMeta(
    name = "creatorOrgCode",
    nameCN = "创建人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "creatorOrgCode", columnDefinition = "varchar(200) COMMENT '创建人所属部门'")
  private String creatorOrgCode;

  @FieldMeta(
    name = "lastModifiedAt",
    nameCN = "最近修改时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "lastModifiedAt", columnDefinition = "datetime COMMENT '最近修改时间'")
  @LastModifiedDate
  private Date lastModifiedAt;

  @FieldMeta(
    name = "lastModifiedBy",
    nameCN = "最近修改人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "lastModifiedBy", columnDefinition = "varchar(30) COMMENT '最近修改人'")
  @LastModifiedBy
  private String lastModifiedBy;

  @FieldMeta(
    name = "modifierOrgCode",
    nameCN = "修改人所属部门",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "modifierOrgCode", columnDefinition = "varchar(200) COMMENT '修改人所属部门'")
  private String modifierOrgCode;

  @FieldMeta(
    name = "version",
    nameCN = "版本号",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "version", columnDefinition = "int(11) COMMENT '版本号'")
  @Version
  private Integer version;

  @FieldMeta(
    name = "active",
    nameCN = "是否当前版本",
    type = "boolean",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(
    name = "active",
    insertable = false,
    columnDefinition = "boolean default 1 COMMENT '是否当前版本'"
  )
  private Boolean active = true;

  @FieldMeta(
    name = "approvalStatus",
    nameCN = "审核状态",
    type = "integer",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "approvalStatus", columnDefinition = "int(11) COMMENT '审核状态'")
  private Integer approvalStatus;

  @FieldMeta(
    name = "approvalAt",
    nameCN = "审核时间",
    type = "datetime",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "approvalAt", columnDefinition = "datetime COMMENT '审核时间'")
  private Date approvalAt;

  @FieldMeta(
    name = "approver",
    nameCN = "审核人",
    type = "string",
    visible = true,
    canQuery = false,
    readOnly = true
  )
  @Column(name = "approver", columnDefinition = "varchar(30) COMMENT '审核人'")
  private String approver;

  @FieldMeta(
    name = "orderStatus",
    scene = "",
    nameCN = "订单状态",
    comment = "订单状态",
    nameEN = "orderStatus",
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
  @Column(name = "\"orderStatus\"", length = 11, columnDefinition = "int(11) COMMENT '订单状态'")
  private Integer orderStatus;

  @FieldMeta(
    name = "orderNo",
    scene = "",
    nameCN = "订单号",
    comment = "订单号",
    nameEN = "orderNo",
    type = "字符串",
    format = "",
    displayLen = 100,
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
  @Column(name = "\"orderNo\"", length = 100, columnDefinition = "varchar(100) COMMENT '订单号'")
  private String orderNo;

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
  @Column(name = "\"productCount\"", length = 11, columnDefinition = "int(11) COMMENT '商品数量'")
  private Integer productCount;

  @FieldMeta(
    name = "shopId",
    scene = "",
    nameCN = "商店id",
    comment = "商店id",
    nameEN = "shopId",
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
  @Column(name = "\"shopId\"", length = 11, columnDefinition = "int(11) COMMENT '商店id'")
  private Integer shopId;

  public TestOrder() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(TestOrder.class, TestOrderDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static TestOrder convertDTO(TestOrderDTO dto) {
    return mapper.map(dto, TestOrder.class);
  }

  public static Iterable<TestOrder> batchConvertDTO(Iterable<TestOrderDTO> dtos) {
    List<TestOrder> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<TestOrderDTO> batchConvert(Iterable<TestOrder> entities) {
    List<TestOrderDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<TestOrder, TestOrderDTO> DTO_CONVERTER =
      new Converter<TestOrder, TestOrderDTO>() {

        @Override
        public TestOrderDTO convert(TestOrder source) {
          return source;
        }
      };
}
