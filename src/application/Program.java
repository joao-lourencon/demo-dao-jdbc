package application;

import db.DB;
import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static model.dao.FactoryDao.createSellerDao;

public class Program {
    public static void main(String[] args) {


        /*System.out.println(department);
        System.out.println(seller);*/

        SellerDao sellerDao = FactoryDao.createSellerDao();

        System.out.println("--- TEST 01: seller findById ---");
        Seller seller1 = sellerDao.findByid(2);
        System.out.println(seller1);

        System.out.println();
        System.out.println();

        System.out.println("--- TEST 02: seller findByDepartment ---");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        for (Seller seller : sellers) {
            System.out.println(seller);
        }
    }
}
