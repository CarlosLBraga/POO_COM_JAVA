import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	    System.out.println("Digite um valor em minutos  (não negativo) ");
	    float minutos = teclado.nextInt();
	    float horas = minutos / 60;
	    System.out.println(horas + " horas");
	    
	    
		
	}
}
