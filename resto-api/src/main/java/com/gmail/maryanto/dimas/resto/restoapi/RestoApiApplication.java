package com.gmail.maryanto.dimas.resto.restoapi;

import com.gmail.maryanto.dimas.resto.restoapi.dao.DepartmentDao;
import com.gmail.maryanto.dimas.resto.restoapi.entity.Department;
import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestoApiApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext springContext = 
                SpringApplication.run(RestoApiApplication.class, args);
        
        DepartmentDao dao = springContext.getBean(DepartmentDao.class);
        
//        Department department = new Department();
//        department.setDepartmentId(1234);
//        department.setDepartmentName("Banking Online");
//        department.setLocationId(1100);

//          update data ke database
//        dao.updateDepartment(department);

//          tambah data ke database
//        dao.saveDepartment(department);

//          menampilkan data dari database
//        List<Department> list = dao.fetchDataDepartments();
//        list.forEach(d -> {
//            System.out.println(d.toString());
//        });

        dao.removeDepartment(60);
    }
}
