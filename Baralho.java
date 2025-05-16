import java.util.Random;

public class Baralho
{
    private String naipe;
    private int numero;
    public Baralho (String naipe, int numero){
        this.naipe = naipe;
        this.numero = numero;
    }
    
    public Baralho (String naipe){
        this.naipe = naipe;
        Random rand = new Random();
        int num = rand.nextInt(13) + 1;
        this(num,naipe);
    }
    
    public String tostring() {
        switch (this.num){
            case 1: return "ás de " + this.naipe;
            case 11: return "valete de " + this.naipe;
            case 12: return "dama de" + this.naipe;
            case 13: return "Rei de " + this.naipe;
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Random rand = new Random (); 
		System.out.println(rand.nextInt(13) + 1);
	}
}
