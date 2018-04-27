package com.pagoda.bgkj.domain.ww.sql;

import lombok.Data;
import java.sql.JDBCType;
import java.util.Date;

import com.pagoda.bgkj.domain.ww.*;
import org.mybatis.dynamic.sql.*;
import org.mybatis.dynamic.sql.SqlTable;

/**
 * TestOrg实体表定义
 *
 * @author PagodaGenerator
 * @generated
 */
public class TestOrgDynamicSqlSupport {

  public static TestOrgTable testorgTable = new TestOrgTable();
  public static SqlColumn<Long> id = testorgTable.id;
  public static SqlColumn<Long> deleted = testorgTable.deleted;
  public static SqlColumn<Boolean> enabled = testorgTable.enabled;
  public static SqlColumn<Long> orgId = testorgTable.orgId;

  public static final class TestOrgTable extends SqlTable {
    public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

    public final SqlColumn<Long> deleted = column("deleted", JDBCType.BIGINT);
    public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BOOLEAN);
    public final SqlColumn<Long> orgId = column("orgId", JDBCType.BIGINT);

    public TestOrgTable() {
      super("TestOrg");
    }
  }
}
