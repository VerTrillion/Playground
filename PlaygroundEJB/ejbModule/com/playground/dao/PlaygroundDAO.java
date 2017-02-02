package com.playground.dao;

import java.sql.Connection;

import com.playground.datasource.ConnectionInfo;

public class PlaygroundDAO extends ConnectionInfo {
	
	public String getHello(Connection conn) {
		String hello = "";
		try {
			if(conn != null) {
				String sql = "select 'Hello World YAY' as msg";
				
				ps = conn.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				if(rs.next()) {
					hello = rs.getString("msg");
				}
			}
		} catch(Exception e) {
			
		} finally {
			partialFlush();
		}
		return hello;
	}
}
