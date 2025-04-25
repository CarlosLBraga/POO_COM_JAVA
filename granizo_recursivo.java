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
    
    public static void granizo (int n){
        System.out.println(n);
        
        if (n == 1){
            System.out.println("fim");
        }
        else if (n % 2 == 0){
            granizo(n / 2);
        }
        else {
            granizo(n * 3 + 1);
        }
        
    }
    
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner (System.in);
	    int x = teclado.nextInt();
	    System.out.println("Sequência " + x);
	    
	    granizo(x);
		
	}
}
