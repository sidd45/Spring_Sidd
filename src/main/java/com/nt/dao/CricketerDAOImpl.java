package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CricketerBO;

public class CricketerDAOImpl implements CricketerDAO {
	private final static String CRICKETER_INSERT_QUERY = "INSERT INTO CRICKETER VALUES(CRIC_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;

	public CricketerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertCricketer(CricketerBO bo) throws Exception {
		Connection con = null;
		PreparedStatement pst = null;
		int count = 0;
		// creating connection
		con = ds.getConnection();
		// creating prepared statement 
		pst=con.prepareStatement(CRICKETER_INSERT_QUERY);
		// setting the parameters
		pst.setString(1, bo.getCname());
		pst.setString(2, bo.getCadd());
		pst.setFloat(3, bo.getBatavg());
		pst.setFloat(4, bo.getBowlavg());
		count = pst.executeUpdate();
       //closing the connection and prepared statement objects
		con.close();
		pst.close();
		return count;
	}

}
