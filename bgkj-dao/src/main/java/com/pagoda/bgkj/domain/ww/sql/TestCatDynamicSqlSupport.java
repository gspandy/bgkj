package com.pagoda.bgkj.domain.ww.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.ww.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestCat实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestCatDynamicSqlSupport {

  public static TestCatTable testcatTable = new TestCatTable();
  public static SqlColumn<Long> id = testcatTable.id;
  public static SqlColumn<Long> deleted = testcatTable.deleted;
  public static SqlColumn<Boolean> enabled = testcatTable.enabled;
  public static SqlColumn<Long> orgId = testcatTable.orgId;

  public static final class TestCatTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<Long> orgId = column("orgId", JDBCType.BIGINT);

    public TestCatTable() {
      super("TestCat");
    }
  }
}
