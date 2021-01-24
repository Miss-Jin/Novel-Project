package com.zzz.mapper;

import static com.zzz.mapper.SysGenTableDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.zzz.entity.SysGenTable;
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
public interface SysGenTableMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, tableName, className, comments, category, packageName, moduleName, subModuleName, functionName, functionNameSimple, author, srcDir, options, createBy, createDate, updateBy, updateDate, remarks);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysGenTable> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SysGenTable> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysGenTableResult")
    Optional<SysGenTable> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysGenTableResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="comments", property="comments", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.TINYINT),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sub_module_name", property="subModuleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name_simple", property="functionNameSimple", jdbcType=JdbcType.VARCHAR),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="src_dir", property="srcDir", jdbcType=JdbcType.VARCHAR),
        @Result(column="options", property="options", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.BIGINT),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.BIGINT),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<SysGenTable> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SysGenTable record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenTable, c ->
            c.map(id).toProperty("id")
            .map(tableName).toProperty("tableName")
            .map(className).toProperty("className")
            .map(comments).toProperty("comments")
            .map(category).toProperty("category")
            .map(packageName).toProperty("packageName")
            .map(moduleName).toProperty("moduleName")
            .map(subModuleName).toProperty("subModuleName")
            .map(functionName).toProperty("functionName")
            .map(functionNameSimple).toProperty("functionNameSimple")
            .map(author).toProperty("author")
            .map(srcDir).toProperty("srcDir")
            .map(options).toProperty("options")
            .map(createBy).toProperty("createBy")
            .map(createDate).toProperty("createDate")
            .map(updateBy).toProperty("updateBy")
            .map(updateDate).toProperty("updateDate")
            .map(remarks).toProperty("remarks")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SysGenTable> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sysGenTable, c ->
            c.map(id).toProperty("id")
            .map(tableName).toProperty("tableName")
            .map(className).toProperty("className")
            .map(comments).toProperty("comments")
            .map(category).toProperty("category")
            .map(packageName).toProperty("packageName")
            .map(moduleName).toProperty("moduleName")
            .map(subModuleName).toProperty("subModuleName")
            .map(functionName).toProperty("functionName")
            .map(functionNameSimple).toProperty("functionNameSimple")
            .map(author).toProperty("author")
            .map(srcDir).toProperty("srcDir")
            .map(options).toProperty("options")
            .map(createBy).toProperty("createBy")
            .map(createDate).toProperty("createDate")
            .map(updateBy).toProperty("updateBy")
            .map(updateDate).toProperty("updateDate")
            .map(remarks).toProperty("remarks")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SysGenTable record) {
        return MyBatis3Utils.insert(this::insert, record, sysGenTable, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(className).toPropertyWhenPresent("className", record::getClassName)
            .map(comments).toPropertyWhenPresent("comments", record::getComments)
            .map(category).toPropertyWhenPresent("category", record::getCategory)
            .map(packageName).toPropertyWhenPresent("packageName", record::getPackageName)
            .map(moduleName).toPropertyWhenPresent("moduleName", record::getModuleName)
            .map(subModuleName).toPropertyWhenPresent("subModuleName", record::getSubModuleName)
            .map(functionName).toPropertyWhenPresent("functionName", record::getFunctionName)
            .map(functionNameSimple).toPropertyWhenPresent("functionNameSimple", record::getFunctionNameSimple)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
            .map(srcDir).toPropertyWhenPresent("srcDir", record::getSrcDir)
            .map(options).toPropertyWhenPresent("options", record::getOptions)
            .map(createBy).toPropertyWhenPresent("createBy", record::getCreateBy)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(updateBy).toPropertyWhenPresent("updateBy", record::getUpdateBy)
            .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
            .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenTable> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenTable> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SysGenTable> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SysGenTable> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysGenTable, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SysGenTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(tableName).equalTo(record::getTableName)
                .set(className).equalTo(record::getClassName)
                .set(comments).equalTo(record::getComments)
                .set(category).equalTo(record::getCategory)
                .set(packageName).equalTo(record::getPackageName)
                .set(moduleName).equalTo(record::getModuleName)
                .set(subModuleName).equalTo(record::getSubModuleName)
                .set(functionName).equalTo(record::getFunctionName)
                .set(functionNameSimple).equalTo(record::getFunctionNameSimple)
                .set(author).equalTo(record::getAuthor)
                .set(srcDir).equalTo(record::getSrcDir)
                .set(options).equalTo(record::getOptions)
                .set(createBy).equalTo(record::getCreateBy)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateBy).equalTo(record::getUpdateBy)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(remarks).equalTo(record::getRemarks);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysGenTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(className).equalToWhenPresent(record::getClassName)
                .set(comments).equalToWhenPresent(record::getComments)
                .set(category).equalToWhenPresent(record::getCategory)
                .set(packageName).equalToWhenPresent(record::getPackageName)
                .set(moduleName).equalToWhenPresent(record::getModuleName)
                .set(subModuleName).equalToWhenPresent(record::getSubModuleName)
                .set(functionName).equalToWhenPresent(record::getFunctionName)
                .set(functionNameSimple).equalToWhenPresent(record::getFunctionNameSimple)
                .set(author).equalToWhenPresent(record::getAuthor)
                .set(srcDir).equalToWhenPresent(record::getSrcDir)
                .set(options).equalToWhenPresent(record::getOptions)
                .set(createBy).equalToWhenPresent(record::getCreateBy)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateBy).equalToWhenPresent(record::getUpdateBy)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(remarks).equalToWhenPresent(record::getRemarks);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SysGenTable record) {
        return update(c ->
            c.set(tableName).equalTo(record::getTableName)
            .set(className).equalTo(record::getClassName)
            .set(comments).equalTo(record::getComments)
            .set(category).equalTo(record::getCategory)
            .set(packageName).equalTo(record::getPackageName)
            .set(moduleName).equalTo(record::getModuleName)
            .set(subModuleName).equalTo(record::getSubModuleName)
            .set(functionName).equalTo(record::getFunctionName)
            .set(functionNameSimple).equalTo(record::getFunctionNameSimple)
            .set(author).equalTo(record::getAuthor)
            .set(srcDir).equalTo(record::getSrcDir)
            .set(options).equalTo(record::getOptions)
            .set(createBy).equalTo(record::getCreateBy)
            .set(createDate).equalTo(record::getCreateDate)
            .set(updateBy).equalTo(record::getUpdateBy)
            .set(updateDate).equalTo(record::getUpdateDate)
            .set(remarks).equalTo(record::getRemarks)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SysGenTable record) {
        return update(c ->
            c.set(tableName).equalToWhenPresent(record::getTableName)
            .set(className).equalToWhenPresent(record::getClassName)
            .set(comments).equalToWhenPresent(record::getComments)
            .set(category).equalToWhenPresent(record::getCategory)
            .set(packageName).equalToWhenPresent(record::getPackageName)
            .set(moduleName).equalToWhenPresent(record::getModuleName)
            .set(subModuleName).equalToWhenPresent(record::getSubModuleName)
            .set(functionName).equalToWhenPresent(record::getFunctionName)
            .set(functionNameSimple).equalToWhenPresent(record::getFunctionNameSimple)
            .set(author).equalToWhenPresent(record::getAuthor)
            .set(srcDir).equalToWhenPresent(record::getSrcDir)
            .set(options).equalToWhenPresent(record::getOptions)
            .set(createBy).equalToWhenPresent(record::getCreateBy)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(updateBy).equalToWhenPresent(record::getUpdateBy)
            .set(updateDate).equalToWhenPresent(record::getUpdateDate)
            .set(remarks).equalToWhenPresent(record::getRemarks)
            .where(id, isEqualTo(record::getId))
        );
    }
}