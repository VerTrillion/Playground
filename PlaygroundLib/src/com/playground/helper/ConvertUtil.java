package com.playground.helper;

public class ConvertUtil {
	public static String toString(Object obj){
		String str = "";
		try{
			if(obj != null){
				str = obj.toString();
			}
		}catch(Exception e){}
		return str;
	}

	public short toShort(Object obj){
		short val = 0;
		try{
			String str = toString(obj);
			if(!StringUtil.isNullOrEmpty(str)){
				val = Short.parseShort(str);
			}
		}catch(Exception e){}
		return val;
	}

	public int toInt(Object obj){
		int val = 0;
		try{
			String str = toString(obj);
			if(!StringUtil.isNullOrEmpty(str)){
				val = Integer.parseInt(str);
			}
		}catch(Exception e){}
		return val;
	}

	public long toLong(Object obj){
		long val = 0;
		try{
			String str = toString(obj);
			if(!StringUtil.isNullOrEmpty(str)){
				val = Long.parseLong(str);
			}
		}catch(Exception e){}
		return val;
	}
	
	public double toDouble(Object obj){
		double val = 0;
		try{
			String str = toString(obj);
			if(!StringUtil.isNullOrEmpty(str)){
				val = Double.parseDouble(str);
			}
		}catch(Exception e){}
		return val;
	}
}