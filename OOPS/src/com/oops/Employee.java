package com.oops;

public class Employee {

	public static void main(String[] args) {
		class EmployeeDetails
		{
		 
		   //Creating properties of Employee class
		 
		   int emp_id, emp_salary;
		 
		   String emp_name, emp_address, emp_department, emp_email;
		 
		   //Getter and setters for getting and setting properties
		 
		   public int getEmp_id()
		   {
		 
		      return emp_id;
		   }
		 
		   public void setEmp_id(int emp_id)
		   {
		 
		      this.emp_id = emp_id;
		   }
		 
		   public int getSalary()
		   {
		 
		     return emp_salary;
		 
		    }
		 
		    public void setSalary(int emp_salary)
		    {
		 
		       this.emp_salary = emp_salary;
		 
		    }
		 
		    public String getName()
		    {
		 
		       return emp_name;
		 
		    }
		 
		    public void setName(String emp_name)
		    {
		 
		       this.emp_name = emp_name;
		    }
		 
		   public String getAddress()
		   {
		 
		      return emp_address;
		 
		   }
		 
		  
		   public void setAddress(String emp_address)
		   {
		 
		      this.emp_address = emp_address;
		 
		   }
		 
		    public String getDepartment()
		    {
		 
		      return emp_department;
		 
		    }
		 
		    public void setDepartment(String emp_department)
		    {
		 
		       this.emp_department = emp_department;
		    }
		 
		    public String getEmail()
		    {
		 
		       return emp_email;
		     }
		 
		     public void setEmail(String emp_email)
		     {
		 
		       this.emp_email = emp_email;
		       }
		   //Overriding toString() method
		     
		     @Override
		  
		      public String toString()
		      {
		  
		         return " Employee details{ Id = "+ emp_id + "\n Salary = " + emp_salary + "\n Name = " + emp_name + "\n Address = " + emp_address + "\n Department = " + emp_department + "\n Email = " + emp_email + "}";
		      }
		  
		 }
		  
		 //Creating the main class
		  
		 public class Employee
		 {
			 
			  // main method
			 
			   public static void main(String args[])
			   {
			 
			     //Creating object of EmployeeDetails class
			 
			      EmployeeDetails emp = new EmployeeDetails();
			 
			      //Setting values to the properties
			 
			      emp.setEmp_id(67);
			 
			      emp.setName("Shruti Agarwal");
			 
			      emp.setDepartment("IT");
			 
			      emp.setSalary(30000);
			 
			      emp.setAddress("New Delhi");
			 
			      emp.setEmail("agarwalshruti234@gmail.com");
			 
			      //Showing Employee details
			 
			      System.out.println(emp);
			 
			 
			     //Getting salary using getter
			 
			     int sal = emp.getSalary();
			 
			     int increment = 0;
			 
			     //Incrementing salary based on condition
			 
			     if ((sal &gt;=10000) &amp;&amp; (sal &lt;=50000))
			 
			     {
			 
			        //incrementing salary 2%
			 
			        increment += (sal * 2)/100;
			 
			        sal = sal+increment;
			 
			        emp.setSalary(sal);
			 
			        System.out.println("\n Salary is incremented \n");

	}

}
