package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao factoryDao = FactoryDao.createDepartmentDao();
    }
}
