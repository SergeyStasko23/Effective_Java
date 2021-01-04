package second_chapter.interface_has_static_method;

class B implements A {
    private String name;

    private B(String name) {
        this.name = name;
    }

    static B newInstance(String name) {
        return new B(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
