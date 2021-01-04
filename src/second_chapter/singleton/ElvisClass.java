package second_chapter.singleton;

class ElvisClass implements Singleton {
    private static transient Long INIT_ID;
    private static final ElvisClass INSTANCE;

    static {
        INSTANCE = new ElvisClass(1L);
    }

    private ElvisClass(Long initId) {
        ElvisClass.INIT_ID = initId;
    }

    static ElvisClass getInstance() {
        return INSTANCE;
    }

    static Long getInitId() {
        return ElvisClass.INIT_ID;
    }

    // Метод readResolve для сохранения свойства синглтона
    // Возвращает истинный объект Elvis и позволяет сборщику мусора позаботиться о самозванце
    private Object readResolve() {
        return INSTANCE;
    }
}
