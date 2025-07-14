import java.util.Random;
public class Oraculo
{
    private String [] colecao;
    
    public Oraculo (){
        colecao = new String [] {"Epifania", "Lamentação", "Gratidão", "Solitude", "Imaginação", "Nostalgia", "Iluminação", "Escuridão", "Vida"};
    }
    
    public String PickCard (){
        Random rand = new Random();
        int numero = rand.nextInt(9);
        return Integer.toString(numero + 1) + " " + colecao[numero];
    }
    
    public String YesOrNo (int n) throws IllegalArgumentException {
        if (n == 2 || n == 3) {
            int sorte = 0;
            for (int i = 0; i < n; i ++){
                Random rand = new Random();
                int numero = rand.nextInt();
                
                if (numero % 2 == 0){
                    sorte --;
                }
                else{
                    sorte ++;
                }
            }
            
            if (sorte > 0){
                return "sim";
            } else if (sorte < 0){
                return "não";
            } else {
                return "talvez";
            }
            
        }
        else throw new IllegalArgumentException();
    }
    
    
    public String YesOrNo (){
        Random rand = new Random();
        int n = rand.nextInt(9);
        if ((n+1) % 2 == 0){
            return "não " + colecao[n];
        }
        else{
            return"sim " + colecao[n];
            }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Oraculo n = new Oraculo();
		System.out.println(n.PickCard());
		System.out.println(n.YesOrNo());
		
	}
}
