package Labka6;

import java.util.ArrayList;
import java.util.List;

public class Film {
    public String title; // Назва фільму
    public List<MovieActor> actors; // Список акторів у фільмі

    public Film(String title) {
        this.title = title;
        this.actors = new ArrayList<>(); // Ініціалізуємо порожній список акторів
    }

    @Override
    public String toString() {
        return title; // Виводить назву фільму у вигляді рядка
    }
}
