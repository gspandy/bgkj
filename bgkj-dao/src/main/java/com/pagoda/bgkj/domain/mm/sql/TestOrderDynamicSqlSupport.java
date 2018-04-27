package com.pagoda.bgkj.domain.mm.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.mm.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestOrder实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestOrderDynamicSqlSupport {

  public static TestOrderTable testorderTable = new TestOrderTable();
  public static SqlColumn<Long> id = testorderTable.id;
  public static SqlColumn<Long> deleted = testorderTable.deleted;
  public static SqlColumn<Boolean> enabled = testorderTable.enabled;
  public static SqlColumn<Long> parentId = testorderTable.parentId;
  public static SqlColumn<Date> createdAt = testorderTable.createdAt;
  public static SqlColumn<String> createdBy = testorderTable.createdBy;
  public static SqlColumn<String> creatorOrgCode = testorderTable.creatorOrgCode;
  public static SqlColumn<String> lastModifiedAt = testorderTable.lastModifiedAt;
  public static SqlColumn<String> lastModifiedBy = testorderTable.lastModifiedBy;
  public static SqlColumn<String> modifierOrgCode = testorderTable.modifierOrgCode;
  public static SqlColumn<Integer> version = testorderTable.version;
  public static SqlColumn<Boolean> active = testorderTable.active;
  public static SqlColumn<Integer> approvalStatus = testorderTable.approvalStatus;
  public static SqlColumn<Date> approvalAt = testorderTable.approvalAt;
  public static SqlColumn<String> approver = testorderTable.approver;
  public static SqlColumn<Integer> orderStatus = testorderTable.orderStatus;
  public static SqlColumn<String> orderNo = testorderTable.orderNo;
  public static SqlColumn<Integer> productCount = testorderTable.productCount;
  public static SqlColumn<Integer> shopId = testorderTable.shopId;

  public static final class TestOrderTable extends SqlTable {
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
    public final SqlColumn<Integer> orderStatus = column("orderStatus", JDBCType.INTEGER);
    public final SqlColumn<String> orderNo = column("orderNo", JDBCType.VARCHAR);
    public final SqlColumn<Integer> productCount = column("productCount", JDBCType.INTEGER);
    public final SqlColumn<Integer> shopId = column("shopId", JDBCType.INTEGER);

    public TestOrderTable() {
      super("TestOrder");
    }
  }
}
