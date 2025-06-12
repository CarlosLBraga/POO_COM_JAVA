import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Pessoa
{
    private String nome;
    private int idade;
    private String naturalidade;
    private String nacionalidade;
    private boolean tem_filhos;
    private Pessoa mae;
    private Pessoa pai;
    private ArrayList<Pessoa> filhos;
    
    public Pessoa (String nome, int idade, String naturalidade, String nacionalidade, boolean tem_filhos){
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.tem_filhos = tem_filhos;
        this.filhos = new ArrayList<Pessoa>();
    }
    
    public void set_mae (Pessoa mae) {
        this.mae = mae;
    }
    
    public void set_pai (Pessoa pai) {
        this.pai = pai;
    }
    
    public String toString (){
        return "Nome " + nome + " idade " + idade + " naturalidade " + naturalidade + " nacionalidade " + nacionalidade;
    }
    
    public ArrayList<Pessoa> avos_maternos (Pessoa p){
        ArrayList<Pessoa> lista_avo_materno = new ArrayList<>();
        lista_avo_materno.add(p.mae.mae);
        lista_avo_materno.add(p.mae.pai);
        return lista_avo_materno;
    }
    
    public ArrayList<Pessoa> lista_avos_maternos (Pessoa p){
        ArrayList<Pessoa> avos_maternos = new ArrayList<>();
        try {
            avos_maternos.add(p.mae.mae);
            avos_maternos.add(p.mae.pai);
            
        } catch(NullPointerException e) {
            System.out.println("erro");
        }
        return avos_maternos;
    }
    
    public ArrayList<Pessoa> adiciona_filhos (Pessoa filho){
        
        if (filho == null){
            System.out.println("SEM FILHOS");
            return this.filhos;
        }
        
        try{
            this.filhos.add(filho);
            
        } catch(NullPointerException e){
            System.out.println("Erro ao adicionar filho: lista não inicializada.");
            this.filhos = new ArrayList<>();
            this.filhos.add(filho);
        }
        return this.filhos;
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Pessoa p1 = new Pessoa ("Carlos", 24, "RJ", "Brasileira", false);
		Pessoa mae_1 = new Pessoa ("Vera", 53, "RJ", "Brasileira", true);
		Pessoa pai_1 = new Pessoa ("Eduardo", 55, "RJ", "Brasileira", true);
		Pessoa mae_2 = new Pessoa ("Maria", 88, "RJ", "Brasileira", true);
		Pessoa pai_2 = new Pessoa ("José", 90, "RJ", "Brasileira", true);
		
		p1.set_pai(pai_1);
		p1.set_mae(mae_1);
		mae_1.set_mae(mae_2);
		mae_1.set_pai(pai_2);
		System.out.println(p1);
		System.out.println(mae_1);
		System.out.println(pai_1);
		
	}
}
