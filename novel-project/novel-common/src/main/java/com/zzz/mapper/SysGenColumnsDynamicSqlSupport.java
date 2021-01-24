package com.zzz.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysGenColumnsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysGenColumns sysGenColumns = new SysGenColumns();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = sysGenColumns.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tableName = sysGenColumns.tableName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnName = sysGenColumns.columnName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnType = sysGenColumns.columnType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> javaType = sysGenColumns.javaType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnComment = sysGenColumns.columnComment;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> columnSort = sysGenColumns.columnSort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> columnLabel = sysGenColumns.columnLabel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> pageType = sysGenColumns.pageType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> isRequired = sysGenColumns.isRequired;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dictType = sysGenColumns.dictType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysGenColumns extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("column_name", JDBCType.VARCHAR);

        public final SqlColumn<String> columnType = column("column_type", JDBCType.VARCHAR);

        public final SqlColumn<String> javaType = column("java_type", JDBCType.VARCHAR);

        public final SqlColumn<String> columnComment = column("column_comment", JDBCType.VARCHAR);

        public final SqlColumn<Byte> columnSort = column("column_sort", JDBCType.TINYINT);

        public final SqlColumn<String> columnLabel = column("column_label", JDBCType.VARCHAR);

        public final SqlColumn<Byte> pageType = column("page_type", JDBCType.TINYINT);

        public final SqlColumn<Byte> isRequired = column("is_required", JDBCType.TINYINT);

        public final SqlColumn<String> dictType = column("dict_type", JDBCType.VARCHAR);

        public SysGenColumns() {
            super("sys_gen_columns");
        }
    }
}