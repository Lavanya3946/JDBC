package com.xworkz.TV.Runner;

import com.xworkz.TV.dao.TvDao;
import com.xworkz.TV.daoImpl.TvDaoImpl;


public class TvRunner {
    private  static TvDao tvDao=new TvDaoImpl();
    public static void main(String[] args) {
//        tvDao.save(0,"amruthadare","Zee",4.3,5,"kannada");
       tvDao.getDataById(3);
       int updated=tvDao.UpdateDataByFields(4,"magalu janaki","Zee",6.0,5,"english");
        System.out.println("updated :"+updated);
    }
}
