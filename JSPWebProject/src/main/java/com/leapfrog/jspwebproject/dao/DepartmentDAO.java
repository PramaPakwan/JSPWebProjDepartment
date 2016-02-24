/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jspwebproject.dao;

import com.leapfrog.jspwebproject.entity.Department;
import java.sql.SQLException;

/**
 *
 * @author QWERTY
 */
public interface DepartmentDAO {
    int insert(Department d) throws SQLException,ClassNotFoundException;
    
}
