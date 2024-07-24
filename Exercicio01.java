package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		for (int i=0; i<=10;i++) {
			int numerosAleatorios = random.nextInt(10);

			numeros.add(numerosAleatorios);

		}
		System.out.println(numeros);
		numeros.remove(4);

		for (int numero : numeros) {
			System.out.println(numero);
		}

	}


}


