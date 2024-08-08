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

        SellerDao sellerDao = FactoryDao.createSellerDao();

        /*System.out.println(department);
        System.out.println(seller);*/

        Seller seller1 = sellerDao.findByid(3);

            System.out.println("--- TEST 01: seller findByI ---");
        System.out.println(seller1);
    }
}
