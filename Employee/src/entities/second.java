package entities;

public class second {
	public String name;
	public double salary;
	public double tax;
	
	// retorna salario com desconto
	  public double netsalary() {
		  return salary - tax;
		  
	  }
	 //adição salarial
	  
	  public void addsalary(double percentage) {
		   salary += salary * percentage / 100.0;
	  }
	
	   // retorna a entidade
	 public String toString(){
		 return name  + ", " + " $" + String.format("%.2f",netsalary());
		 
		 
	 }

}
