package CrimeVitima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CrimeVitima {
	public static void main (String [] args) {
		List<String> respostas = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Interrogat�rio");
		System.out.println("\nPergunta 1: Telefonou para  v�tima?");
		String resposta1 = scanner.next();
		respostas.add(resposta1.toLowerCase());
		
		System.out.println("\nPergunta 2: Esteve no local do crime?");
		String resposta2 = scanner.next();
		respostas.add(resposta2.toLowerCase());
		
		System.out.println("\nPergunta 3: Mora perto da v�tima?");
		String resposta3 = scanner.next();
		respostas.add(resposta2.toLowerCase());
		
		System.out.println("\nPergunta 4: Devia para a v�tima?");
		String resposta4 = scanner.next();
		respostas.add(resposta4.toLowerCase());
		
		System.out.println("\nPergunta 5: J� trabalhou com a v�tima?");
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
