import java.util.Scanner;
public class Main
{
    public static void converte_graus (int c){
      Scanner teclado = new Scanner(System.in);
      System.out.println("deseja converter \n 1 - Fahrenheit \n 2 - Kelvin");
      int op = teclado.nextInt();
      if (op == 1){
          double f = (c * 1.8) + 32;
          System.out.println(c + "Graus Celcius ->" + f + " Graus Fahrenheit");
      }
      else{
          double k = c + 273.15;
          System.out.println(c + "Graus Celcius ->" + k + " Graus Kelvin");
      }
      
    }
    
    public static int soma_pa (int a1, int r, int n){
        
        int termo_n = a1 + (n - 1) * r;
        
        int soma = (a1 + termo_n) * (n / 2);
        return soma;
    }
        
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
		System.out.println("Menu de opções: ");
		System.out.println("digite a opção: ");
		int op = teclado.nextInt();
		
		if (op == 1){
		    System.out.println("você escolheu converter temperaturas ");
		    System.out.println("digite a medida em Graus Celcius °");
		    int c = teclado.nextInt();
		    converte_graus(c);
		}
		
		else if (op == 2){
		    System.out.println("você escolheu soma N progressão aritmética ");
		    System.out.println("digite o primeiro termo da PA");
		    int a1 = teclado.nextInt();
		    System.out.println("digite a razão");
		    int r = teclado.nextInt();
		    System.out.println("digite o N de termos");
		    int n = teclado.nextInt();
		    
		    System.out.println("soma dos termos da Progressão Aritmética " + soma_pa(a1, r, n));
		    
		    
		}
	}
	
}
