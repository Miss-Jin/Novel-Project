package com.zzz.mapper;

import static com.zzz.mapper.SysGenTableColumnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysGenTableColumn;
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
public interface SysGenTableColumnMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, tableId, columnName, columnSort, columnType, columnLabel, comments, attrName, attrType, isPk, isNull, isInsert, isUpdate, isList, isQuery, queryType, isEdit, showType, options);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysGenTableColumn> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysGenTableColumn> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysGenTableColumnResult")
    Optional<SysGenTableColumn> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysGenTableColumnResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_id", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="column_name", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_sort", property="columnSort", jdbcType=JdbcType.DECIMAL),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_label", property="columnLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="comments", property="comments", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_name", property="attrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_pk", property="isPk", jdbcType=JdbcType.CHAR),
        @Result(column="is_null", property="isNull", jdbcType=JdbcType.CHAR),
        @Result(column="is_insert", property="isInsert", jdbcType=JdbcType.CHAR),
        @Result(column="is_update", property="isUpdate", jdbcType=JdbcType.CHAR),
        @Result(column="is_list", property="isList", jdbcType=JdbcType.CHAR),
        @Result(column="is_query", property="isQuery", jdbcType=JdbcType.CHAR),
        @Result(column="query_type", property="queryType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_edit", property="isEdit", jdbcType=JdbcType.CHAR),
        @Result(column="show_type", property="showType", jdbcType=JdbcType.VARCHAR),
        @Result(column="options", property="options", jdbcType=JdbcType.VARCHAR)
    })
    List<SysGenTableColumn> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysGenTableColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenTableColumn, c ->
            c.map(id).toProperty("id")
            .map(tableId).toProperty("tableId")
            .map(columnName).toProperty("columnName")
            .map(columnSort).toProperty("columnSort")
            .map(columnType).toProperty("columnType")
            .map(columnLabel).toProperty("columnLabel")
            .map(comments).toProperty("comments")
            .map(attrName).toProperty("attrName")
            .map(attrType).toProperty("attrType")
            .map(isPk).toProperty("isPk")
            .map(isNull).toProperty("isNull")
            .map(isInsert).toProperty("isInsert")
            .map(isUpdate).toProperty("isUpdate")
            .map(isList).toProperty("isList")
            .map(isQuery).toProperty("isQuery")
            .map(queryType).toProperty("queryType")
            .map(isEdit).toProperty("isEdit")
            .map(showType).toProperty("showType")
            .map(options).toProperty("options")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysGenTableColumn> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysGenTableColumn, c ->
            c.map(id).toProperty("id")
            .map(tableId).toProperty("tableId")
            .map(columnName).toProperty("columnName")
            .map(columnSort).toProperty("columnSort")
            .map(columnType).toProperty("columnType")
            .map(columnLabel).toProperty("columnLabel")
            .map(comments).toProperty("comments")
            .map(attrName).toProperty("attrName")
            .map(attrType).toProperty("attrType")
            .map(isPk).toProperty("isPk")
            .map(isNull).toProperty("isNull")
            .map(isInsert).toProperty("isInsert")
            .map(isUpdate).toProperty("isUpdate")
            .map(isList).toProperty("isList")
            .map(isQuery).toProperty("isQuery")
            .map(queryType).toProperty("queryType")
            .map(isEdit).toProperty("isEdit")
            .map(showType).toProperty("showType")
            .map(options).toProperty("options")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysGenTableColumn record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenTableColumn, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(columnSort).toPropertyWhenPresent("columnSort", record::getColumnSort)
            .map(columnType).toPropertyWhenPresent("columnType", record::getColumnType)
            .map(columnLabel).toPropertyWhenPresent("columnLabel", record::getColumnLabel)
            .map(comments).toPropertyWhenPresent("comments", record::getComments)
            .map(attrName).toPropertyWhenPresent("attrName", record::getAttrName)
            .map(attrType).toPropertyWhenPresent("attrType", record::getAttrType)
            .map(isPk).toPropertyWhenPresent("isPk", record::getIsPk)
            .map(isNull).toPropertyWhenPresent("isNull", record::getIsNull)
            .map(isInsert).toPropertyWhenPresent("isInsert", record::getIsInsert)
            .map(isUpdate).toPropertyWhenPresent("isUpdate", record::getIsUpdate)
            .map(isList).toPropertyWhenPresent("isList", record::getIsList)
            .map(isQuery).toPropertyWhenPresent("isQuery", record::getIsQuery)
            .map(queryType).toPropertyWhenPresent("queryType", record::getQueryType)
            .map(isEdit).toPropertyWhenPresent("isEdit", record::getIsEdit)
            .map(showType).toPropertyWhenPresent("showType", record::getShowType)
            .map(options).toPropertyWhenPresent("options", record::getOptions)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenTableColumn> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenTableColumn> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenTableColumn> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenTableColumn> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysGenTableColumn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysGenTableColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(tableId).equalTo(record::getTableId)
                .set(columnName).equalTo(record::getColumnName)
                .set(columnSort).equalTo(record::getColumnSort)
                .set(columnType).equalTo(record::getColumnType)
                .set(columnLabel).equalTo(record::getColumnLabel)
                .set(comments).equalTo(record::getComments)
                .set(attrName).equalTo(record::getAttrName)
                .set(attrType).equalTo(record::getAttrType)
                .set(isPk).equalTo(record::getIsPk)
                .set(isNull).equalTo(record::getIsNull)
                .set(isInsert).equalTo(record::getIsInsert)
                .set(isUpdate).equalTo(record::getIsUpdate)
                .set(isList).equalTo(record::getIsList)
                .set(isQuery).equalTo(record::getIsQuery)
                .set(queryType).equalTo(record::getQueryType)
                .set(isEdit).equalTo(record::getIsEdit)
                .set(showType).equalTo(record::getShowType)
                .set(options).equalTo(record::getOptions);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysGenTableColumn record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(tableId).equalToWhenPresent(record::getTableId)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(columnSort).equalToWhenPresent(record::getColumnSort)
                .set(columnType).equalToWhenPresent(record::getColumnType)
                .set(columnLabel).equalToWhenPresent(record::getColumnLabel)
                .set(comments).equalToWhenPresent(record::getComments)
                .set(attrName).equalToWhenPresent(record::getAttrName)
                .set(attrType).equalToWhenPresent(record::getAttrType)
                .set(isPk).equalToWhenPresent(record::getIsPk)
                .set(isNull).equalToWhenPresent(record::getIsNull)
                .set(isInsert).equalToWhenPresent(record::getIsInsert)
                .set(isUpdate).equalToWhenPresent(record::getIsUpdate)
                .set(isList).equalToWhenPresent(record::getIsList)
                .set(isQuery).equalToWhenPresent(record::getIsQuery)
                .set(queryType).equalToWhenPresent(record::getQueryType)
                .set(isEdit).equalToWhenPresent(record::getIsEdit)
                .set(showType).equalToWhenPresent(record::getShowType)
                .set(options).equalToWhenPresent(record::getOptions);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysGenTableColumn record) {
        return update(c ->
            c.set(tableId).equalTo(record::getTableId)
            .set(columnName).equalTo(record::getColumnName)
            .set(columnSort).equalTo(record::getColumnSort)
            .set(columnType).equalTo(record::getColumnType)
            .set(columnLabel).equalTo(record::getColumnLabel)
            .set(comments).equalTo(record::getComments)
            .set(attrName).equalTo(record::getAttrName)
            .set(attrType).equalTo(record::getAttrType)
            .set(isPk).equalTo(record::getIsPk)
            .set(isNull).equalTo(record::getIsNull)
            .set(isInsert).equalTo(record::getIsInsert)
            .set(isUpdate).equalTo(record::getIsUpdate)
            .set(isList).equalTo(record::getIsList)
            .set(isQuery).equalTo(record::getIsQuery)
            .set(queryType).equalTo(record::getQueryType)
            .set(isEdit).equalTo(record::getIsEdit)
            .set(showType).equalTo(record::getShowType)
            .set(options).equalTo(record::getOptions)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysGenTableColumn record) {
        return update(c ->
            c.set(tableId).equalToWhenPresent(record::getTableId)
            .set(columnName).equalToWhenPresent(record::getColumnName)
            .set(columnSort).equalToWhenPresent(record::getColumnSort)
            .set(columnType).equalToWhenPresent(record::getColumnType)
            .set(columnLabel).equalToWhenPresent(record::getColumnLabel)
            .set(comments).equalToWhenPresent(record::getComments)
            .set(attrName).equalToWhenPresent(record::getAttrName)
            .set(attrType).equalToWhenPresent(record::getAttrType)
            .set(isPk).equalToWhenPresent(record::getIsPk)
            .set(isNull).equalToWhenPresent(record::getIsNull)
            .set(isInsert).equalToWhenPresent(record::getIsInsert)
            .set(isUpdate).equalToWhenPresent(record::getIsUpdate)
            .set(isList).equalToWhenPresent(record::getIsList)
            .set(isQuery).equalToWhenPresent(record::getIsQuery)
            .set(queryType).equalToWhenPresent(record::getQueryType)
            .set(isEdit).equalToWhenPresent(record::getIsEdit)
            .set(showType).equalToWhenPresent(record::getShowType)
            .set(options).equalToWhenPresent(record::getOptions)
            .where(id, isEqualTo(record::getId))
        );
    }
}