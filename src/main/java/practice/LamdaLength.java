package practice;

public class LamdaLength {
	public static void main(String[] args) {
		annony();
		ILength l = n -> System.out.println("in java 1.8 length of name is : " + n.length());

		l.caluculateLength("budafesto");

	}

	private static void annony() {
	ILength i = new ILength() {
		
		@Override
		public void caluculateLength(String name) {
		System.out.println(" in annonymus inner class length is : "+name.length());
			
		}
	};
	i.caluculateLength("boppa reddy");
		
	}
}
