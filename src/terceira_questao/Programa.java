package terceira_questao;

import java.util.Scanner;

import entities.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Calculadora calculadora = new Calculadora();
		char cont = '!';
		
		while(cont != '$') {
			System.out.println("---------------------------");
			
			System.out.println("+ - Somar");
			System.out.println("- - Subtrair");
			System.out.println("* - Multiplicar");
			System.out.println("/ - Dividir");
			System.out.println("$ - Sair");
			
			System.out.println("---------------------------");
			
			cont = sc.next().charAt(0);
			if(cont != '+' && cont != '-' && cont != '*' && cont != '/' && cont != '$') {
				System.out.println(calculadora.operacao(cont));
				break;
			}
			if(cont == '$') {
				System.out.println("Fim do programa!");
				break;
			}
			
			System.out.print("Numero 1: ");
			calculadora.setN1(sc.nextDouble());
			System.out.print("Numero 2: ");
			calculadora.setN2(sc.nextDouble());
			
			
			System.out.println("Resultado: " + calculadora.operacao(cont));
			
		}
		
		sc.close();
	}

}
