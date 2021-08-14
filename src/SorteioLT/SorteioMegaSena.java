package SorteioLT;

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class SorteioMegaSena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Diga quantos numeros voces deseja gerar: ");
		int quantidadeDeNumeros = entrada.nextInt();
		
		System.out.println("Diga quantos jogos voces deseja gerar: ");
		int quantidadeDeJogos = entrada.nextInt();
		if (quantidadeDeNumeros < 6 || quantidadeDeNumeros > 11) {
			System.out.print("Quantidade de numeros incorreta! ");
			return;
		}
		

		Random gerador = new Random();
		for(int i =0; i<quantidadeDeJogos; i++){
			HashSet<Integer> sorteio = new HashSet<>();

			while (sorteio.size() < quantidadeDeNumeros) {

				sorteio.add(gerador.nextInt(60)+1);
			}
			System.out.println("Resultado do sorteio: " + sorteio);
		}
		
	}
}
