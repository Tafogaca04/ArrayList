package ArrayList;

import java.util.ArrayList;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numeros = new ArrayList<>();
		  
		  numeros.add(10); //Adicionando elementos ao ArrayList
		  numeros.add(20);
		  
		  System.out.println( "Adicionando um valor:" + numeros.get(0)); //Saída:10
		  System.out.println(numeros.get(1)); //Saída:20

		  numeros.set(1,25);
		  System.out.println( "Modificando um valor:" +numeros.get(1)); //Saída:25 //Modificando um elemento
		  
		  numeros.remove(0);
		  System.out.println( "Removendo um valor:" +numeros.get(0)); //Saída:25 // Removendo um elemento
		  
		  System.out.println(  "Obtendo um valor:" +numeros.size()); //Saída:25 // Obtendo o tamanho
		  
		  
	}

}
