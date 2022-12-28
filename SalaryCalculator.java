public class SalaryCalculator {

    public static void main(String[] args) {
    
    	Employee kemal = new Employee("Kemal" , 2000 , 45 , 1985);
    	kemal.printString();
    }
}

class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name , double salary , int workHours , int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		double calculatedTax = 0;
		if (this.salary < 1000 && this.salary >= 0) {
			calculatedTax = 0;
		}
		else if (this.salary >= 1000) {
			calculatedTax = this.salary * 0.03;
		}
		return calculatedTax;
	}

	double bonus() {
		double calculatedBonus = 0;
		if (this.workHours > 40) {
			calculatedBonus = ((this.workHours - 40) * 30);
		}
		return calculatedBonus;
	}

	double raiseSalary() {
		if (this.hireYear < 10) {
			return this.salary * 0.05;
		}
		else if (this.hireYear >= 10 && this.hireYear < 20) {
			return this.salary * 0.10;
		}
		else {
			return this.salary * 0.15;
		}
	}

	void printString() {
		System.out.println("İsim : " + name);
		System.out.println("Maaşı : " + this.salary);
		System.out.println("Çalışma Saati : " + this.workHours);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maaş Artışı : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
		System.out.println("Toplam Maaş : " + (this.salary + bonus() - tax() + raiseSalary()));
	}
}

