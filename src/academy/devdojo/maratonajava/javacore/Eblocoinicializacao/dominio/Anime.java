package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        System.out.println(this.nome);
    }
    public Anime() {
        for (int episodios : this.episodios) {
            System.out.println(episodios + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
