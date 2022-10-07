package oop1;

public class Main {

	public static void main(String[] args) {
		// Operasyon tutucu ve özellik tutucu classlar olmak üzere ikiye ayrılırlar

		//String mesaj = "Vade oranı";

		//String dizi = new String() gibi

		Product product1 = new Product();

		// Burda yaptığım işleme "set value" denir
//		product1.name = "Delonghi kahve makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.unitStock = 3;
//		product1.imageUrl = "bilmemne1.jpg";
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitStock(3);
		product1.setImageUrl("bilmemne1.jpg");

		// get
		// System.out.print(product1.name);

		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitStock(3);
		product2.setImageUrl("bilmemne2.jpg");

//		product2.name = "Smeg kahve makinesi";
//		product2.unitPrice = 6500;
//		product2.discount = 8;
//		product2.unitStock = 2;
//		product2.imageUrl = "bilmemne1.jpg";

		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitStock(3);
		product3.setImageUrl("bilmemne3.jpg");
		
		
//
//		product3.name = "Kitchen Aid kahve makinesi";
//		product3.unitPrice = 4500;
//		product3.discount = 9;
//		product3.unitStock = 4;
//		product3.imageUrl = "bilmemne3.jpg";
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222324");
		individualCustomer.setCustomerNumber("135453");
		individualCustomer.setFirstName("Umut");
		individualCustomer.setLastName("Atakul");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("5332215616");
		corporateCustomer.setTaxNumber("30521465633");
		corporateCustomer.setCustomerNumber("54321");
		
		//Listelemede ikisini de referans alan sınıfları eklemem rağmen kızmıyor
		
		Customer[] customers = {corporateCustomer,individualCustomer};
		
		

	}

}
