package com.pagoda.bgkj.domain.mm.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.mm.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestUser实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestUserDynamicSqlSupport {

  public static TestUserTable testuserTable = new TestUserTable();
  public static SqlColumn<Long> id = testuserTable.id;
  public static SqlColumn<Long> deleted = testuserTable.deleted;
  public static SqlColumn<Boolean> enabled = testuserTable.enabled;
  public static SqlColumn<Long> parentId = testuserTable.parentId;
  public static SqlColumn<Date> createdAt = testuserTable.createdAt;
  public static SqlColumn<String> createdBy = testuserTable.createdBy;
  public static SqlColumn<String> creatorOrgCode = testuserTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = testuserTable.lastModifiedAt;
  public static SqlColumn<String> lastModifiedBy = testuserTable.lastModifiedBy;
  public static SqlColumn<String> modifierOrgCode = testuserTable.modifierOrgCode;
  public static SqlColumn<Integer> version = testuserTable.version;
  public static SqlColumn<Boolean> active = testuserTable.active;
  public static SqlColumn<Integer> approvalStatus = testuserTable.approvalStatus;
  public static SqlColumn<Date> approvalAt = testuserTable.approvalAt;
  public static SqlColumn<String> approver = testuserTable.approver;
  public static SqlColumn<String> phone = testuserTable.phone;
  public static SqlColumn<String> userName = testuserTable.userName;

  public static final class TestUserTable extends SqlTable {
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
    public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);
    public final SqlColumn<String> userName = column("userName", JDBCType.VARCHAR);

    public TestUserTable() {
      super("TestUser");
    }
  }
}
