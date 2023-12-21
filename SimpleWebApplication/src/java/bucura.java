
import dao.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class bucura {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}
