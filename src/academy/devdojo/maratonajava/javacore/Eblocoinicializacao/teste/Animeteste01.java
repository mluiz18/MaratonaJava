package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
