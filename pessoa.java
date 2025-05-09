public class Pessoa
{
    String nome;
    int idade;
    Pessoa pai;
    Pessoa mae;
    Pessoa irmao[];
    Pessoa filho[];
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.irmao = new Pessoa[0];
        this.filho = new Pessoa[0];
    }
    
    public void set_pai (Pessoa pai){
        this.pai = pai;
    
    }
    
    public void set_mae (Pessoa mae){
        this.mae = mae;
    }
    
    
	public static void main(String[] args) {
	    Pessoa pessoa_1 = new Pessoa("Cadu", 23);
	    Pessoa pessoa_2 = new Pessoa("Vera", 54);
	    Pessoa pessoa_3 = new Pessoa("Eduardo", 47);
		System.out.println("Pessoa " + pessoa_1.nome + " Idade " + pessoa_1.idade);
		System.out.println("Pessoa " + pessoa_2.nome + " Idade " + pessoa_2.idade);
		System.out.println("Pessoa " + pessoa_3.nome + " Idade " + pessoa_3.idade);
		
		pessoa_1.set_mae(pessoa_2);
		pessoa_1.set_pai(pessoa_3);
		
		System.out.println("Mãe " + pessoa_1.mae.nome);
		System.out.println("Pai " + pessoa_1.pai.nome);
		
		
	}
}
