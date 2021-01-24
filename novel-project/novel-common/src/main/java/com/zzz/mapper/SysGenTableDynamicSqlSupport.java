package com.zzz.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysGenTableDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SysGenTable sysGenTable = new SysGenTable();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = sysGenTable.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tableName = sysGenTable.tableName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> className = sysGenTable.className;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> comments = sysGenTable.comments;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> category = sysGenTable.category;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> packageName = sysGenTable.packageName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> moduleName = sysGenTable.moduleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> subModuleName = sysGenTable.subModuleName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> functionName = sysGenTable.functionName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> functionNameSimple = sysGenTable.functionNameSimple;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> author = sysGenTable.author;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> srcDir = sysGenTable.srcDir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> options = sysGenTable.options;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> createBy = sysGenTable.createBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createDate = sysGenTable.createDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> updateBy = sysGenTable.updateBy;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updateDate = sysGenTable.updateDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> remarks = sysGenTable.remarks;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SysGenTable extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> className = column("class_name", JDBCType.VARCHAR);

        public final SqlColumn<String> comments = column("comments", JDBCType.VARCHAR);

        public final SqlColumn<Byte> category = column("category", JDBCType.TINYINT);

        public final SqlColumn<String> packageName = column("package_name", JDBCType.VARCHAR);

        public final SqlColumn<String> moduleName = column("module_name", JDBCType.VARCHAR);

        public final SqlColumn<String> subModuleName = column("sub_module_name", JDBCType.VARCHAR);

        public final SqlColumn<String> functionName = column("function_name", JDBCType.VARCHAR);

        public final SqlColumn<String> functionNameSimple = column("function_name_simple", JDBCType.VARCHAR);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public final SqlColumn<String> srcDir = column("src_dir", JDBCType.VARCHAR);

        public final SqlColumn<String> options = column("options", JDBCType.VARCHAR);

        public final SqlColumn<Long> createBy = column("create_by", JDBCType.BIGINT);

        public final SqlColumn<Date> createDate = column("create_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> updateBy = column("update_by", JDBCType.BIGINT);

        public final SqlColumn<Date> updateDate = column("update_date", JDBCType.TIMESTAMP);

        public final SqlColumn<String> remarks = column("remarks", JDBCType.VARCHAR);

        public SysGenTable() {
            super("sys_gen_table");
        }
    }
}