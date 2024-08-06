package application;

import db.DB;
import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import static model.dao.FactoryDao.createSellerDao;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Caio", "caio@gmail.com", new Date("1998/12/22"), 3000.0, department);

        SellerDao sellerDao = FactoryDao.createSellerDao();

        System.out.println(department);
        System.out.println(seller);
    }
}
