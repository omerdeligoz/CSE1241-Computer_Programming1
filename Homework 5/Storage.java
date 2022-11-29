public class Storage {
	//This class constructs a storage object for factory. 	

	private int capacity;
	private Item[] items  = new Item[0];

	//Storage constructor
	public Storage(int capacity) {
		this.capacity = capacity;
	}

	//Add given item to the items array
	public void addItem(Item item) {
		Factory.itemCount++;

		//Backup current items array
		Item[] items2 = new Item[Factory.itemCount];
		System.arraycopy(items, 0, items2, 0, items.length);

		//Add newly added item
		items2[Factory.itemCount - 1] = item;


		//Create resized items array
		items = new Item[Factory.itemCount];

		//Restore items array
		for (int i = 0; i < items2.length; i++)
			items[i] = items2[i];
	}


	//Getters and Setters
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Item[] getItems() {
		return items;
	}
	public void setId(Item[] items) {
		this.items = items;
	}
}