package br.com.calculabr;

import java.util.Scanner;

public class Semana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do dia !");
		
	

		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Esse é o dia " + 1 + " da semana");
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 2 + " da semana");
		}else if("terça".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 3 + " da semana");
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 4 + " da semana");
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 5 + " da semana");
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 6 + " da semana");
		}else if("sabado".equalsIgnoreCase(dia)) {
			System.out.println("Esse é o dia " + 7 + " da semana");
		}
		
		entrada.close();
	}
}
