package com.zzz.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysGenTableColumnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysGenTableColumn sysGenTableColumn = new SysGenTableColumn();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = sysGenTableColumn.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> tableId = sysGenTableColumn.tableId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnName = sysGenTableColumn.columnName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> columnSort = sysGenTableColumn.columnSort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnType = sysGenTableColumn.columnType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnLabel = sysGenTableColumn.columnLabel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> comments = sysGenTableColumn.comments;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attrName = sysGenTableColumn.attrName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attrType = sysGenTableColumn.attrType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isPk = sysGenTableColumn.isPk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isNull = sysGenTableColumn.isNull;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isInsert = sysGenTableColumn.isInsert;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isUpdate = sysGenTableColumn.isUpdate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isList = sysGenTableColumn.isList;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isQuery = sysGenTableColumn.isQuery;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> queryType = sysGenTableColumn.queryType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isEdit = sysGenTableColumn.isEdit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> showType = sysGenTableColumn.showType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> options = sysGenTableColumn.options;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysGenTableColumn extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> tableId = column("table_id", JDBCType.BIGINT);

        public final SqlColumn<String> columnName = column("column_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> columnSort = column("column_sort", JDBCType.DECIMAL);

        public final SqlColumn<String> columnType = column("column_type", JDBCType.VARCHAR);

        public final SqlColumn<String> columnLabel = column("column_label", JDBCType.VARCHAR);

        public final SqlColumn<String> comments = column("comments", JDBCType.VARCHAR);

        public final SqlColumn<String> attrName = column("attr_name", JDBCType.VARCHAR);

        public final SqlColumn<String> attrType = column("attr_type", JDBCType.VARCHAR);

        public final SqlColumn<String> isPk = column("is_pk", JDBCType.CHAR);

        public final SqlColumn<String> isNull = column("is_null", JDBCType.CHAR);

        public final SqlColumn<String> isInsert = column("is_insert", JDBCType.CHAR);

        public final SqlColumn<String> isUpdate = column("is_update", JDBCType.CHAR);

        public final SqlColumn<String> isList = column("is_list", JDBCType.CHAR);

        public final SqlColumn<String> isQuery = column("is_query", JDBCType.CHAR);

        public final SqlColumn<String> queryType = column("query_type", JDBCType.VARCHAR);

        public final SqlColumn<String> isEdit = column("is_edit", JDBCType.CHAR);

        public final SqlColumn<String> showType = column("show_type", JDBCType.VARCHAR);

        public final SqlColumn<String> options = column("options", JDBCType.VARCHAR);

        public SysGenTableColumn() {
            super("sys_gen_table_column");
        }
    }
}