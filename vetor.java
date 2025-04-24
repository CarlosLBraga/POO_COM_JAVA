import java.util.Scanner;

public class Main
{
    public static int soma (int a, int b){
        return a + b;
    }
    
    public static void mostra (int [] vetor, int i){
        for (int j = 0; j < i; j++){
            System.out.println("vetor " + vetor[j]);
        }
    }
    
	public static void main(String[] args) {
	    
		int [] vetor = new int[3];
		Scanner teclado = new Scanner (System.in);
		
		for (int i = 0; i < vetor.length; i++){
		    System.out.println("digite o valor" + i );
		    vetor[i] = teclado.nextInt();
		}
		
		mostra(vetor, vetor.length);
	}
}
