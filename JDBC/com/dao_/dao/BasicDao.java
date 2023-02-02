package com.dao_.dao;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.jdbcUTilsByDruid;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 * 其他Dao的父类
 */
public class BasicDao<T> {
     private QueryRunner qr = new QueryRunner();

     //开发通用的dml
    public int update(String sql,Object...parameters){
        Connection connection = null;


        try {
             connection = jdbcUTilsByDruid.getConnection();
            int update = qr.update(connection, sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUTilsByDruid.close(null,null,connection);
        }

    }

    //查询多行结果通用方法
    public List<T>queryMulti(String sql,Class<T> clazz,Object parameters){
        Connection connection = null;


        try {
            connection = jdbcUTilsByDruid.getConnection();
            return qr.query(connection,sql,new BeanListHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUTilsByDruid.close(null,null,connection);
        }
    }
    //单行查询
    public T querySingle(String sql,Class<T> clazz,Object parameters){
        Connection connection = null;


        try {
            connection = jdbcUTilsByDruid.getConnection();
            return qr.query(connection,sql,new BeanHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUTilsByDruid.close(null,null,connection);
        }

    }
    //查询单行单列的方法
    public Object queryScalar(String sql,Object parameters){
        Connection connection = null;
        try {
            connection = jdbcUTilsByDruid.getConnection();
            return qr.query(connection,sql,new ScalarHandler(),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUTilsByDruid.close(null,null,connection);
        }

    }
}
