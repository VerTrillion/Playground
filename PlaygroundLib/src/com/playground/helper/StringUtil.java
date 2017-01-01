package com.playground.helper;

public class StringUtil {
	
	public static boolean isNullOrEmpty(String str) {
		boolean result = false;
		try{
			if(str == null || "".equals(str)){
				result = true;
			}
		} catch(Exception e){}
		return result;
	}
	
}
