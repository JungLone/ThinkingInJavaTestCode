package com.junglone.test721.test8;

/** 
 * Description:
 *
 * @author JungLone
 * @version 1.0
 * <pre>
 * Modification History: 
 * Date         Author			Version     Description 
 * ------------------------------------------------------------------ 
 * 2015年10月22日      JungLone       	1.0         1.0 Version 
 * </pre>
 */

public class ExportClazz extends BaseClazz {

	/**
	 * 
	 */
	public ExportClazz() {
		super("hello");
		// TODO Auto-generated constructor stub
		System.out.println("Invoke ExportClazz.ExportClazz()");
	}
	
	/**
	 * @param strParam
	 */
	public ExportClazz(String strParam) {
		super(strParam);
		// TODO Auto-generated constructor stub
		System.out.println("Invoke ExportClazz.ExportClazz(String strParam) strParam = " + strParam);
	}
	
	public static void main(String[] args) {
		ExportClazz exportClazz = new ExportClazz();
		ExportClazz exportClazz1 = new ExportClazz("hi");
		try {
			exportClazz.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
