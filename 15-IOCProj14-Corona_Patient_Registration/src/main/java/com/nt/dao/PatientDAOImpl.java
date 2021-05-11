package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public final class PatientDAOImpl implements PatientDAO {
	private static final String PATIENT_INSERT_QUERY="INSERT INTO CORONA_PATIENT_REGISTRATION VALUES (PATNO_SEQ1.NEXTVAL,?,?,?,?,?)"; 
	private DataSource ds;
	
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl.PatientDAOImpl()");
		this.ds = ds;
	}
  @Override
	public int insert(PatientBO bo) throws Exception {
	  System.out.println("PatientDAOImpl.insert()");
		 Connection con = null;
		 PreparedStatement ps=null;
		 int count = 0;
		 
		 con=ds.getConnection();
		 ps = con.prepareStatement(PATIENT_INSERT_QUERY);
		 ps.setString(1,bo.getPatname());
		 ps.setString(2,bo.getPatadd());
		 ps.setFloat(3, bo.getAges());
		 ps.setString(4, bo.getHospitalname());
		 ps.setFloat(5, bo.getBillamount());
		 count=ps.executeUpdate();
		 ps.close();
		 con.close();
		return count;
  }
}