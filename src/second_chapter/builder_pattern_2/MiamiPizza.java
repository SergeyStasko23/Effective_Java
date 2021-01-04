package second_chapter.builder_pattern_2;

public class MiamiPizza extends Pizza {
    private final Size size;
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        private boolean sauceInside = false;

        Builder(Size size) {
            this.size = size;
        }

        Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        MiamiPizza build() {
            return new MiamiPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private MiamiPizza(Builder builder) {
        super(builder);
        size = builder.size;
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "MiamiPizza{" +
                "size=" + size +
                ", sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
