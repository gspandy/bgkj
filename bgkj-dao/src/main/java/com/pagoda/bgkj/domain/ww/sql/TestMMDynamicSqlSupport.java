package com.pagoda.bgkj.domain.ww.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.ww.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestMM实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestMMDynamicSqlSupport {

  public static TestMMTable testmmTable = new TestMMTable();
  public static SqlColumn<Long> id = testmmTable.id;
  public static SqlColumn<Long> deleted = testmmTable.deleted;
  public static SqlColumn<Boolean> enabled = testmmTable.enabled;
  public static SqlColumn<String> status = testmmTable.status;

  public static final class TestMMTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

    public TestMMTable() {
      super("TestMM");
    }
  }
}
