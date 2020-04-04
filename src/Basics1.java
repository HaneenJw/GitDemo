
public class Basics1 {

	public static void main(String[] args) {
		// print in the console
		/*String s="madam";
		String t ="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		if(s.equals(t)) {
		System.out.println("the text is palindrome");
		}
		else
		{
			System.out.println("Failure");
		}*/
		// The below code how to get the sum of numbers in the array
		int sum=0;
		int c[]= {2,5,8,7,4};
		int num=8;
		for(int i=0;i<c.length;i++) {
		
			if(c[i]==num) {
				System.out.println(i);
				break;
			}
			sum=sum+c[i];
		}
		System.out.println(sum);
		
		
	}
	

}
