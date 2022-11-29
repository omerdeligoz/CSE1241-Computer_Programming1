public class Payroll {
	//This class constructs a payroll object for an employee 	

	private int workHour;
	private int itemCount;

	//Payroll constructor
	public Payroll (int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}

	//Calculate salary of the employee
	public int calculateSalary() {
		return (3 * workHour)  + (2 * itemCount);
	}

	public String toString() {
		return " The work hour is " + workHour + " and the produced item count is " + itemCount + ".";
	}


	//Getters and Setters
	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour() {
		this.workHour = workHour;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount() {
		this.itemCount = itemCount;
	}
}