package second_chapter.builder_pattern_2;

import java.util.Objects;

public class NewYorkPizza extends Pizza {
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NewYorkPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NewYorkPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
