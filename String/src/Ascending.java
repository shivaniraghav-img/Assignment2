
public class Ascending {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring and initializing a string 
		String sc="This is a easiest example";
		
		//split the given string using split method
		String[] str= sc.split(" ");

		for(int i=0;i<str.length;i++) //for loop using
		{
			for(int j=i+1;j<str.length;j++)//to compare string length
			{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			
			}
				
		}
		//end of logic

	//printing string after sorting
                for(int i=0;i<str.length;i++)
        {
      	  System.out.print(str[i]+" ");
        }
     }
}
