package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public  class CustomerDAOImpl implements CustomerDAO {
private static final String SPRING_CUSTOMER_QUERY="INSERT INTO SPRING_CUSTOMER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?)"; 

private DataSource ds;

public CustomerDAOImpl(DataSource ds) {
System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
this.ds = ds;
}

public CustomerDAOImpl() {
System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
System.out.println("hello servie");
}
	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		
		con = ds.getConnection();
		ps = con.prepareStatement(SPRING_CUSTOMER_QUERY); 
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4,bo.getIntrsamt());
 		
		count=ps.executeUpdate();
		ps.close();
		con.close();
		
		return count;
	}

}
