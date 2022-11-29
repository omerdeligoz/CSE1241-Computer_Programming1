public class Item {
	//This class constructs an item object 	
	
	private int id;
	public static int numberOfItems;


	public Item (int id) {
		this.id = id;
		numberOfItems++;
	}


	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
