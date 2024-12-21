package Labka7;

import java.util.HashSet;
import java.util.Set;

public class MovieActor {
    public String name; // Ім'я актора
    public Set<Film> films; // Множина фільмів, у яких знімався актор

    public MovieActor(String name) {
        this.name = name;
        this.films = new HashSet<>(); // Ініціалізуємо порожню множину фільмів
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MovieActor actor = (MovieActor) obj;
        return name.equals(actor.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // Використовуємо хеш-код імені
    }

    @Override
    public String toString() {
        return name; // Виводить ім'я актора
    }
}
