package dao;


import org.hibernate.Session;
import table.Medicine;
import util.Util;
import table.Medicine;

import java.sql.SQLException;
import java.util.List;




public class MedicineDao{

    public void addMedicine(Medicine medicine) throws SQLException {
        Session session = null;
        try {
            session =  Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(medicine);
            session.getTransaction().commit();

        }catch (Exception e) {e.printStackTrace();}
        finally {
            {if ((session != null) && (session.isOpen())) session.close();
            }

        }}

    public void deleteMedicine(Medicine medicine) throws SQLException {
        Session session = null;

        try {
            session =  Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(medicine);
            session.getTransaction().commit();

        }catch (Exception e) {e.printStackTrace();}
        finally {
            {if ((session != null) && (session.isOpen())) session.close();
            }

        }}

    public Medicine getMedicine(int id) throws SQLException {
        Medicine result = null;
        Session session = null;

        try {
            session =  Util.getSessionFactory().openSession();
            result = (Medicine) session.get(Medicine.class, id);
        }catch (Exception e) {e.printStackTrace();}
        finally {
            {if ((session != null) && (session.isOpen())) session.close();
            }

        }
        return result;
    }

    public List<Medicine> getMedicine() throws SQLException {
        List<Medicine> medicines = null;
        Session session = null;

        try {
            session =  Util.getSessionFactory().openSession();
            medicines = (List<Medicine>) session.createCriteria(Medicine.class).list();
        }catch (Exception e) {e.printStackTrace();}
        finally {
            {if ((session != null) && (session.isOpen())) session.close();
            }

        }

        return medicines;
    }
}