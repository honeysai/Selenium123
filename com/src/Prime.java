
public class Prime {
	public static void main(String[] args) {
		int n=0;
		int num =0;
		int counter =0;
		String p ="";
		for (int i = 1; i < 50; i++) {
			for (num= i; num >=i; num--) {
				if(i%num==0){
					counter =counter+1;
					
				}
				
			}
			if (counter ==2){
				
			}
			p =p+i;
			
			
		}
		System.out.println("print no from 1 to 100:");
		System.out.println( p+" ");
	}

}
