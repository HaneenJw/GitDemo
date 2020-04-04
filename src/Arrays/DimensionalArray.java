package Arrays;

public class DimensionalArray {

	public static void main(String[] args) {
		//print the maximum number of the given matrix
		
		int abc[][]= {{1,4,6},{4,7,9},{6,5,3}};
		
		int max=abc[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]>max) {
					max=abc[i][j];
				}
			}
		}
 System.out.println(max);
 
 
 // Now we want to print the maximum number in the specific column which contains the minimum value
 
 int a[][]= {{1,5,7},{5,2,7},{0,11,12}};
 int mincol=0;
 int min=a[0][0];
 for(int i=0;i<3;i++) {
	 for(int j=0;j<3;j++) {
		 if(a[i][j]<min) {
			 min=a[i][j];
			 System.out.println(min);
			 mincol=j;
			 System.out.println(mincol);
			 }
	 }
 }
 int maxi=a[0][mincol];
 int k=0;
 while(k<3) {
	 if(a[k][mincol]>maxi)
	 {
		 maxi=a[k][mincol];
	 }
	 k++;
 }
 System.out.println(maxi);
	}

}
