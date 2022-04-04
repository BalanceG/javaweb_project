package com.oracle.util;


import cn.hutool.setting.dialect.Props;
import lombok.extern.log4j.Log4j;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库访问工具类
 */
@Log4j
public class DBManager {

    //初始化连接池，连接池全局唯一！
    private static BasicDataSource dataSource;

    //静态代码块初始化数据库连接池
    static {
        log.info("---------------------------------------------");
        try {
            //使用Props类，props继承了properties
            Props props = new Props("db.properties");
            String url = props.getProperty("db.url");
            log.debug("连接字符串:" + url);
            String classname = props.getProperty("db.classname");
            String username = props.getProperty("db.username");
            String userpass = props.getProperty("db.userpass");
            String maxconnection = props.getProperty("db.maxconnection");
            log.debug("最大连接:" + maxconnection);
            String initsize = props.getProperty("db.initsize");
            log.debug("初始化大小:" + initsize);

            dataSource = new BasicDataSource();
            dataSource.setMaxActive(Integer.parseInt(maxconnection));
            dataSource.setInitialSize(Integer.parseInt(initsize));
            dataSource.setUrl(url);
            dataSource.setDriverClassName(classname);
            dataSource.setUsername(username);
            dataSource.setPassword(userpass);

        } catch (Exception e) {
            log.error("连接池无法加载:", e);
        }
        //还有很多其他参数优化
        log.info("---------------------------------------------");

    }

    /**
     * 关闭连接池中的所有连接
     *
     * @throws SQLException
     */
    public static void closeDS() throws SQLException {
        dataSource.close();
        log.info("======连接池连接全部释放======");
    }

    /**
     * 测试数据库连接池连接是否正常
     * 静态代码块加载实际是类被调用
     * 但我们想让连接池随着服务器启动而启动
     * 所以编写一个方法，在过滤器中启动连接池
     *
     * @throws SQLException
     */
    public static void testConnecton() throws SQLException {
        Connection connection = dataSource.getConnection();
        String catalog = connection.getCatalog();
        log.info("连接成功获取:" + catalog);
        connection.close();
    }


    //提供增删改方法
    public void update(String sql, Object... params) throws SQLException {

        Connection connection = dataSource.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            preparedStatement.executeUpdate();
        } finally {
            connection.close();
        }

    }

    private Connection connection;

    //提供查询方法
    public ResultSet query(String sql, Object... params) throws SQLException {

        connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        return preparedStatement.executeQuery();

    }

    //提供连接关闭方法
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }


}
