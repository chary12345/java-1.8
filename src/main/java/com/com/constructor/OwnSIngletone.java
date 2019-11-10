package com.com.constructor;

/**
 * 
 * @author ADMIN create our own singleton class by using two class
 *
 */
public class OwnSIngletone {

	private static OwnSIngletone os;

	OwnSIngletone() {

	}

	public static OwnSIngletone getOwnSIngletone() {

		if (os == null) {
			os = new OwnSIngletone();
		}
		return os;

	}

}

class SingleTest {

	public static void main(String[] args) {
		OwnSIngletone o = OwnSIngletone.getOwnSIngletone();
		OwnSIngletone o1 = OwnSIngletone.getOwnSIngletone();
		OwnSIngletone o2 = OwnSIngletone.getOwnSIngletone();

		System.out.println(o1.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o == o1);

		/* System.out.println(OwnSIngletone.getOwnSIngletone().hashCode()); */
	}
}
