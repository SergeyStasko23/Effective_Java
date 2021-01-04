package second_chapter.interface_has_static_method;

class C implements A {
    private String name;

    private C(String name) {
        this.name = name;
    }

    static C newInstance(String name) {
        return new C(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
