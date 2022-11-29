public class Employee {
	//This class constructs a employee object for factory. 	

	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items = new Item[0];
	private Payroll payroll; 

	//Employee constructor
	public Employee(int id, String name, String surname, int workHour, int speed) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.workHour = workHour;
		this.speed = speed;
	}

	//Find how many items this employee should produce, and give random id's to these items 
	public Item[] startShift() {
		Item[] items = new Item[speed * workHour];

		for (int i = 0; i < items.length; i++) {    
			items[i]= new Item((int)(Math.random()*100 + 1));
		}
		return items;
	}
	//Create a Payroll object
	public Payroll endShift() {
		payroll = new Payroll(workHour , workHour * speed);
		return payroll;
	}

	//Return a String with employee�s id and the return value of the payroll object�s toString() method.
	public String toString() {
		return "This is the employee with id " + id +  " speed " + speed + "." + payroll.toString();
	}



	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surname;
	}
	public void setSurName(String surname) {
		this.surname = surname;
	}

	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}

	public Payroll getPayroll() {
		return payroll;
	}
	public void setPpayroll(Payroll payroll) {
		this.payroll = payroll;
	}
}
