package fifth_chapter.getero_containers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
