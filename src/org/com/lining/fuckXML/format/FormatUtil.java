package org.com.lining.fuckXML.format;

import java.util.HashMap;

public class FormatUtil {

	public FormatUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ȡsourceStr������xmlԪ��
	 * ����ȡ�����ڵ��е�xmlԪ��
	 * ���磺
	 * ��sourceStrΪ��������
	 * <a>a</a>
	 * <b>
	 *   <c>c</c>
	 * </b>
	 * ���ص�HashMap��key-valueΪ��
	 * key       value
	 * a           a
	 * b        <c>c</c>      
	 * @param sourceStr
	 * @return
	 */
	
	public HashMap<String,Object> formatOne(String sourceStr){
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		//����˳��ѭ��ȡ�����Ԫ�أ�ȡ��һ��Ԫ�ؾͽ����Ԫ�ش�sourcestr���Ƴ�
		map.put(key, value);
	}
}
