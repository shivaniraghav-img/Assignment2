//this program transpose a matrix and multiplication of elements of matrix
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    
		int a[][]= {{1,2},{4,5},{8,9}};//declaring and initializing an array
		int i,j;
		int b[][]= new int[2][3];//transpose matrix
		
	    for(i=0;i<a.length;i++)// for loop is used for accessing row elements
		
	    {
		    for( j=0;j<a.length;j++)//for loop is used for accessing column elements
		    {
				b[i][j]=a[j][i];      //transpose a matrix
				
			System.out.print(b[i][j]+" ");// print matrix after transpose
        		}
        		System.out.println();// for next line after a row
        		
        
       	}

	}

}
