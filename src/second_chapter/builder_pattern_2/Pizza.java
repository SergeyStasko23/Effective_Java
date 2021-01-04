package second_chapter.builder_pattern_2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

abstract class Pizza {
    protected enum Size {SMALL, MEDIUM, LARGE}

    protected enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    protected abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping, "Невозможно вставить пустой Topping"));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
