package com.zzz.mapper;

import static com.zzz.mapper.SysLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysLog;
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
public interface SysLogMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, userId, username, operation, time, method, params, ip, gmtCreate);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysLog> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysLog> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysLogResult")
    Optional<SysLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="operation", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysLog record) {
        return MyBatis3Utils.insert(this::insert, record, sysLog, c ->
            c.map(id).toProperty("id")
            .map(userId).toProperty("userId")
            .map(username).toProperty("username")
            .map(operation).toProperty("operation")
            .map(time).toProperty("time")
            .map(method).toProperty("method")
            .map(params).toProperty("params")
            .map(ip).toProperty("ip")
            .map(gmtCreate).toProperty("gmtCreate")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysLog, c ->
            c.map(id).toProperty("id")
            .map(userId).toProperty("userId")
            .map(username).toProperty("username")
            .map(operation).toProperty("operation")
            .map(time).toProperty("time")
            .map(method).toProperty("method")
            .map(params).toProperty("params")
            .map(ip).toProperty("ip")
            .map(gmtCreate).toProperty("gmtCreate")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysLog record) {
        return MyBatis3Utils.insert(this::insert, record, sysLog, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(operation).toPropertyWhenPresent("operation", record::getOperation)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(method).toPropertyWhenPresent("method", record::getMethod)
            .map(params).toPropertyWhenPresent("params", record::getParams)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(userId).equalTo(record::getUserId)
                .set(username).equalTo(record::getUsername)
                .set(operation).equalTo(record::getOperation)
                .set(time).equalTo(record::getTime)
                .set(method).equalTo(record::getMethod)
                .set(params).equalTo(record::getParams)
                .set(ip).equalTo(record::getIp)
                .set(gmtCreate).equalTo(record::getGmtCreate);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(operation).equalToWhenPresent(record::getOperation)
                .set(time).equalToWhenPresent(record::getTime)
                .set(method).equalToWhenPresent(record::getMethod)
                .set(params).equalToWhenPresent(record::getParams)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysLog record) {
        return update(c ->
            c.set(userId).equalTo(record::getUserId)
            .set(username).equalTo(record::getUsername)
            .set(operation).equalTo(record::getOperation)
            .set(time).equalTo(record::getTime)
            .set(method).equalTo(record::getMethod)
            .set(params).equalTo(record::getParams)
            .set(ip).equalTo(record::getIp)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysLog record) {
        return update(c ->
            c.set(userId).equalToWhenPresent(record::getUserId)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(operation).equalToWhenPresent(record::getOperation)
            .set(time).equalToWhenPresent(record::getTime)
            .set(method).equalToWhenPresent(record::getMethod)
            .set(params).equalToWhenPresent(record::getParams)
            .set(ip).equalToWhenPresent(record::getIp)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .where(id, isEqualTo(record::getId))
        );
    }
}