/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.StudentRegistration;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class StudentDao {
    public String saveStudent(StudentRegistration Student){
        
        Session ss = dao.HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(Student);
        tr.commit();
        ss.close();
        
     
        return "nhnhbhhb";
    }
}
