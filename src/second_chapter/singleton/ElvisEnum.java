package second_chapter.singleton;

// Синглтон-перечисление — предпочтительный подход
public enum ElvisEnum implements Singleton {
    INSTANCE(1L);

    private Long initId;

    ElvisEnum(Long initId) {
        this.initId = initId;
    }

    public Long getInitId() {
        return initId;
    }
}
