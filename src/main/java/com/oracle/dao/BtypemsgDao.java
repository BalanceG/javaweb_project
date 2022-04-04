package com.oracle.dao;

import com.oracle.entity.Btypemsg;

import java.sql.SQLException;
import java.util.List;

/**
 * (Btypemsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:13
 */
public interface BtypemsgDao {


    List<Btypemsg> queryBygrademsg_id(Integer grademsg_id) throws SQLException;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    Btypemsg queryById(Integer tid);

  

    /**
     * 统计总行数
     *
     * @param btypemsg 查询条件
     * @return 总行数
     */
    long count(Btypemsg btypemsg);

    /**
     * 新增数据
     *
     * @param btypemsg 实例对象
     * @return 影响行数
     */
    int insert(Btypemsg btypemsg);

 
 
    /**
     * 修改数据
     *
     * @param btypemsg 实例对象
     * @return 影响行数
     */
    int update(Btypemsg btypemsg);

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 影响行数
     */
    int deleteById(Integer tid);

}

