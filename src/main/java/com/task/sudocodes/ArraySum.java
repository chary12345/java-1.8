//sum of arrays using with for loop
package task.sudocodes;

public class ArraySum {
	
	public static void main(String[] args) {
		
		int[] a= new int[]{1,2,3,4,5};
		int result = 0;
		for(int i =0; i<a.length;i++){
			result = result+a[i];
		}
		System.out.println("sum of arrays is : "+result);
		
	}

}
