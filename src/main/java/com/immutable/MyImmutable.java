package com.immutable;

public final class MyImmutable {
	private int mobile;
	private String name;
	public int getMobile() {
		return mobile;
	}
	public String getName() {
		return name;
	}
	public MyImmutable(int mobile, String name) {
		super();
		this.mobile = mobile;
		this.name = name;
	}
	
	public int modifydetails(int mobile){
		if(this.mobile==mobile)
		return mobile;
		else
			return new MyImmutable(mobile, name);
		/*if(this.mobile==mobile)
			
			return mobile;
		else
			
			return new MyImmutable(mobile, name);
		
		*/
		
	}
	
	

}
class test{
	public static void main(String[] args) {
		MyImmutable im = new MyImmutable(954545, "battu");
		MyImmutable mm = im.modifydetails(954545);
		System.out.println(mm.getMobile());
	}
	
}