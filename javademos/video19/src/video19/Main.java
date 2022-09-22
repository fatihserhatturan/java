package video19;

public class Main {

	public static void main(String[] args) {
		
int sayi = 3;
int sayac = 0;


System.out.println("Sayi:" +sayi);

for(int i=1;i<=sayi;i++) {
	
	if(sayi%i==0) {
		
		sayac=sayac+1;
		
	}
	
}

if(sayac==2) {
	
	System.out.println(" Asal Sayidir");
	
}
else {
	
	System.out.println("Asal Sayi Degildir");
	
}

	}

}
