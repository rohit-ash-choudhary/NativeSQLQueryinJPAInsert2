package com.sp.main.NativeSQLQueryinJPASelect;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sp.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("main-persistence");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       
       try{
    	   et.begin();
    	  String native_sql_uqery="insert into Employee values(:employee_id,:employee_firstname,:employee_lastname,:address,:pincode)";
    	  Query query= em.createNativeQuery(native_sql_uqery, Employee.class);
    	  query.setParameter("employee_id", 1);
    	  query.setParameter("employee_firstname", "Karan");
    	  query.setParameter("employee_lastname", "Kales");
    	  query.setParameter("address", "lall");
    	  query.setParameter("pincode", 134343);
    	   
    	  
    	  int count=query.executeUpdate();
    	  if(count>0)
    	  {
    		  et.commit();
    		  System.out.println("Succesfully Updated result");
    	  }
    	  else {
    		  System.out.println("Failed Updated result");
    	  }
    	  
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
       finally{
    	   
       }
    }
}
