package com.oracle.dao;

import com.oracle.entity.Wordrecord;

/**
 * (Wordrecord)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:17
 */
public interface WordrecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param txid 主键
     * @return 实例对象
     */
    Wordrecord queryById(Integer txid);

  

    /**
     * 统计总行数
     *
     * @param wordrecord 查询条件
     * @return 总行数
     */
    long count(Wordrecord wordrecord);

    /**
     * 新增数据
     *
     * @param wordrecord 实例对象
     * @return 影响行数
     */
    int insert(Wordrecord wordrecord);

 
 
    /**
     * 修改数据
     *
     * @param wordrecord 实例对象
     * @return 影响行数
     */
    int update(Wordrecord wordrecord);

    /**
     * 通过主键删除数据
     *
     * @param txid 主键
     * @return 影响行数
     */
    int deleteById(Integer txid);

}

