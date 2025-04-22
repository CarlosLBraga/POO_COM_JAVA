import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		
		Scanner teclado = new Scanner(System.in);
		
        int n = teclado.nextInt();
        
        System.out.println("Valor da Sequência " + (n));
        
        if (n <= 1){
            System.out.println("Não é possível realizar a Sequência");
        }
        
        
        else{
            n--;
            do{
                if (n % 2 == 0) {
                    
                    //System.out.println("o número é par " + n);
                    n = n / 2; 
                    System.out.println("Sequência: " + n);
                    
                
                }
                else{
                    //System.out.println("o número é impar");
                    n = (n * 3) + 1;
                    System.out.println("Sequência: " + n);
                }
            
            
            } while (n > 1);
	   
	   
            }
            System.out.print("Fim da Execução");
            
            
}
}
