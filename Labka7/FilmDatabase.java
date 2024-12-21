package Labka7;

import java.util.*;

public class FilmDatabase {
    public Set<Film> films = new HashSet<>(); // Множина фільмів
    public Set<MovieActor> actors = new HashSet<>(); // Множина акторів

    // Завдання 1: Чи є актор, який не знявся в жодному фільмі
    public boolean hasActorWithoutFilms() {
        for (MovieActor actor : actors) {
            if (actor.films.isEmpty()) {
                System.out.println("Актор без фільмів: " + actor.name);
                return true;
            }
        }
        return false;
    }

    // Завдання 2: Актори, які грали з заданим актором
    public Set<MovieActor> getCoActors(MovieActor actor) {
        Set<MovieActor> coActors = new HashSet<>();
        for (Film film : actor.films) {
            coActors.addAll(film.actors);
        }
        coActors.remove(actor); // Видаляємо самого актора
        return coActors;
    }

    // Завдання 3: Фільм із найбільшою кількістю акторів
    public Film getFilmWithMostActors() {
        Film mostActorsFilm = null;
        int maxActors = 0;
        for (Film film : films) {
            if (film.actors.size() > maxActors) {
                maxActors = film.actors.size();
                mostActorsFilm = film;
            }
        }
        return mostActorsFilm;
    }

    // Додаткове завдання: Знайти всі фільми за заданим актором
    public Set<Film> getFilmsByActor(MovieActor actor) {
        return new HashSet<>(actor.films);
    }
}
