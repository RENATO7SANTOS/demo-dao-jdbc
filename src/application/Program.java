package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args)  {
		
		Department dp=new Department(01, "Books");
		
		Seller sl=new Seller(21, "Bob", "bob@gmail.com", new Date(), 1500.0, dp);
		
		SellerDao sellerDao= DaoFactory.createSellerDao();
		
		System.out.println(sl);
		
	}

}
