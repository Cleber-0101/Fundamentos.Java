package br.com.calculabr;

import java.util.Scanner;

public class Nota {
  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota");
		
	   double nota = entrada.nextDouble();
	   
	   if(nota > 7.5 ) {
		   System.out.println("voce foi aprovado");
	   }else if(nota < 7) {
		   System.out.println("Voce não e um alunno nota Dez mais mesmo assim passou de ano, meus parabens");
	   }
	   
	   
		entrada.close();
	}
}
