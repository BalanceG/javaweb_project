package com.oracle.dao;

import com.oracle.entity.Coursemsg;

/**
 * (Coursemsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:14
 */
public interface CoursemsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param kid 主键
     * @return 实例对象
     */
    Coursemsg queryById(Integer kid);

  

    /**
     * 统计总行数
     *
     * @param coursemsg 查询条件
     * @return 总行数
     */
    long count(Coursemsg coursemsg);

    /**
     * 新增数据
     *
     * @param coursemsg 实例对象
     * @return 影响行数
     */
    int insert(Coursemsg coursemsg);

 
 
    /**
     * 修改数据
     *
     * @param coursemsg 实例对象
     * @return 影响行数
     */
    int update(Coursemsg coursemsg);

    /**
     * 通过主键删除数据
     *
     * @param kid 主键
     * @return 影响行数
     */
    int deleteById(Integer kid);

}

