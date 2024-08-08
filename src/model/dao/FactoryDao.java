package model.dao;

import db.DB;
import model.impl.SellerDaoJDBC;

public class FactoryDao {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
