import java.util.Scanner;

class Ingredientes{
    private String cabeca;
    private String corpo;
    private String coracao;
    
    
    public Ingredientes (String cabeca, String corpo, String coracao){
        this.cabeca = cabeca;
        this.corpo = corpo;
        this.coracao = coracao;
    }
    
    public String get_cabeca(){
        return cabeca;
    }
    public String get_corpo(){
        return corpo;
    }
    public String get_coracao(){
        return coracao;
    }
}

public class Perfume
{
    private String nome;
    private String marca;
    private String familia;
    private Ingredientes ingredientes;
    
    public Perfume (String nome, String marca, String familia, Ingredientes ingredientes){
        this.nome = nome;
        this.marca = marca;
        this.familia = familia;
        this.ingredientes = ingredientes;
    }
    
    public String toString(){
        return "Perfume: " + nome + "\n Marca: " + marca + "\n Família: " + "\n notas cabeca: " + ingredientes.get_cabeca() + "\n corpo: " + ingredientes.get_corpo() + "\n coracao: " + ingredientes.get_coracao() + ".";
    }
    
    public void compartivo (){
        
    }
    
	public static void main(String[] args) {
		Ingredientes ing_1 = new Ingredientes("Lavanda", "Baunilha", "Sandalo");
		Perfume p_1 = new Perfume("Le Male", "Jean Paul Gaultier", "Oriental", ing_1);
		System.out.println(p_1);
	}
}
