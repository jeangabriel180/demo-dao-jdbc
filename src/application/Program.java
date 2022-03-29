package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findbyId =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findbyDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findbyDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }


    }
}
