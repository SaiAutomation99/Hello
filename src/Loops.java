
public class Loops {

	public static void main(String[] args) {

		for(int x=1;x<=6;x++) {
			for (int q=1;q<=x;q++)
				System.out.print(q+" ");
			 System.out.println();
		}
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
//		       * 
//	         * * 
//	       * * * 
//	     * * * * 
//	   * * * * * 
//		
	
		
		
		
//		
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5
		
		
		
		
	
		
		for(int i=1;i<=5;i++) {
			
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
//		
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1
		
		
		for(int i=5;i>=1;i--) {
			
			
			for(int j=5;j>=i;j--) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1
		
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(j+"");
				
			}
			System.out.println();
			
		}
//		
//		1
//		10
//		101
//		1010
//		10101
//		101010 
//		1010101
		
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j>=0;j--) {
				for(int k=j;k<=j;k++) {
					System.out.print(j+"");

					
				}
				
			}
			System.out.println();
		}
//		
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5 
//		6 6 6 6 6 6
//		7 7 7 7 7 7 7
		
for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"");
				
			}
			System.out.println();
			
		}



for(int i=7;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"");
				
			}
			System.out.println();
			
		}
		


for(int i=1;i<=5;i++) {
	
	for(int j=1;j<=i;j++) {
		
		System.out.print(j);
	}
	System.out.println();
}


for(int i=5;i>=1;i--) {
	
	for(int j=5;j>=i;j--) {
		
		System.out.print(j);
	}
	System.out.println();
}




//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1





for(int i=1;i<=7;i++) {
	
	
	for(int j=1;j<=8-i;j++) {
		
		System.out.print(j);
	}
	System.out.println();
}

//
//7 6 5 4 3 2 1
//7 6 5 4 3 2
//7 6 5 4 3
//7 6 5 4
//7 6 5
//7 6
//7


for(int i=7;i>=1;i--) {
	
	for(int j=7;j>=8-i;j--) {
		System.out.print(j+" ");

		
	}
	System.out.println();

}





















	}	
}
