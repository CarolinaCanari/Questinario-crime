package CrimeVitima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CrimeVitima {
	public static void main (String [] args) {
		List<String> respostas = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Interrogatório");
		System.out.println("\nPergunta 1: Telefonou para  vítima?");
		String resposta1 = scanner.next();
		respostas.add(resposta1.toLowerCase());
		
		System.out.println("\nPergunta 2: Esteve no local do crime?");
		String resposta2 = scanner.next();
		respostas.add(resposta2.toLowerCase());
		
		System.out.println("\nPergunta 3: Mora perto da vítima?");
		String resposta3 = scanner.next();
		respostas.add(resposta2.toLowerCase());
		
		System.out.println("\nPergunta 4: Devia para a vítima?");
		String resposta4 = scanner.next();
		respostas.add(resposta4.toLowerCase());
		
		System.out.println("\nPergunta 5: Já trabalhou com a vítima?");
		String resposta5 = scanner.next();
		respostas.add(resposta5.toLowerCase());
		
		
		int count = 0;
		Iterator<String> contador = respostas.iterator();
		while(contador.hasNext()) {
			String resp = contador.next();
			if(resp.contains("s")) {
				count ++;
			}
		}
		
		switch(count) {
		case 2:
			System.out.println("\nSUSPEITA"); break;
			
		case 3:
		case 4:
			System.out.println("\nCUMPLICE"); break;
		
		case 5:
			System.out.println("\nASSASSINO"); break;
		
			default:
				System.out.println("\nINOCENTE"); break;

		}
	}	

}
