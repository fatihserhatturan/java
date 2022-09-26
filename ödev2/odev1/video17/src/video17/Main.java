package video17;

public class Main {

	public static void main(String[] args) {
		String mesaj = "bugun Hava cok guzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi :" +mesaj.length());
		System.out.println("5.Eleman = "+mesaj.charAt(4));
		System.out.println(mesaj.concat("Yasasin"));
		System.out.println(mesaj.startsWith("E"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		int srcEnd;
		int dstBegin;
		mesaj.getChars((srcBegin: 0,  srcEnd: 4,karakterler, dstBegin: 0), dstBegin, karakterler, dstBegin;

		System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        String str;
		System.out.println(mesaj.lastIndexOf(str:"a"));

	}

	private static int srcBegin(int i, int j, char[] karakterler, int k) {
		// TODO Auto-generated method stub
		return 0;
	}

}
