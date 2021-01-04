package second_chapter.interface_has_static_method;

public interface A {
    static A getInstance(A a) {
        return a;
    }

    String getName();
}
