package center;

import java.util.Locale;
import java.util.Scanner;
import entities.second;

public class numberone {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			     second sec = new second();
			
			     //area para digitar credenciais
				 System.out.print("Digite o nome do funcionário: ");
				 sec.name = sc.nextLine();
				 System.out.print("Digite o salario do funcionário: ");
				 sec.salary = sc.nextDouble();
				 System.out.print("Digite o desconto Salarial: ");
	             sec.tax = sc.nextDouble();
	             
	             //total com desconto
	              System.out.println();
	              System.out.print("Total: " + sec);
	               
	               System.out.println();
	               System.out.print("Digite a porcentade de aumento: ");
	               double percentage = sc.nextDouble();
	                sec.addsalary(percentage);
	   
	                // total com aumento
	                 System.out.println();
	                 System.out.println("Novo salário: " + sec );
	                 
	                 	sc.close();
	}

}
