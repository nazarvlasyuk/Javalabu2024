package Labka6;

import java.util.Set;

public class FilmApp {
    public static void main(String[] args) {
        FilmDatabase database = new FilmDatabase();

        // Створення акторів і фільмів
        MovieActor actor1 = new MovieActor("Actor 1");
        MovieActor actor2 = new MovieActor("Actor 2");
        MovieActor actor3 = new MovieActor("Actor 3");
        MovieActor actor4 = new MovieActor("Actor 4");

        Film film1 = new Film("Film 1");
        Film film2 = new Film("Film 2");
        Film film3 = new Film("Film 3");

        // Заповнення списків
        film1.actors.add(actor1);
        film1.actors.add(actor2);

        film2.actors.add(actor2);
        film2.actors.add(actor3);

        film3.actors.add(actor1);
        film3.actors.add(actor3);
        film3.actors.add(actor4);

        actor1.films.add(film1);
        actor1.films.add(film3);

        actor2.films.add(film1);
        actor2.films.add(film2);

        actor3.films.add(film2);
        actor3.films.add(film3);

        actor4.films.add(film3);

        database.films.add(film1);
        database.films.add(film2);
        database.films.add(film3);

        database.actors.add(actor1);
        database.actors.add(actor2);
        database.actors.add(actor3);
        database.actors.add(actor4);

        // Завдання 1
        System.out.println("1. Чи є актор без фільмів?");
        boolean hasActorWithoutFilms = database.hasActorWithoutFilms();
        if (!hasActorWithoutFilms) {
            System.out.println("Усі актори знімалися у фільмах.");
        }

        // Завдання 2
        System.out.println("\n2. Актори, які грали з Actor 1:");
        Set<MovieActor> coActors = database.getCoActors(actor1);
        System.out.println(coActors);

        // Завдання 3
        System.out.println("\n3. Фільм із найбільшою кількістю акторів:");
        Film mostActorsFilm = database.getFilmWithMostActors();
        if (mostActorsFilm != null) {
            System.out.println("Фільм: " + mostActorsFilm.title + ", кількість акторів: " + mostActorsFilm.actors.size());
        }
    }
}
