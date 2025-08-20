package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        anime anime = new anime("Shingeki no Kyojin");
        anime.init("One Piece", "TV",1500,"Aventura");
        anime.imprime();
    }
}
