package com.oracle.dao;

import com.oracle.entity.Adminmsg;

/**
 * (Adminmsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:07
 */
public interface AdminmsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Adminmsg queryById(Integer aid);

  

    /**
     * 统计总行数
     *
     * @param adminmsg 查询条件
     * @return 总行数
     */
    long count(Adminmsg adminmsg);

    /**
     * 新增数据
     *
     * @param adminmsg 实例对象
     * @return 影响行数
     */
    int insert(Adminmsg adminmsg);

 
 
    /**
     * 修改数据
     *
     * @param adminmsg 实例对象
     * @return 影响行数
     */
    int update(Adminmsg adminmsg);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

}

