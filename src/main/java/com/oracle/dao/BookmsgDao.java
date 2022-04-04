package com.oracle.dao;

import com.oracle.entity.Bookmsg;

import java.sql.SQLException;
import java.util.List;

/**
 * (Bookmsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:11
 */
public interface BookmsgDao {

    List<Bookmsg> queryBybtypemsg_id(Integer btypemsg_id) throws SQLException;


    /**
     * 通过ID查询单条数据
     *
     * @param lid 主键
     * @return 实例对象
     */
    Bookmsg queryById(Integer lid);

  

    /**
     * 统计总行数
     *
     * @param bookmsg 查询条件
     * @return 总行数
     */
    long count(Bookmsg bookmsg);

    /**
     * 新增数据
     *
     * @param bookmsg 实例对象
     * @return 影响行数
     */
    int insert(Bookmsg bookmsg);

 
 
    /**
     * 修改数据
     *
     * @param bookmsg 实例对象
     * @return 影响行数
     */
    int update(Bookmsg bookmsg);

    /**
     * 通过主键删除数据
     *
     * @param lid 主键
     * @return 影响行数
     */
    int deleteById(Integer lid);

}

