/* 
 * Copyright (C) 2006-2015 （北京）有限公司.
 *
 * 本系统是商用软件,未经授权擅自复制或传播本程序的部分或全部将是非法的.
 *
 * ============================================================
 *
 * FileName: Test721C.java 
 *
 * Created: [2015年10月22日 上午10:26:36] by JungLone 
 *
 * ============================================================ 
 * 
 * ProjectName: ThinkingInJava 
 * 
 * Description: 
 * 
 * ==========================================================*/

package com.junglone.test721.test5;

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

public class C extends A {
	
	/**
	 * 
	 */
	public C() {
		// TODO Auto-generated constructor stub
		super(1);
		
		new B(2);
		
		System.out.println("Invoke Test721C.Test721C() ");
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Test721C.toString()";
	}
	
	public static void main(String[] args) {
		
		C test721c = new C();
		
		System.out.println(test721c);
		
	}

}
