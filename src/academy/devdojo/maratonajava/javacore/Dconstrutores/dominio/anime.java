package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    public anime(String nome) {
        this.nome = nome;
    }

    public void init(String nome, String Tipo, int episodios) {
        this.nome = nome;
        this.tipo = Tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String Tipo, int episodios, String genero) {
        this.init(nome, Tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
