import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int verificador = 0;
	    Scanner teclado = new Scanner (System.in);
	    System.out.println("Digite o primeiro número 1 :  ");
	    int n1 = teclado.nextInt();
	    System.out.println(n1);
	    System.out.println("Digite o segundo número 2 : ");
	    int n2 = teclado.nextInt();
	    System.out.println("Digite o segundo número 3 : ");
	    int n3 = teclado.nextInt();
	    
	    if (n2 + 1 == n1 || n2 - 1 == n1 || n2 + 1 == n3 || n2 - 1 == n3){
	        verificador ++;
	    }
	    if (n3 + 1 == n1 || n3 - 1 == n1 || n3 + 1 == n2 || n3 - 1 == n2){
	        verificador ++;
	    }
	    
	    
	    if (verificador > 1){ System.out.println("Consecutivos"); }
	    
	    
	    else { System.out.println("Não Consecutivos"); }
	    
		
	}
}
