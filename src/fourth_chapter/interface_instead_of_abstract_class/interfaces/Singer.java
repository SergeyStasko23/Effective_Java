package fourth_chapter.interface_instead_of_abstract_class.interfaces;

public interface Singer {
    default void sing(String song) {
        System.out.println(song);
    }
}
