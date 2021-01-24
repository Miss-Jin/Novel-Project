package com.zzz.mapper;

import static com.zzz.mapper.SysDictDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysDict;
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
public interface SysDictMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, value, type, description, sort, parentId, createBy, createDate, updateBy, updateDate, remarks, delFlag);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysDict> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysDict> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysDictResult")
    Optional<SysDict> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysDictResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.DECIMAL),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.BIGINT),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.CHAR)
    })
    List<SysDict> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysDict record) {
        return MyBatis3Utils.insert(this::insert, record, sysDict, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(value).toProperty("value")
            .map(type).toProperty("type")
            .map(description).toProperty("description")
            .map(sort).toProperty("sort")
            .map(parentId).toProperty("parentId")
            .map(createBy).toProperty("createBy")
            .map(createDate).toProperty("createDate")
            .map(updateBy).toProperty("updateBy")
            .map(updateDate).toProperty("updateDate")
            .map(remarks).toProperty("remarks")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysDict> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysDict, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(value).toProperty("value")
            .map(type).toProperty("type")
            .map(description).toProperty("description")
            .map(sort).toProperty("sort")
            .map(parentId).toProperty("parentId")
            .map(createBy).toProperty("createBy")
            .map(createDate).toProperty("createDate")
            .map(updateBy).toProperty("updateBy")
            .map(updateDate).toProperty("updateDate")
            .map(remarks).toProperty("remarks")
            .map(delFlag).toProperty("delFlag")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysDict record) {
        return MyBatis3Utils.insert(this::insert, record, sysDict, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(value).toPropertyWhenPresent("value", record::getValue)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
            .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
            .map(delFlag).toPropertyWhenPresent("delFlag", record::getDelFlag)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysDict> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysDict> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysDict> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysDict> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysDict, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysDict record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(value).equalTo(record::getValue)
                .set(type).equalTo(record::getType)
                .set(description).equalTo(record::getDescription)
                .set(sort).equalTo(record::getSort)
                .set(parentId).equalTo(record::getParentId)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(remarks).equalTo(record::getRemarks)
                .set(delFlag).equalTo(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysDict record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(value).equalToWhenPresent(record::getValue)
                .set(type).equalToWhenPresent(record::getType)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(remarks).equalToWhenPresent(record::getRemarks)
                .set(delFlag).equalToWhenPresent(record::getDelFlag);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysDict record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(value).equalTo(record::getValue)
            .set(type).equalTo(record::getType)
            .set(description).equalTo(record::getDescription)
            .set(sort).equalTo(record::getSort)
            .set(parentId).equalTo(record::getParentId)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createDate).equalTo(record::getCreateDate)
            .set(updateBy).equalTo(record::getUpdateBy)
            .set(updateDate).equalTo(record::getUpdateDate)
            .set(remarks).equalTo(record::getRemarks)
            .set(delFlag).equalTo(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysDict record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(value).equalToWhenPresent(record::getValue)
            .set(type).equalToWhenPresent(record::getType)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(updateBy).equalToWhenPresent(record::getUpdateBy)
            .set(updateDate).equalToWhenPresent(record::getUpdateDate)
            .set(remarks).equalToWhenPresent(record::getRemarks)
            .set(delFlag).equalToWhenPresent(record::getDelFlag)
            .where(id, isEqualTo(record::getId))
        );
    }
}