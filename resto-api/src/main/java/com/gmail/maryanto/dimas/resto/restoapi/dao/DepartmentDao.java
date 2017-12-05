/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.dao;

import com.gmail.maryanto.dimas.resto.restoapi.entity.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimmaryanto93
 */
@Repository
public class DepartmentDao {
    
    @Autowired
    private DataSource ds;
    
    public List<Department> fetchDataDepartments() throws SQLException{
        List<Department> list = new ArrayList<>();
        Connection koneksi = ds.getConnection();
        String query = "select "
                + " department_id as kode, "
                + " department_name as nama, "
                + " manager_id as kode_manage, "
                + " location_id as kode_lokasi "
                + "from departments";
        Statement statement = koneksi.createStatement();
        ResultSet hasil = statement.executeQuery(query);
        while(hasil.next()){
            Department department = new Department();
            department.setDepartmentId(hasil.getInt("kode"));
            department.setDepartmentName(hasil.getString("nama"));
            department.setManagerId(hasil.getInt("kode_manage"));
            department.setLocationId(hasil.getInt("kode_lokasi"));
//            System.out.println(department.toString());
            list.add(department);
        }
        hasil.close();
        statement.close();
        koneksi.close();
        return list;
    }
    
    public void saveDepartment(Department department) throws SQLException{        
        String query = "insert into departments("
                + " department_id, department_name, manager_id, location_id"
                + ") values (?, ?, null, ?)";
        Connection connection = ds.getConnection();
        
        PreparedStatement compiledStatement = connection.prepareStatement(query);
        compiledStatement.setInt(1, department.getDepartmentId());
        compiledStatement.setString(2, department.getDepartmentName());
        compiledStatement.setInt(3, department.getLocationId());
        
        compiledStatement.executeUpdate();
        compiledStatement.close();
        connection.close();
    }
    
    public void updateDepartment(Department department) throws SQLException{
        String query = "update departments "
                + " set department_name = ?, location_id = ? "
                + "where department_id = ?";
        Connection connection = ds.getConnection();
        
        PreparedStatement compiledStatement = connection.prepareStatement(query);
        compiledStatement.setInt(3, department.getDepartmentId());
        compiledStatement.setString(1, department.getDepartmentName());
        compiledStatement.setInt(2, department.getLocationId());
        
        compiledStatement.executeUpdate();
        compiledStatement.close();
        connection.close();

    }
    
    
}
