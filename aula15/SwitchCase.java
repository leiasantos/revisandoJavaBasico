package cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	
	
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite um número representado por um número de (1 - 7)");
		
		int diaSemana = scan.nextInt();
		
	/*
		if(diaSemana == 1) {
			System.out.println("DOMINGO");
		}else if(diaSemana == 2) {
			System.out.println("SEGUNDA");
		}else if(diaSemana == 3) {
			System.out.println("TERÇA");
		}else if(diaSemana == 4) {
			System.out.println("QUARTA");
		}else if(diaSemana == 5) {
			System.out.println("QUINTA");
		}else if(diaSemana == 6) {
			System.out.println("SEXTA");
		}else if(diaSemana == 7) {
			System.out.println("SABADO");
		}else {
			System.out.println("Não é um dia de semana válido");
		}*/
		
	
		switch(diaSemana) {
		case 1: System.out.println("DOMINGO");
		 break;
		
		case 2: System.out.println("SEGUNDA");
		 break;
		
		case 3: System.out.println("TERÇA");
		 break;
		
		case 4: System.out.println("QUARTA");
		 break;
		
		case 5:	System.out.println("QUINTA");
		 break;	
		
		case 6: System.out.println("SEXTA");
		 break;
		
		case 7:	System.out.println("SABADO");
		 break;
		
		default: System.out.println ("Não é um dia de semana válido");
		
		}	
		
	scan.close();
				
	}

}
