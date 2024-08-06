package model.dao;

import model.impl.SellerDaoJDBC;

public class FactoryDao {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
