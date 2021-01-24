package com.zzz.mapper;

import static com.zzz.mapper.SysDataPermDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysDataPerm;
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
public interface SysDataPermMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, tableName, moduleName, crlAttrName, crlColumnName, permCode, orderNum, gmtCreate, gmtModified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysDataPerm> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysDataPerm> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysDataPermResult")
    Optional<SysDataPerm> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysDataPermResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crl_attr_name", property="crlAttrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crl_column_name", property="crlColumnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="perm_code", property="permCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysDataPerm> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysDataPerm record) {
        return MyBatis3Utils.insert(this::insert, record, sysDataPerm, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(tableName).toProperty("tableName")
            .map(moduleName).toProperty("moduleName")
            .map(crlAttrName).toProperty("crlAttrName")
            .map(crlColumnName).toProperty("crlColumnName")
            .map(permCode).toProperty("permCode")
            .map(orderNum).toProperty("orderNum")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysDataPerm> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysDataPerm, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(tableName).toProperty("tableName")
            .map(moduleName).toProperty("moduleName")
            .map(crlAttrName).toProperty("crlAttrName")
            .map(crlColumnName).toProperty("crlColumnName")
            .map(permCode).toProperty("permCode")
            .map(orderNum).toProperty("orderNum")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysDataPerm record) {
        return MyBatis3Utils.insert(this::insert, record, sysDataPerm, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(moduleName).toPropertyWhenPresent("moduleName", record::getModuleName)
            .map(crlAttrName).toPropertyWhenPresent("crlAttrName", record::getCrlAttrName)
            .map(crlColumnName).toPropertyWhenPresent("crlColumnName", record::getCrlColumnName)
            .map(permCode).toPropertyWhenPresent("permCode", record::getPermCode)
            .map(orderNum).toPropertyWhenPresent("orderNum", record::getOrderNum)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysDataPerm> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysDataPerm> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysDataPerm> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysDataPerm> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysDataPerm, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysDataPerm record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(tableName).equalTo(record::getTableName)
                .set(moduleName).equalTo(record::getModuleName)
                .set(crlAttrName).equalTo(record::getCrlAttrName)
                .set(crlColumnName).equalTo(record::getCrlColumnName)
                .set(permCode).equalTo(record::getPermCode)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysDataPerm record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(moduleName).equalToWhenPresent(record::getModuleName)
                .set(crlAttrName).equalToWhenPresent(record::getCrlAttrName)
                .set(crlColumnName).equalToWhenPresent(record::getCrlColumnName)
                .set(permCode).equalToWhenPresent(record::getPermCode)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysDataPerm record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(tableName).equalTo(record::getTableName)
            .set(moduleName).equalTo(record::getModuleName)
            .set(crlAttrName).equalTo(record::getCrlAttrName)
            .set(crlColumnName).equalTo(record::getCrlColumnName)
            .set(permCode).equalTo(record::getPermCode)
            .set(orderNum).equalTo(record::getOrderNum)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysDataPerm record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(tableName).equalToWhenPresent(record::getTableName)
            .set(moduleName).equalToWhenPresent(record::getModuleName)
            .set(crlAttrName).equalToWhenPresent(record::getCrlAttrName)
            .set(crlColumnName).equalToWhenPresent(record::getCrlColumnName)
            .set(permCode).equalToWhenPresent(record::getPermCode)
            .set(orderNum).equalToWhenPresent(record::getOrderNum)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}