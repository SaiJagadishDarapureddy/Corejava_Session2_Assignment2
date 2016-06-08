
public class Prime_Number {

	public static void main(String[] args) {
		
		boolean prime = true;
		System.out.println("The prime numbers between 1 and 100 are:");
		for(int i=2;i<=100;i++)
		{
			prime= true;
			
			for(int j=2;j<i && prime==true; j++){
				
				if(i%j==0)
				{
					prime=false;
				}
			}
		if(prime==true)
		{
		System.out.print(i+"\t");
		
		}
		
		}

	}

}
