package second_chapter.interface_has_static_method;

public class Main {
    public static void main(String[] args) {
        A b = A.getInstance(B.newInstance("B"));
        A c = A.getInstance(C.newInstance("C"));

        System.out.println(b instanceof A);
        System.out.println(b instanceof B);

        System.out.println(c instanceof A);
        System.out.println(c instanceof C);

        System.out.println(b.getName());
        System.out.println(c.getName());
    }
}
