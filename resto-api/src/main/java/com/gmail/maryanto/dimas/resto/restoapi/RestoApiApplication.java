package com.gmail.maryanto.dimas.resto.restoapi;

import com.gmail.maryanto.dimas.resto.restoapi.dao.DepartmentDao;
import com.gmail.maryanto.dimas.resto.restoapi.entity.Department;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestoApiApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext springContext
                = SpringApplication.run(RestoApiApplication.class, args);

        DepartmentDao dao = springContext.getBean(DepartmentDao.class);

        Department department = new Department();
        department.setDepartmentId(1239);
        department.setDepartmentName("Banking Online");
        department.setLocationId(1100);

        Department it = new Department();
        it.setDepartmentId(1300);
        it.setDepartmentName("IT");
        it.setLocationId(1000);

        Department it2 = new Department();
        it2.setDepartmentId(1301);
        it2.setDepartmentName("IT");
        it2.setLocationId(1000);

//          tambah data ke database
        dao.saveDepartment(department, it, it2);

//          update data ke database
//        dao.updateDepartment(department);
//          menampilkan data dari database
//        List<Department> list = dao.fetchDataDepartments();
//        list.forEach(d -> {
//            System.out.println(d.toString());
//        });
//
//        dao.removeDepartment(60);
    }
}
