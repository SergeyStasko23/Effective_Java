package third_chapter;

public class LastOwner {
    private String name;

    public LastOwner(String name) {
        this.name = name;
    }

    static LastOwner newInstance(LastOwner lastOwner) {
        return new LastOwner(lastOwner.name);
    }
}
