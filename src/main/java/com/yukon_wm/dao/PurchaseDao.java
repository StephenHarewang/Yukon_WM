package com.yukon_wm.dao;

import com.yukon_wm.entity.Purchase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Purchase)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-17 20:03:06
 */
@Mapper
public interface PurchaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Purchase queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param purchase 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Purchase> queryAllByLimit(Purchase purchase, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param purchase 查询条件
     * @return 总行数
     */
    long count(Purchase purchase);

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int insert(Purchase purchase);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Purchase> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Purchase> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Purchase> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Purchase> entities);

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int update(Purchase purchase);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

