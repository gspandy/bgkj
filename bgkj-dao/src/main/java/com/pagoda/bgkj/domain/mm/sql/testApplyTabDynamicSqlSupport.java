package com.pagoda.bgkj.domain.mm.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.mm.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * testApplyTab实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class testApplyTabDynamicSqlSupport {

  public static testApplyTabTable testapplytabTable = new testApplyTabTable();
  public static SqlColumn<Long> id = testapplytabTable.id;
  public static SqlColumn<Long> deleted = testapplytabTable.deleted;
  public static SqlColumn<Boolean> enabled = testapplytabTable.enabled;
  public static SqlColumn<Date> createdAt = testapplytabTable.createdAt;
  public static SqlColumn<String> createdBy = testapplytabTable.createdBy;
  public static SqlColumn<String> creatorOrgCode = testapplytabTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = testapplytabTable.lastModifiedAt;
  public static SqlColumn<String> lastModifiedBy = testapplytabTable.lastModifiedBy;
  public static SqlColumn<String> modifierOrgCode = testapplytabTable.modifierOrgCode;
  public static SqlColumn<Integer> version = testapplytabTable.version;
  public static SqlColumn<Boolean> active = testapplytabTable.active;
  public static SqlColumn<String> testApply = testapplytabTable.testApply;
  public static SqlColumn<String> orderNo = testapplytabTable.orderNo;

  public static final class testApplyTabTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<Date> createdAt = column("createdAt", JDBCType.DATE);
    public final SqlColumn<String> createdBy = column("createdBy", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creatorOrgCode", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("lastModifiedAt", JDBCType.DATE);
    public final SqlColumn<String> lastModifiedBy = column("lastModifiedBy", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifierOrgCode", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);
    public final SqlColumn<String> testApply = column("testApply", JDBCType.VARCHAR);
    public final SqlColumn<String> orderNo = column("orderNo", JDBCType.VARCHAR);

    public testApplyTabTable() {
      super("testApplyTab");
    }
  }
}
