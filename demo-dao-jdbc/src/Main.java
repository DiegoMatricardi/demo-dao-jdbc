import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Dao.impl.SellerDaoJDBC;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        Seller seller = new Seller(21,"Bob", "bog@gmail.com", new Date(), 3000.0, department);
        SellerDao sellerDao = DaoFactory.createDao();
        System.out.println(seller);
        System.out.println(department);
    }
}