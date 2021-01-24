package com.zzz.mapper;

import static com.zzz.mapper.SysGenColumnsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysGenColumns;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SysGenColumnsMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, tableName, columnName, columnType, javaType, columnComment, columnSort, columnLabel, pageType, isRequired, dictType);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysGenColumns> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysGenColumns> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysGenColumnsResult")
    Optional<SysGenColumns> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysGenColumnsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_name", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.VARCHAR),
        @Result(column="java_type", property="javaType", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_comment", property="columnComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_sort", property="columnSort", jdbcType=JdbcType.TINYINT),
        @Result(column="column_label", property="columnLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="page_type", property="pageType", jdbcType=JdbcType.TINYINT),
        @Result(column="is_required", property="isRequired", jdbcType=JdbcType.TINYINT),
        @Result(column="dict_type", property="dictType", jdbcType=JdbcType.VARCHAR)
    })
    List<SysGenColumns> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysGenColumns record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenColumns, c ->
            c.map(id).toProperty("id")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(columnType).toProperty("columnType")
            .map(javaType).toProperty("javaType")
            .map(columnComment).toProperty("columnComment")
            .map(columnSort).toProperty("columnSort")
            .map(columnLabel).toProperty("columnLabel")
            .map(pageType).toProperty("pageType")
            .map(isRequired).toProperty("isRequired")
            .map(dictType).toProperty("dictType")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysGenColumns> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysGenColumns, c ->
            c.map(id).toProperty("id")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(columnType).toProperty("columnType")
            .map(javaType).toProperty("javaType")
            .map(columnComment).toProperty("columnComment")
            .map(columnSort).toProperty("columnSort")
            .map(columnLabel).toProperty("columnLabel")
            .map(pageType).toProperty("pageType")
            .map(isRequired).toProperty("isRequired")
            .map(dictType).toProperty("dictType")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysGenColumns record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenColumns, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(columnType).toPropertyWhenPresent("columnType", record::getColumnType)
            .map(javaType).toPropertyWhenPresent("javaType", record::getJavaType)
            .map(columnComment).toPropertyWhenPresent("columnComment", record::getColumnComment)
            .map(columnSort).toPropertyWhenPresent("columnSort", record::getColumnSort)
            .map(columnLabel).toPropertyWhenPresent("columnLabel", record::getColumnLabel)
            .map(pageType).toPropertyWhenPresent("pageType", record::getPageType)
            .map(isRequired).toPropertyWhenPresent("isRequired", record::getIsRequired)
            .map(dictType).toPropertyWhenPresent("dictType", record::getDictType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenColumns> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenColumns> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenColumns> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenColumns> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysGenColumns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysGenColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(columnType).equalTo(record::getColumnType)
                .set(javaType).equalTo(record::getJavaType)
                .set(columnComment).equalTo(record::getColumnComment)
                .set(columnSort).equalTo(record::getColumnSort)
                .set(columnLabel).equalTo(record::getColumnLabel)
                .set(pageType).equalTo(record::getPageType)
                .set(isRequired).equalTo(record::getIsRequired)
                .set(dictType).equalTo(record::getDictType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysGenColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(columnType).equalToWhenPresent(record::getColumnType)
                .set(javaType).equalToWhenPresent(record::getJavaType)
                .set(columnComment).equalToWhenPresent(record::getColumnComment)
                .set(columnSort).equalToWhenPresent(record::getColumnSort)
                .set(columnLabel).equalToWhenPresent(record::getColumnLabel)
                .set(pageType).equalToWhenPresent(record::getPageType)
                .set(isRequired).equalToWhenPresent(record::getIsRequired)
                .set(dictType).equalToWhenPresent(record::getDictType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysGenColumns record) {
        return update(c ->
            c.set(tableName).equalTo(record::getTableName)
            .set(columnName).equalTo(record::getColumnName)
            .set(columnType).equalTo(record::getColumnType)
            .set(javaType).equalTo(record::getJavaType)
            .set(columnComment).equalTo(record::getColumnComment)
            .set(columnSort).equalTo(record::getColumnSort)
            .set(columnLabel).equalTo(record::getColumnLabel)
            .set(pageType).equalTo(record::getPageType)
            .set(isRequired).equalTo(record::getIsRequired)
            .set(dictType).equalTo(record::getDictType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysGenColumns record) {
        return update(c ->
            c.set(tableName).equalToWhenPresent(record::getTableName)
            .set(columnName).equalToWhenPresent(record::getColumnName)
            .set(columnType).equalToWhenPresent(record::getColumnType)
            .set(javaType).equalToWhenPresent(record::getJavaType)
            .set(columnComment).equalToWhenPresent(record::getColumnComment)
            .set(columnSort).equalToWhenPresent(record::getColumnSort)
            .set(columnLabel).equalToWhenPresent(record::getColumnLabel)
            .set(pageType).equalToWhenPresent(record::getPageType)
            .set(isRequired).equalToWhenPresent(record::getIsRequired)
            .set(dictType).equalToWhenPresent(record::getDictType)
            .where(id, isEqualTo(record::getId))
        );
    }
}