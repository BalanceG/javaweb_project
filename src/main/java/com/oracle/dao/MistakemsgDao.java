package com.oracle.dao;

import com.oracle.entity.Mistakemsg;

/**
 * (Mistakemsg)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:15
 */
public interface MistakemsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Mistakemsg queryById(Integer sid);

  

    /**
     * 统计总行数
     *
     * @param mistakemsg 查询条件
     * @return 总行数
     */
    long count(Mistakemsg mistakemsg);

    /**
     * 新增数据
     *
     * @param mistakemsg 实例对象
     * @return 影响行数
     */
    int insert(Mistakemsg mistakemsg);

 
 
    /**
     * 修改数据
     *
     * @param mistakemsg 实例对象
     * @return 影响行数
     */
    int update(Mistakemsg mistakemsg);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(Integer sid);

}

