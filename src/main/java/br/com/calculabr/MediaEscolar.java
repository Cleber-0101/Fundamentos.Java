package br.com.calculabr;

import java.util.Scanner;

public class MediaEscolar {
 
	public static void main(String[] args) {
		
		Scanner media1 = new Scanner(System.in) ;
		
		System.out.println("Informe a media");
		double media = media1.nextDouble();
		
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens");			
		 }else {
			 System.out.println("Reprovado");
		 }
		   
		
		 media1.close();  
	}
	 
}
