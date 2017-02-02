package com.playground.logic;

import com.playground.dao.PlaygroundDAO;
import com.playground.datasource.ConnectionInfo;

public class PlaygroundManager extends ConnectionInfo {
	
	PlaygroundDAO dao = new PlaygroundDAO();
	
	public String getHello() {
		String hello = null;
		try {
			connect();			
			hello = dao.getHello(conn);
		} catch(Exception e) {
			
		} finally {
			flush();
		}		
		return hello;
	}
}
