package com.oracle.dao;

import com.oracle.entity.Ttsvoice;

/**
 * (Ttsvoice)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-01 09:53:16
 */
public interface TtsvoiceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ttid 主键
     * @return 实例对象
     */
    Ttsvoice queryById(Integer ttid);

  

    /**
     * 统计总行数
     *
     * @param ttsvoice 查询条件
     * @return 总行数
     */
    long count(Ttsvoice ttsvoice);

    /**
     * 新增数据
     *
     * @param ttsvoice 实例对象
     * @return 影响行数
     */
    int insert(Ttsvoice ttsvoice);

 
 
    /**
     * 修改数据
     *
     * @param ttsvoice 实例对象
     * @return 影响行数
     */
    int update(Ttsvoice ttsvoice);

    /**
     * 通过主键删除数据
     *
     * @param ttid 主键
     * @return 影响行数
     */
    int deleteById(Integer ttid);

}

