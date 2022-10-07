package intro;

public class Main {
		
	public static void main(String[] args) {
		// değişken tanımlarken java'da camleCase yazılır 
		System.out.println("Hello World!");
		String ortaMetin ="ilginzi cekebilir";
		String sonMetin = "Vade süresi";
		System.out.println(ortaMetin);
		
		
		//Integer
		int vade = 12;
		
		double dolarDun =18.14;
		double dolarBugun =18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//true
			okYonu = "down.svg";
			System.out.println(okYonu);			
		}else {
			okYonu = "up.svg";
					System.out.println(okYonu);			
		}
		
		//array
		
		String[] krediler = {"Hızlı kredi", "Maaşınız", "HalkBankta"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
