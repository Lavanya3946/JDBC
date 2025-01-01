package com.xworkz.shopping.Runner;

import com.xworkz.shopping.dao.ShoppingDao;
import com.xworkz.shopping.daoImpl.ShoppingDaoImpl;



public class shoppingRunner {
    private static ShoppingDao shoppingDao=new ShoppingDaoImpl();
    private static  boolean isEmpty=true;

    public static void main(String[] args) {
//        shoppingDao.save(0,"clothes shop","Shama","Hassan","Sarees",5000);
        shoppingDao.getDataById(2);
        int resultSet = shoppingDao.UpdatebyField(1, "vegetables shop", "kona", "chellur", "cement", 3000);
        System.out.println(resultSet + "updated");
    }

}
