package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println("----------------------");

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println("----------------------");
		
		Client c3 = new Client("Maria", "maria@gmail.com");
		Client c4 = new Client("Maria", "alex@gmail.com");
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c3.equals(c4));
		System.out.println("----------------------");
		
		Client c5 = new Client("Maria", "maria@gmail.com");
		Client c6 = new Client("Maria", "maria@gmail.com");
		System.out.println(c5.hashCode());
		System.out.println(c6.hashCode());
		System.out.println(c5.equals(c6));
		System.out.println(c5 == c6); //Aqui a compara��o � por posi��o na mem�ria heap por isso est� false
		System.out.println("----------------------");
		
		//Se vc quiser compara��o pelo conteudo do objeto use "equals", se n�o use "=="
		String s1 = "Text";
		String s2 = "Text";
		System.out.println("s1 == Text e s2 == Text");
		System.out.println("s1 � igual a s2 ?");
		System.out.println(s1 == s2);
		System.out.println("Nesse caso o compilador tem um tratamento especial para compara��o de literais");
		System.out.println("Ent�o ele consegue verificar que s1 � igual a s2");
	}

}
