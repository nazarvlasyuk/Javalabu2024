package Labka7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Film {
    public String title; // Назва фільму
    public Set<MovieActor> actors; // Множина акторів
    public Map<MovieActor, String> roles; // Ролі акторів у фільмі

    public Film(String title) {
        this.title = title;
        this.actors = new HashSet<>(); // Ініціалізуємо порожню множину акторів
        this.roles = new HashMap<>(); // Ініціалізуємо порожню мапу ролей
    }

    public void addActor(MovieActor actor, String role) {
        actors.add(actor);
        roles.put(actor, role); // Додаємо актора та його роль у мапу
        actor.films.add(this); // Додаємо фільм у список фільмів актора
    }

    @Override
    public String toString() {
        return title + " (" + roles + ")";
    }
}
