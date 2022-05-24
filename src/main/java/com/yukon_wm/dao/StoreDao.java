package com.yukon_wm.dao;

import com.yukon_wm.entity.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Store)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-17 20:03:06
 */
@Mapper
public interface StoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Store queryById(String id);

    /**
     * 通过username查询单条数据
     *
     * @param username
     * @return 实例对象
     */
    Store queryByUsername(String username);

    /**
     * 查询全部的商家信息
     *
     * @return 全部数据
     * */
    List<Store> queryAll();

    /**
     * 查询指定行数据
     *
     * @param store 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Store> queryAllByLimit(Store store, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param store 查询条件
     * @return 总行数
     */
    long count(Store store);

    /**
     * 新增数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int insert(Store store);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Store> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Store> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Store> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Store> entities);

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int update(Store store);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

