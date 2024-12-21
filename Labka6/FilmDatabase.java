package Labka6;

import java.util.*;

public class FilmDatabase {
    public List<Film> films = new ArrayList<>(); // Список фільмів
    public List<MovieActor> actors = new ArrayList<>(); // Список акторів

    // Завдання 1: Чи є актор, який не знявся в жодному фільмі
    public boolean hasActorWithoutFilms() {
        Iterator<MovieActor> iterator = actors.iterator(); // Типізований ітератор
        while (iterator.hasNext()) {
            MovieActor actor = iterator.next();
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
        for (Iterator iterator = actor.films.iterator(); iterator.hasNext(); ) { // Нептипізований ітератор
            Film film = (Film) iterator.next();
            coActors.addAll(film.actors);
        }
        coActors.remove(actor); // Видаляємо самого актора
        return coActors;
    }

    // Завдання 3: Фільм із найбільшою кількістю акторів
    public Film getFilmWithMostActors() {
        Film mostActorsFilm = null;
        int maxActors = 0;
        for (Film film : films) { // Цикл for-each
            if (film.actors.size() > maxActors) {
                maxActors = film.actors.size();
                mostActorsFilm = film;
            }
        }
        return mostActorsFilm;
    }
}
