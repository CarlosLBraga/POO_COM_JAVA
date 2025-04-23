import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
		System.out.println("Movimento de uma Partícula");
		System.out.println("1 - MRU \n2 - MRUV");
		
		int op = teclado.nextInt();
		
		System.out.println("Digite a velocidade");
		int velocidade = teclado.nextInt();
		
		System.out.println("Digite o Intervalo (t)");
		int tempo = teclado.nextInt();
		
		
		if (op == 1){
		    System.out.println("Opção MRU Escolhida");
		     int mru = 0 + (velocidade * tempo);
		    System.out.println("MRU = " + mru);
		}
		
		else if (op == 2){
		    
		    System.out.println("Op MRUV Escolhida");
		    System.out.println("Digite a aceleracao");
		    int aceleracao = teclado.nextInt();
		    double mruv = 0 + velocidade * tempo + (1/2 * aceleracao * Math.pow(tempo, 2));
		    System.out.println("MRUV: " + mruv);
		   
		}
		else{
		    System.out.println("Opção Inválida");
		}
		
	}
}
