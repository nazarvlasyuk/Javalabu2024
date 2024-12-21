package Labka6;

import java.util.ArrayList;
import java.util.List;

public class MovieActor {
    public String name; // Ім'я актора
    public List<Film> films; // Список фільмів, у яких знімався актор

    public MovieActor(String name) {
        this.name = name;
        this.films = new ArrayList<>(); // Ініціалізуємо порожній список фільмів
    }

    @Override
    public String toString() {
        return name; // Виводить ім'я актора у вигляді рядка
    }
}
