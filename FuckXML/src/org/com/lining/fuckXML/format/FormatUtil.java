package org.com.lining.fuckXML.format;

import java.util.HashMap;

public class FormatUtil {

	public FormatUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 取sourceStr最外层的xml元素
	 * 不会取最外层节点中的xml元素
	 * 例如：
	 * 当sourceStr为以下内容
	 * <a>a</a>
	 * <b>
	 *   <c>c</c>
	 * </b>
	 * 返回的HashMap的key-value为：
	 * key       value
	 * a           a
	 * b        <c>c</c>      
	 * @param sourceStr
	 * @return
	 */
	
	public HashMap<String,Object> formatOne(String sourceStr){
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		//按照顺序循环取最外层元素，取到一个元素就讲这个元素从sourcestr中移除
		map.put(key, value);
	}
}
