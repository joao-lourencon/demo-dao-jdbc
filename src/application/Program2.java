package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao factoryDao = FactoryDao.createDepartmentDao();

        System.out.println("---- Test 01: Department FindAll ----");
        List<Department> departmentList = factoryDao.findAll();
        for (Department department : departmentList) {
            System.out.println(department);
        }

    }
}
