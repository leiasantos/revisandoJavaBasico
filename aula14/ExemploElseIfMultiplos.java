package cursojava.aula14;

import java.util.Scanner;

public class ExemploElseIfMultiplos {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	
		
	double valor;	
		
	System.out.println("Digite o preço do item");	
	valor = scan.nextDouble();
	
	
   if(valor <= 10) {
		System.out.println("Está barato!!");
   }else if(valor > 10 && valor < 15) {
		System.out.println("Peça desconto");
   }else if(valor >= 15 && valor < 17) {
		System.out.println("Pesquise outros valores");
   }else {
		System.out.println("MUITO CARO, NÃO COMPRE!!");
   }
   		
		
	scan.close();

	}

}
