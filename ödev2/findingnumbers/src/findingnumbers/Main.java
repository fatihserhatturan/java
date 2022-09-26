package findingnumbers;

public class Main {

	public static void main(String[] args) {
		int[] sayilar =  new int[] {1,2,5,7,9,0}; 
		
		int aranacak = 5;
		
		
		for(int i=0;i<6;i++) {
			
			if(sayilar[i]==5) {
				
				System.out.println("5 dizinin ");
				System.out.println(+i);
				System.out.println(". elemanidir");
				
			}
			
		}

	}

}
