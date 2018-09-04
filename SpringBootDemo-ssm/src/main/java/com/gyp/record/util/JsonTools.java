package com.gyp.record.util;
import  com.alibaba.fastjson.*;

import net.minidev.json.JSONValue;


public class JsonTools {
	/**
	 * 将字符串转换成json对象
	 * @param object
	 * @return
	 */
	public static String createJsonString(Object object){
	    String jsonString = "";
	    try {
	    	jsonString=JSONValue.toJSONString(object);
	      
	    } catch (Exception e) {
	    }
	    return jsonString;
	}
	
}
