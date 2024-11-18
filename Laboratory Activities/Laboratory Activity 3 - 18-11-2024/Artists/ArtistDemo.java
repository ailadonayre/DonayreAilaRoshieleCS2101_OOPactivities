package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist ariana = new Artist("Ariana Grande", 31, "Music");
        System.out.println();
        ariana.displayInfo();

        Singer sabrina = new Singer("Sabrina Carpenter", 25, "Music", Singer.Genre.POP);
        sabrina.displayInfo();

        Painter frida = new Painter("Frida Kahlo", 47, "Visual Art", Painter.Medium.OIL);
        frida.displayInfo();

        Writer murakami = new Writer("Haruki Murakami", 75, "Literature", Writer.WritingStyle.FICTION);
        murakami.displayInfo();

        Dancer mark = new Dancer("Mark Lee", 25, "Dance", Dancer.DanceStyle.HIPHOP);
        mark.displayInfo();
    }
}
