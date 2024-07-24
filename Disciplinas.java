package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]disciplinas = {"matemática", "filosofia","história","Física"};
		  ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		  novaLista.add("geografia");
		  novaLista.add("língua inglesa");
		  
		  for (String i: novaLista){
		  System.out.println("Disciplinas:" + i);
	}

}
}

