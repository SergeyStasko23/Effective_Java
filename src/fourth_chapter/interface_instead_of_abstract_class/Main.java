package fourth_chapter.interface_instead_of_abstract_class;

import fourth_chapter.interface_instead_of_abstract_class.impl.ArtistImpl;
import fourth_chapter.interface_instead_of_abstract_class.impl.SingerImpl;
import fourth_chapter.interface_instead_of_abstract_class.interfaces.Singer;
import fourth_chapter.interface_instead_of_abstract_class.interfaces.SingerSongwriter;

public class Main {
    public static void main(String[] args) {
        Singer singer = new SingerImpl();
        singer.sing("MASTER OF PUPPETS");

        SingerSongwriter singerSongwriter = new ArtistImpl();
        singerSongwriter.compose(100);
    }
}
