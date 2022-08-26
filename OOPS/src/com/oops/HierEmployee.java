package com.oops;

class HierEmployee {
	class Employee {
		int salary = 2000;
	}
	 class Permanant extends Employee {
		 void displayIncrement() {
			 System.out.println("Before Increment Salary of permanant emplyee is:"+salary);
			 salary = salary +(salary * 15)/100;
			 System.out.println("After Increment Salary is:" + salary);
		 }
	 }
	 class Temporary extends Employee {
		 void displayIncrement() {
			 System.out.println("Before Increment Salary of temporary emplyee is:"+salary);
			 salary = salary +(salary * 10)/100;
			 System.out.println("After Increment Salary is:" + salary);
		
		}

	}


}
