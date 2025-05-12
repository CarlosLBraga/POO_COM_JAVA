public class Pessoa {

    private String nome;
    private int idade;
    
    
    public Pessoa (String nome, int idade){
        
        this.nome = nome;
        this.idade = idade;
        
    }
    
    public String toString(){
        return "Olá, meu nome é " + nome + " e eu tenho " + idade + " anos";                                                                                                
    }
    

	public static void main(String[] args) {
		System.out.println("Hello World");
		Pessoa p_1 = new Pessoa("Cadu", 24);
		System.out.println(p_1);
		
	}
}
