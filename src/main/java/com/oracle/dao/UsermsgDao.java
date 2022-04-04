package com.oracle.dao;

import com.oracle.entity.Usermsg;

/**
 * (Usermsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:16
 */
public interface UsermsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param wxid 主键
     * @return 实例对象
     */
    Usermsg queryById(Integer wxid);

  

    /**
     * 统计总行数
     *
     * @param usermsg 查询条件
     * @return 总行数
     */
    long count(Usermsg usermsg);

    /**
     * 新增数据
     *
     * @param usermsg 实例对象
     * @return 影响行数
     */
    int insert(Usermsg usermsg);

 
 
    /**
     * 修改数据
     *
     * @param usermsg 实例对象
     * @return 影响行数
     */
    int update(Usermsg usermsg);

    /**
     * 通过主键删除数据
     *
     * @param wxid 主键
     * @return 影响行数
     */
    int deleteById(Integer wxid);

}

