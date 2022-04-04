package com.oracle.dao;

import com.oracle.entity.Hintagin;

/**
 * (Hintagin)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:15
 */
public interface HintaginDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Hintagin queryById(Integer pid);

  

    /**
     * 统计总行数
     *
     * @param hintagin 查询条件
     * @return 总行数
     */
    long count(Hintagin hintagin);

    /**
     * 新增数据
     *
     * @param hintagin 实例对象
     * @return 影响行数
     */
    int insert(Hintagin hintagin);

 
 
    /**
     * 修改数据
     *
     * @param hintagin 实例对象
     * @return 影响行数
     */
    int update(Hintagin hintagin);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 影响行数
     */
    int deleteById(Integer pid);

}

