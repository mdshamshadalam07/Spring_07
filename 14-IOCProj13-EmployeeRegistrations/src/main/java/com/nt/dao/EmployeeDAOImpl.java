package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;


public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String EMPLOYEE_INSERT_QUERY="INSERT INTO EMPLOYEEREGISTRATION VALUES(ENO_SEQ1.NEXTVAL,?,?,?,?,?,?)";	
			private DataSource ds;
			
			//constructor injecion
			public EmployeeDAOImpl(DataSource ds) {
			this.ds = ds;
			}
			
			public int insert(EmployeeBO bo) throws Exception {
			Connection con=null;
			PreparedStatement ps=null;
			int count=0;
			
			//get pooled jdbc connection
			con=ds.getConnection();
			
			//create preparedStatement object
			
			ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);
			//set values to query parameter
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getJob());
			ps.setString(3, bo.getEadd());
			ps.setFloat(4, bo.getBasicsal());
			ps.setFloat(5, bo.getGross_sal());
			ps.setFloat(6, bo.getNet_sal());
			
			//execute the sql query
			count=ps.executeUpdate();
			
			//close connection
			ps.close();
			con.close();
			return count;
	}
}
