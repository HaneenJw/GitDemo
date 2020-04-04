package Exceptions;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= new int[5];
		try {
			System.out.println(arr[3]);
		}
		catch(ArithmeticException et){
	      System.out.println("I catched an arithmetic error");
		}
		catch(IndexOutOfBoundsException etc) {
			System.out.println("I catched an index bounded error");
		}
		finally {
			System.out.println("Deleted cookies");
		}
	}

}
