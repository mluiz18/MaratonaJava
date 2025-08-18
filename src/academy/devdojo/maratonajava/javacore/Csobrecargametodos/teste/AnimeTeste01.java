package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        anime anime = new anime();
        anime.init("One Piece", "TV",1500,"Aventura");
        anime.imprime();
    }
}
