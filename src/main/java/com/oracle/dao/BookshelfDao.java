package com.oracle.dao;

import com.oracle.entity.Bookshelf;

/**
 * (Bookshelf)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:12
 */
public interface BookshelfDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    Bookshelf queryById(Integer bid);

  

    /**
     * 统计总行数
     *
     * @param bookshelf 查询条件
     * @return 总行数
     */
    long count(Bookshelf bookshelf);

    /**
     * 新增数据
     *
     * @param bookshelf 实例对象
     * @return 影响行数
     */
    int insert(Bookshelf bookshelf);

 
 
    /**
     * 修改数据
     *
     * @param bookshelf 实例对象
     * @return 影响行数
     */
    int update(Bookshelf bookshelf);

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 影响行数
     */
    int deleteById(Integer bid);

}

