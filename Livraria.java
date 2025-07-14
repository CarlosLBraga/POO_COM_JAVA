import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;


abstract class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    
    public Livro (String titulo, String autor, String editora, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }
    
    
    public String get_tipo(){
        return null;
    }
    
    public String toString (){
        return null;
    }
    
    public String get_titulo (){
        return titulo;
    }
    
    public String get_autor (){
        return autor;
    }
    
    public String get_editora (){
        return editora;
    }
    
    public int get_ano (){
        return ano;
    }
    
}

class Livro_Literario extends Livro {
    private String genero_literario;
    private int idade_recomendada;
    
    public Livro_Literario (String titulo, String autor, String editora, int ano, String genero_literario, int idade_recomendada){
        super(titulo, autor, editora, ano);
        this.genero_literario = genero_literario;
        this.idade_recomendada = idade_recomendada;
    }
    
    @Override
    public String get_tipo(){
        return "Literario";
    }
    
    @Override
    public String toString(){
        return "Título " + get_titulo() + " autor " + get_autor() + " editora " + get_editora() + " genero_literario " + genero_literario + " idade_recomendada " + idade_recomendada;
    }
}

class Livro_Tecnico extends Livro {
    private String area_pesquisa;
    private String sub_area;
    
    public Livro_Tecnico (String titulo, String autor, String editora, int ano, String area_pesquisa, String sub_area){
        super(titulo, autor, editora, ano);
        this.area_pesquisa = area_pesquisa;
        this.sub_area = sub_area;
    }
    
    @Override
    public String get_tipo(){
        return "Tecnico";
    }
    
    @Override
    public String toString(){
        return "Título " + get_titulo() + " autor " + get_autor() + " editora " + get_editora() + " area de pesquisa " + area_pesquisa + " sub área de pesquisa " + sub_area;
    }
    
    
    public void set_sub_area_livro_tecnico (String sub_area){
        if (sub_area != " "){
            this.sub_area = sub_area;
        }else {
            throw new IllegalArgumentException();
        }
    }
    
    
    
    
}

public class Livraria
{
    private HashMap<String, Integer>Estoque_Livro_Literario;
    private HashMap<String, Integer>Estoque_Livro_Tecnico;
    
    public Livraria (){
        this.Estoque_Livro_Literario = new HashMap<>();
        this.Estoque_Livro_Tecnico = new HashMap<>();
    }
    
    
    
	public static void main(String[] args) {
		System.out.println("Livraria Narutinho");
		Livro_Literario livro_1 = new Livro_Literario("Abracadabra", "Lula", "PT", 2020, "Fantasia", 10);
		System.out.println(livro_1);
		System.out.println(livro_1.get_tipo());
		Livro_Tecnico livro_2 = new Livro_Tecnico("Moléculas", "Dilma", "PCC", 2011, "Química", "Física");
		System.out.println(livro_2);
		System.out.println(livro_2.get_tipo());
	}
}
