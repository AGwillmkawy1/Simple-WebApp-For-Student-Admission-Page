/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Admission;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class AdmissionDao {
    public String saveAdmission(Admission Admit){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(Admit);
        tr.commit();
        ss.close();
        return "Student admitted";
}
    public String UpdateAdmission(Admission Admit){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(Admit);
        tr.commit();
        ss.close();
        return "Student admitted";
}
    public String deleteAdmission(Admission Admit){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(Admit);
        tr.commit();
        ss.close();
        return "Student admitted";
}
   } 
