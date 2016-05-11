package main;

import dao.MedicineDao;

import table.Medicine;
import util.Util;



import java.sql.SQLException;
import java.util.List;

/**
 * Created by Администратор on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

MedicineDao dao = new MedicineDao();

       Medicine medicine1 = new Medicine();
    Medicine medicine2 = new Medicine();
       medicine1.setDiscription("dfs");
      medicine1.setId(5);
        medicine1.setIsbn(3241);
       medicine1.setName("AAAAAAA");
       dao.addMedicine(medicine1);
        List<Medicine> list = dao.getMedicine();





       System.out.println( list.toString());



    }
}
