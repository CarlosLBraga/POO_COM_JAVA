class Autor{
    private String nome;
    private String nacionalidade;
    
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public String get_nome(){
        return nome;
    }
    
    public String get_nacionalidade(){
        return nacionalidade;
    }
}

public class Livro {
    private String titulo;
    private Double preco;
    private Autor autor;
    
    public Livro (String titulo, Double preco, Autor autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }
    
    public String toString(){
        return " Título " + titulo + "\n preco " + preco + "\n Autor " + autor.get_nome() + "\n Nacionalidade " + autor.get_nacionalidade(); 
            
        
    }

    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Autor autor_1 = new Autor ("Machado de Assis", "Brasileiro");
        Livro livro_1 = new Livro ("Dom Cascmurro", 5.55, autor_1);
        System.out.println(livro_1);
    }
}
