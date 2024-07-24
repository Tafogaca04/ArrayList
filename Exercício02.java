package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		int mult=0;
		for (int i=0; i<=10;i++) {
			int numerosAleatorios = random.nextInt(10);

			numeros.add(numerosAleatorios);

		}
		System.out.println(numeros);


		for (int i : numeros) {
			
			System.out.println( i +"x"+ 2 +"="+ i * 2);

	}

}
}
