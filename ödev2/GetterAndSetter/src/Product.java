
public class Product {

	
	private int id;
    private String name;
    
    
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getKod() {
		
		return this.name.substring(0,1);
	}
	
}