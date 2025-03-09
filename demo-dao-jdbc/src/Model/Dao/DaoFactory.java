package Model.Dao;

import Model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createDao() {
        return new SellerDaoJDBC();
    }
}
