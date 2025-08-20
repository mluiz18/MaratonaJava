package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    public anime(String nome, String Tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = Tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public anime() {
        System.out.println("Dentro do construtor sem nada!");
    }

    public anime(String nome, String Tipo, int episodios, String genero, String estudio) {
        this(nome, Tipo, episodios, genero);
        this.estudio = estudio;

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
