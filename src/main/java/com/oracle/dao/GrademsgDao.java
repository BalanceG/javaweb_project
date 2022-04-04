package com.oracle.dao;

import com.oracle.entity.Grademsg;

import java.sql.SQLException;
import java.util.List;

/**
 * (Grademsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:14
 */
public interface GrademsgDao {

    public List<Grademsg> queryAll() throws SQLException;

        /**
		 * 通过ID查询单条数据
		 *
		 * @param nid 主键
		 * @return 实例对象
		 */
    Grademsg queryById(Integer nid);

  

    /**
     * 统计总行数
     *
     * @param grademsg 查询条件
     * @return 总行数
     */
    long count(Grademsg grademsg);

    /**
     * 新增数据
     *
     * @param grademsg 实例对象
     * @return 影响行数
     */
    int insert(Grademsg grademsg);

 
 
    /**
     * 修改数据
     *
     * @param grademsg 实例对象
     * @return 影响行数
     */
    int update(Grademsg grademsg);

    /**
     * 通过主键删除数据
     *
     * @param nid 主键
     * @return 影响行数
     */
    int deleteById(Integer nid);

}

