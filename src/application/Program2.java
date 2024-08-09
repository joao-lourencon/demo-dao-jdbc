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

        System.out.println();

        System.out.println("---- Test 02: Department FindById ----");
        Department findById = factoryDao.findById(2);
        System.out.println(findById);

        System.out.println();

        System.out.println("---- Test 03: Department Delete ----");
        factoryDao.deleteById(6);
        System.out.println("Delete completed");
    }
}
