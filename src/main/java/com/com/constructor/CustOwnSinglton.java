package com.constructor;

public class CustOwnSinglton {
private static CustOwnSinglton cs = null;
	private static int id;
	private static String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	//write getInstance method for(facory method) create own single tone
	public static CustOwnSinglton getCustOwnSinglton(){
		if(cs==null)
			return cs=new CustOwnSinglton();
		else
		return cs;
		
	}
	
	
}

class CTest{
	public static void main(String[] args) {
		System.out.println(CustOwnSinglton.getCustOwnSinglton().hashCode());
		System.out.println(CustOwnSinglton.class.hashCode());
	}
}