package video21;

public class Main {

	public static void main(String[] args) {
		int sayi=28;
		int[] dizi = new int[28];
		int sayac=0;
		int toplam=0;
		for(int i=1;i<=28;i++) {
			
			if(sayi%i==0) {
				
				for(int j=0;j<sayi;j++) {
					
					dizi[j]=i;
					sayac=sayac+1;
				}
				
				
				
			}
		}
			
			for(int a=0;a<=sayac;a++) {
				
				toplam=dizi[a]+ toplam;
			}
			
			if((sayi*2)==toplam) {
				
				System.out.println("Sayi Mukemmel Sayidir");
				
			}
			else {
				System.out.println("Mukemmel sayi degildir");
			}
		
		

	}

}
