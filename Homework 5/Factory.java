public class Factory {
	//This class constructs a factory object.	

	private String name;   //name of the factory
	private Employee[] employees = new Employee[0];  //employees working for the factory
	private Storage storage =  new Storage(0); 	//storage area of the factory
	private Payroll[] payrolls = new Payroll[0];  //the payrolls belonging to the employees
	private double itemPrice;  //the price for one item

	//Some necessary variables
	public static int employeeCount;
	public static int itemCount;
	public static int addedPayrolls;


	//Factory constructor
	public Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		this.itemPrice = itemPrice;
		storage = new Storage (capacity);
	}

	//Calculate revenue
	public double getRevenue() {
		return itemPrice * Item.numberOfItems;   
	}

	//Calculate paid salaries
	public double getPaidSalaries() {
		double paidSalaries = 0;

		for (int i = 0; i < payrolls.length; i++) {
			paidSalaries += payrolls[i].calculateSalary();
		}
		return paidSalaries;
	}

	//Add employee to the employees array
	public void addEmployee(Employee employee) {
		employeeCount++;  

		//Backup current employees array
		Employee[] employees2 = new Employee[employeeCount];
		System.arraycopy(employees, 0, employees2, 0, employees.length);

		//Add newly added employee
		employees2[employeeCount - 1] = employee;

		//Create resized employees array
		employees = new Employee[employeeCount];

		//Restore employees array
		for (int i = 0; i < employees2.length; i++) {
			employees[i] = employees2[i];
		}

		//Call the addItem method from Storage class
		Item[] addItems = employee.startShift();
		for (int i = 0; i < addItems.length; i++) {
			storage.addItem(addItems[i]);
		}
	}

	//Remove employee to the employees array
	public Employee removeEmployee(int id) {

		//Give an error message if the employees array is empty
		if (employees.length == 0) {
			System.out.println("There are no employees!");
			return null;
		}
		else {
			boolean idCheck = false;
			int indexOfEmployee = 0;	//This variable keeps the removed employees index

			for (int i = 0 ; i < employees.length ;i++) {
				if (employees[i].getId() == id) {  	//Check if the given id matches 
					idCheck = true;
					indexOfEmployee = i;
					break;
				}
			}

			//If there is no match, give an error message
			if (!idCheck) {
				System.out.println("Employee does not exist!");
				return null;
			}
			//If there is a match, remove employee from emloyees array
			else {
				employeeCount--;
				this.addPayroll(employees[indexOfEmployee].endShift());	//Call addPayroll method for newly removed employee
				Employee removedEmployee = employees[indexOfEmployee];  

				//Create resized employees2 array
				Employee[] employees2 = new Employee[employeeCount];

				//Backup current employees array until the  removed employee
				for (int i = 0; i < indexOfEmployee ; i++)
					employees2[i] = employees[i];

				//Backup current employees array after the removed employee
				for (int i = indexOfEmployee + 1; i < employees.length; i++) {
					employees2[i - 1] = employees[i];
				}

				//Create resized employees array
				employees = new Employee[employeeCount];

				//Restore employees array
				for (int i = 0; i < employees2.length; i++) {
					employees[i] = employees2[i];
				}

				return removedEmployee;
			}
		}
	}



	void addPayroll(Payroll payroll) {
		addedPayrolls++;

		//Backup current payrolls array
		Payroll[] payrolls2 = new Payroll[addedPayrolls];
		System.arraycopy(payrolls, 0, payrolls2, 0, payrolls.length);

		//Add newly added payroll
		payrolls2[addedPayrolls - 1] = payroll;

		//Restore payrolls array
		payrolls = new Payroll[addedPayrolls];
		for (int i = 0; i < payrolls2.length; i++)
			payrolls[i] = payrolls2[i];
	}


	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Storage getStorage() {
		return storage;
	}
	public void setStroage(Storage storage) {
		this.storage = storage;
	}

	public Payroll[] getPayrolls() {
		return payrolls;
	}
	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double name) {
		this.itemPrice = itemPrice;
	}
}