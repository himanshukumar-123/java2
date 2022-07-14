
public class loop {

	public static void main(String[] args) {
		int i,c=0;
		 for(i=1; i<=100 ; i++){
			 if(i%3==0 && i%5==0) {
				 c+=i;
			 }
		 
		 }
		 System.out.println(c);
	}

}
