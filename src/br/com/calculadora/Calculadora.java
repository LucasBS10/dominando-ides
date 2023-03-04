package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		Float a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextFloat();
		System.out.print("Digite o segundo valor: ");
		b = scan.nextFloat();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		Float divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Subtracao " + subtracao);
		System.out.println("Divisao " + divisao);
		System.out.println("Multiplicacao " + multiplicacao);
		
	}
	
	public static int soma(Float a, Float b) {
		return (int) (a + b); 
	}
	public static int subtracao(Float a, Float b) {
		return (int) (a - b); 
	}
	public static Float divisao(Float a, Float b) {
		return a / b; 
	}
	public static int multiplicacao(Float a, Float b) {
		return (int) (a * b); 
	}

}
