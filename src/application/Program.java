package application;

import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println();
        System.out.println();

        System.out.println("--- TEST 03: seller findAll ---");
        List<Seller> list = sellerDao.findAll();

        for (Seller seller : list) {
            System.out.println(seller);
        }

        System.out.println();
        System.out.println();

        System.out.println("--- TEST 04: seller insert ---");
        /*Seller seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller);
        System.out.println("Inserted! New Id = " + seller.getId());*/

        System.out.println();
        System.out.println();

        System.out.println("--- TEST 05: seller update ---");
        seller1 = sellerDao.findByid(1);
        seller1.setName("Martha Waine");
        sellerDao.update(seller1);
        System.out.println("Update completed");

        System.out.println();
        System.out.println();

        System.out.println("--- TEST 06: seller delete ---");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
