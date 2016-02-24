/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jspwebproject.dao.impl;

import com.leapfrog.jspwebproject.dao.DepartmentDAO;
import com.leapfrog.jspwebproject.dbutil.DbConnection;
import com.leapfrog.jspwebproject.entity.Department;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author QWERTY
 */
public class DepartmentDAOImpl implements DepartmentDAO{
    private DbConnection conn=new DbConnection(); // For database connection
    
    @Override
    public int insert(Department d) throws SQLException, ClassNotFoundException {
        
        String sql="INSERT INTO tbl_department (name,description,status) values (?,?,?)";
        conn.open();
        PreparedStatement stmt=conn.initStatement(sql);
        stmt.setString(1, d.getName());
        stmt.setString(2, d.getDescription());
        stmt.setBoolean(3, d.getStatus());
        
        //Database ma fire garne method
        int result=conn.executeUpdate();
        conn.close();
        return result;
    }
    
    
}
