package com.yukon_wm.dao;

import com.yukon_wm.entity.Deliverer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (DelivererService)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-17 20:03:05
 */
@Mapper
public interface DelivererDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Deliverer queryById(String id);


    /**
     * 通过ID查询单条数据
     *
     * @param username
     * @return 实例对象
     */
    Deliverer queryByUsername(String username);

    /**
     * 查询指定行数据
     *
     * @param deliverer 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Deliverer> queryAllByLimit(Deliverer deliverer, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param deliverer 查询条件
     * @return 总行数
     */
    long count(Deliverer deliverer);

    /**
     * 新增数据
     *
     * @param deliverer 实例对象
     * @return 影响行数
     */
    int insert(Deliverer deliverer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DelivererService> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Deliverer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DelivererService> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Deliverer> entities);

    /**
     * 修改数据
     *
     * @param deliverer 实例对象
     * @return 影响行数
     */
    int update(Deliverer deliverer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

