public class Pessoa
{
    private String nome;
    private int idade;
    private String natu;
    private String nacio;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa (String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.natu = "RJ";
        this.nacio = "RJ";
        this.pai = pai;
        this.mae = mae;
    }
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.natu = "RJ";
        this.nacio = "RJ";
        this.pai = null;
        this.mae = null;
    }
    
    public String get_nome (){
        return nome;
    }
    
    public int get_idade (){
        return idade;
    }
    
    public String get_pai (){
        return pai.get_nome();
    }
    
    public String get_mae (){
        return mae.get_nome();
    }
    
    public String get_avó_materno (){
        return mae.mae.get_nome();
    }
    
    public String get_avô_materno (){
        return mae.pai.get_nome();
    }
    
    public String get_avó_paterno (){
        return pai.mae.get_nome();
    }
    
    public String get_avô_paterno (){
        return pai.pai.get_nome();
    }
    
    public String toString (){
        return "nome " + get_nome() + " idade " + get_idade() + " nacionalidade " + nacio + " naturalidade " + natu + "\n Pai: " + get_pai() + "\n Mãe: " + get_mae();
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Pessoa av_1 = new Pessoa ("Jorge", 64);
		Pessoa av_2 = new Pessoa ("Maria", 65);
		Pessoa av_3 = new Pessoa ("Pedro", 72);
		Pessoa av_4 = new Pessoa ("Neuza", 75);
		Pessoa p1 = new Pessoa ("João", 35, av_1, av_2);
		Pessoa p2 = new Pessoa ("Monica", 34, av_3, av_4);
		Pessoa p0 = new Pessoa ("Ana", 10, p1, p2);
		
		
	    System.out.println(p0.toString());
	    System.out.println(p1.toString());
	    System.out.println(p2.toString());
	    System.out.println("Avós Paternos \n" + p0.get_avô_paterno() + "\n" + p0.get_avó_paterno() + "\n" + "\nAvós Maternos \n" + p0.get_avô_materno() + "\n" + p0.get_avó_materno());
	}
}
