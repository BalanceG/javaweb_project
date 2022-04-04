package com.oracle.dao;

import com.oracle.entity.Wordmsg;

/**
 * (Wordmsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:17
 */
public interface WordmsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    Wordmsg queryById(Integer zid);

  

    /**
     * 统计总行数
     *
     * @param wordmsg 查询条件
     * @return 总行数
     */
    long count(Wordmsg wordmsg);

    /**
     * 新增数据
     *
     * @param wordmsg 实例对象
     * @return 影响行数
     */
    int insert(Wordmsg wordmsg);

 
 
    /**
     * 修改数据
     *
     * @param wordmsg 实例对象
     * @return 影响行数
     */
    int update(Wordmsg wordmsg);

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 影响行数
     */
    int deleteById(Integer zid);

}

