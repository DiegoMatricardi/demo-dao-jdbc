import Model.Entities.Departament;
import Model.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Departament departament = new Departament(1, "Books");
        Seller seller = new Seller(21,"Bob", "bog@gmail.com", new Date(), 3000.0, departament);
        System.out.println(seller);
        System.out.println(departament);
    }
}