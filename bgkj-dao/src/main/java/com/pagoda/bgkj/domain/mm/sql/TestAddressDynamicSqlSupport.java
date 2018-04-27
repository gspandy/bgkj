package com.pagoda.bgkj.domain.mm.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.mm.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestAddress实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestAddressDynamicSqlSupport {

  public static TestAddressTable testaddressTable = new TestAddressTable();
  public static SqlColumn<Long> id = testaddressTable.id;
  public static SqlColumn<Long> deleted = testaddressTable.deleted;
  public static SqlColumn<Boolean> enabled = testaddressTable.enabled;
  public static SqlColumn<Long> parentId = testaddressTable.parentId;
  public static SqlColumn<Date> createdAt = testaddressTable.createdAt;
  public static SqlColumn<String> createdBy = testaddressTable.createdBy;
  public static SqlColumn<String> creatorOrgCode = testaddressTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = testaddressTable.lastModifiedAt;
  public static SqlColumn<String> lastModifiedBy = testaddressTable.lastModifiedBy;
  public static SqlColumn<String> modifierOrgCode = testaddressTable.modifierOrgCode;
  public static SqlColumn<Integer> version = testaddressTable.version;
  public static SqlColumn<Boolean> active = testaddressTable.active;
  public static SqlColumn<Integer> approvalStatus = testaddressTable.approvalStatus;
  public static SqlColumn<Date> approvalAt = testaddressTable.approvalAt;
  public static SqlColumn<String> approver = testaddressTable.approver;
  public static SqlColumn<String> orderNo = testaddressTable.orderNo;
  public static SqlColumn<String> status = testaddressTable.status;

  public static final class TestAddressTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<Long> parentId = column("parentId", JDBCType.BIGINT);
    public final SqlColumn<Date> createdAt = column("createdAt", JDBCType.DATE);
    public final SqlColumn<String> createdBy = column("createdBy", JDBCType.VARCHAR);
    public final SqlColumn<String> creatorOrgCode = column("creatorOrgCode", JDBCType.VARCHAR);
    public final SqlColumn<String> lastModifiedAt = column("lastModifiedAt", JDBCType.DATE);
    public final SqlColumn<String> lastModifiedBy = column("lastModifiedBy", JDBCType.VARCHAR);
    public final SqlColumn<String> modifierOrgCode = column("modifierOrgCode", JDBCType.VARCHAR);
    public final SqlColumn<Integer> version = column("version", JDBCType.INTEGER);
    public final SqlColumn<Boolean> active = column("active", JDBCType.BOOLEAN);
    public final SqlColumn<Integer> approvalStatus = column("approvalStatus", JDBCType.INTEGER);
    public final SqlColumn<Date> approvalAt = column("approvalAt", JDBCType.DATE);
    public final SqlColumn<String> approver = column("approver", JDBCType.VARCHAR);
    public final SqlColumn<String> orderNo = column("orderNo", JDBCType.VARCHAR);
    public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

    public TestAddressTable() {
      super("TestAddress");
    }
  }
}
