package fourth_chapter.interface_instead_of_abstract_class.interfaces;

public interface Songwriter {
    default void compose(int chartPosition) {
        System.out.println(chartPosition);
    }
}
