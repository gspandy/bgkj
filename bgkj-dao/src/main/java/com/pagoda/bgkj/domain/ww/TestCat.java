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
 * TestCat实体定义
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
@ValidateProperties(rulePrefix = "validator.TestCat")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "`TestCat`")
@org.hibernate.annotations.Table(appliesTo = "`TestCat`", comment = "TestCat")
@SQLDelete(sql = "update `TestCat` set deleted = id where id = ?")
@Where(clause = "deleted = 0")
@EntityFeature(
  entityName = "TestCat",
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
public class TestCat extends TestCatDTO implements Serializable {

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

  public TestCat() {}

  static MapperFacade mapper;

  static {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    mapperFactory
        .classMap(TestCat.class, TestCatDTO.class)
        .mapNulls(false)
        .mapNullsInReverse(false)
        .byDefault()
        .register();
    mapper = mapperFactory.getMapperFacade();
  }

  public static TestCat convertDTO(TestCatDTO dto) {
    return mapper.map(dto, TestCat.class);
  }

  public static Iterable<TestCat> batchConvertDTO(Iterable<TestCatDTO> dtos) {
    List<TestCat> entities = new ArrayList<>();
    dtos.forEach(d -> entities.add(convertDTO(d)));
    return entities;
  }

  public static Iterable<TestCatDTO> batchConvert(Iterable<TestCat> entities) {
    List<TestCatDTO> dtos = new ArrayList<>();
    entities.forEach(e -> dtos.add(e));
    return dtos;
  }

  public static Converter<TestCat, TestCatDTO> DTO_CONVERTER =
      new Converter<TestCat, TestCatDTO>() {

        @Override
        public TestCatDTO convert(TestCat source) {
          return source;
        }
      };
}
