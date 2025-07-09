package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller4 = sellerDao.findById(7);
		
		System.out.println(seller4);
		
		System.out.println("Find by dep test");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		

		System.out.println("Find all test");
		
		List<Seller> list2 = sellerDao.findAll();
		
		for(Seller obj : list2) {
			System.out.println(obj);
		}
	}

}
