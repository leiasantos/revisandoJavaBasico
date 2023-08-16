package cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		
		// for normal
		
		for (int i = 0;  i < 5; i++) {
		    System.out.println("i tem valor: " + i);
		}
		
		 System.out.println();
		 
		for (int i = 5;  i > 0; i--) {
		    System.out.println("i tem valor: " + i);
		}
		
		 System.out.println();
		 
		
		//for com mais de uma variável
		
		for (int i = 0,  j = 10 ;  i < j; i++, j--) {
		    System.out.println(" i tem valor: " + i + " e j tem valor: " + j);
		}

		 System.out.println();
		 
		//for com partes ausentes 
		int i = 0;
		for ( ;   i < 5; ) {
		    System.out.println("i tem valor: " + i);
		     i++;
		}

		
		 System.out.println();
			
		int count = 0;
		for( ; count < 10 ;) {
			 System.out.println("Valor de count: " + count );
			 count += 2;
		}
		

		 System.out.println();
		 
		 int multiplicador;

         for(multiplicador = 1; multiplicador <= 10; multiplicador++) {
        	 System.out.println("Tabuada do " + multiplicador);
         }
         for(int contador = 0; contador <= 10; contador++) {
        	 System.out.println(multiplicador + " x " + contador + " = " + multiplicador * contador);
         }
         System.out.println();

	}

}
