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
