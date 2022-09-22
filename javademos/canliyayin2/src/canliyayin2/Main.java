package canliyayin2;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
		product1.setUnitPrice(3);
		product1.setImageUrl("image1.jpg");
		
        
        System.out.println(product1.name);
        
        Product product2 = new Product();
		
        
		product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
		product2.setUnitPrice(3);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
		product3.setUnitPrice(3);
		product3.setImageUrl("image3.jpg");
		
		
        
        
        Product[] products = {product1,product2,product3};
        
        for (Product product : products) {
        	System.out.println(product.name);
        	System.out.println(product.unitPrice);
        	System.out.println(product.discount);
        	System.out.println(product.unitInStock);
        	System.out.println(product.imageUrl);       	
        	
        }
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05537469329");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("fatti");
        individualCustomer.setLastName("turn");
        
	}
	

}
