package fourth_chapter.interface_instead_of_abstract_class.impl;

import fourth_chapter.interface_instead_of_abstract_class.interfaces.SingerSongwriter;

public class ArtistImpl implements SingerSongwriter {
    @Override
    public void strum() {
        System.out.println("STRUM");
    }

    @Override
    public void actSensitive() {
        System.out.println("ACT SENSITIVE");
    }
}
