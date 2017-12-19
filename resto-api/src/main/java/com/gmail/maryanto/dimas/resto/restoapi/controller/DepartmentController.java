/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.controller;

import com.gmail.maryanto.dimas.resto.restoapi.dao.DepartmentDao;
import com.gmail.maryanto.dimas.resto.restoapi.entity.Department;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimmaryanto93
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentDao repo;
    
    @GetMapping("/list")
    public List<Department> listDepartments(){
        try {
            return repo.fetchDataDepartments();
        } catch (SQLException ex) {
            Logger.getLogger(
                    DepartmentController.class.getName()).log(Level.SEVERE, 
                            null, ex);
            return null;
        }
    }
    
    
    @GetMapping("/{kodeDepartment}")
    public Department listDepartments(@PathVariable Integer kodeDepartment){
        try {
            return repo.fetchDataDepartment(kodeDepartment);
        } catch (SQLException ex) {
            Logger.getLogger(
                    DepartmentController.class.getName()).log(Level.SEVERE, 
                            null, ex);
            return null;
        }
    }
    
}
