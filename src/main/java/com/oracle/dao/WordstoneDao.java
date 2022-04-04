package com.oracle.dao;

import com.oracle.entity.Wordstone;

/**
 * (Wordstone)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:18
 */
public interface WordstoneDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Wordstone queryById(Integer cid);

  

    /**
     * 统计总行数
     *
     * @param wordstone 查询条件
     * @return 总行数
     */
    long count(Wordstone wordstone);

    /**
     * 新增数据
     *
     * @param wordstone 实例对象
     * @return 影响行数
     */
    int insert(Wordstone wordstone);

 
 
    /**
     * 修改数据
     *
     * @param wordstone 实例对象
     * @return 影响行数
     */
    int update(Wordstone wordstone);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

}

