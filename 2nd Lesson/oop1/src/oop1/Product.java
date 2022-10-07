package oop1;


//Classlar PascalCase ile adlandırılır
//Burda ürünü tanımlamıyorum, ürünleri tanımlayabileceğim ortamı hazırlıyorum.

public class Product {
	//camelCase
	//get ve set edilebilirliği ayarlamak için private ettik. 
	//Private ile sadece bu classın içinde kullanabiliriz.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitStock;
	//Bunlar class'ın fieldları
	//Bunları yaparken domain (işs odaklı) tanımlarız. Çok olursa urls diye tanımlayabiliriz.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitStock() {
		return unitStock;
	}
	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}
	
	
}
