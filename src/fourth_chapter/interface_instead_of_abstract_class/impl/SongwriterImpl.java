package fourth_chapter.interface_instead_of_abstract_class.impl;

import fourth_chapter.interface_instead_of_abstract_class.interfaces.Songwriter;

public class SongwriterImpl implements Songwriter {
    @Override
    public void compose(int chartPosition) {
        System.out.println(chartPosition);
    }
}
