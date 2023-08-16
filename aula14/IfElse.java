package cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade");
		idade = scan.nextInt();
	
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("Nãoé é maior de idade");
		}
		
		
		
		
		
		
		scan.close();
	}

}
