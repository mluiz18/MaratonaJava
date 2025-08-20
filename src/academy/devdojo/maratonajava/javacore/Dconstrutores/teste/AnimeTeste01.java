package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        anime anime = new anime("Shingeki no Kyojin", "TV", 1500, "Aventura", "Production IG");
        anime.imprime();
    }
}
