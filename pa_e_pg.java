import java.util.Scanner;

public class Main
{
    public static final double pi = 3.14;
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	    System.out.println("Digite o valor inicial: ");
	    int a_1 = teclado.nextInt();
	    System.out.println("Digite o Número de Termos: ");
	    int n = teclado.nextInt();
	    System.out.println("Digite a Razão: ");
	    int r = teclado.nextInt();
	    
	    System.out.println("DIGITE: \n 1 - Progressão Aritmética \n 2 - Progressão Geométrica");
	    int op = teclado.nextInt();
	    
	    if (op == 1){
	        System.out.println("Progressão Aritmética \n");
	        
	        for (int i = 0; i < n; i++){
	            double termo = a_1 + (r * i);
	            System.out.print(String.format("%.2f", termo));
	            
	            if (i < n - 1){
	                System.out.print(" ,");
	            }
	        }
	        
	    }
	    else if (op == 2){
	        
	        System.out.println("Progressão Geométrica \n");
	        for (int i = 0; i < n; i++){
	            
	            double termo = a_1 * Math.pow(r, i);
	            System.out.print(String.format("%.2f", termo));
	            
	            if (i < n - 1){
	                System.out.print(" ,");
	            }
	        }
	    }
	}
}
