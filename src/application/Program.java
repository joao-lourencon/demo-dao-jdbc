package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Caio", "caio@gmail.com", new Date("1998/12/22"), 3000.0, department);

        System.out.println(department);
        System.out.println(seller);
    }
}
