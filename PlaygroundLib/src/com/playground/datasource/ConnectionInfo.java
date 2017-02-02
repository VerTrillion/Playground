package com.playground.datasource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionInfo {
	public Statement s;
	public PreparedStatement ps;
	public CallableStatement cs;	
	public ResultSet rs;	
	public Connection conn;
	
	public void connect() {
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:/jdbc/test");
			conn = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void flush() {
		partialFlush();
		
		if(conn != null) {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch(Exception e) {}
		}
	}
	
	public void partialFlush() {
		if(s != null) {
			try {
				if(!s.isClosed())
					s.close();
			} catch(Exception e) {}
		}
		
		if(ps != null) {
			try {
				if(!ps.isClosed())
					ps.close();
			} catch(Exception e) {}
		}
		
		if(cs != null) {
			try {
				if(!cs.isClosed())
					cs.close();
			} catch(Exception e) {}
		}
		
		if(rs != null) {
			try {
				if(!rs.isClosed())
					rs.close();
			} catch(Exception e) {}
		}
	}
	
}
