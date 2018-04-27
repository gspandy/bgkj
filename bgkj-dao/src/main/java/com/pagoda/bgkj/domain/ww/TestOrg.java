package com.pagoda.bgkj.domain.ww;

import com.pagoda.platform.jms.annotation.*;
import com.pagoda.platform.jms.hibernate.SnowflakeGenerator;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.bgkj.api.dto.ww.*;

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
 * TestOrg实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@ValidateProperties(rulePrefix = "validator.TestOrg")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`TestOrg`")
@org.hibernate.annotations.Table(appliesTo = "`TestOrg`", comment = "TestOrg")
@SQLDelete(sql = "update `TestOrg` set deleted = id where id = ?")
@Where(clause = "deleted = 0")
@EntityFeature(
  entityName = "TestOrg",
  idField = "id",
  persistent = true,
  generationType = "",
  batchImport = false,
  treeStyle = false,
  auditable = false,
  traceable = false,
  approvalRequired = false,
  requestUrl = "",
  tableMultiSelect = false
)
public class TestOrg extends TestOrgDTO implements Serializable {

  @Id
  @GenericGenerator(name = "", strategy = "")
  @GeneratedValue(generator = "")
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
    name = "orgId",
    scene = "orgId",
    nameCN = "orgId",
    comment = "orgId",
    nameEN = "orgId",
    type = "长整型",
    format = "",
    displayLen = 1,
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
  @Column(name = "\"orgId\"", columnDefinition = "bigint(20) COMMENT 'orgId'")
  private Long orgId;

  public TestOrg() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(TestOrg.class, TestOrgDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static TestOrg convertDTO(TestOrgDTO dto) {
    return mapper.map(dto, TestOrg.class);
  }

  public static Iterable<TestOrg> batchConvertDTO(Iterable<TestOrgDTO> dtos) {
    List<TestOrg> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<TestOrgDTO> batchConvert(Iterable<TestOrg> entities) {
    List<TestOrgDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<TestOrg, TestOrgDTO> DTO_CONVERTER =
      new Converter<TestOrg, TestOrgDTO>() {

        @Override
        public TestOrgDTO convert(TestOrg source) {
          return source;
        }
      };
}
