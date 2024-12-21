package Labka7;

import java.util.Set;

public class FilmApp {
    public static void main(String[] args) {
        FilmDatabase database = new FilmDatabase();

        // Створення акторів
        MovieActor actor1 = new MovieActor("Actor 1");
        MovieActor actor2 = new MovieActor("Actor 2");
        MovieActor actor3 = new MovieActor("Actor 3");

        // Створення фільмів
        Film film1 = new Film("Film 1");
        Film film2 = new Film("Film 2");

        // Додавання акторів і ролей у фільми
        film1.addActor(actor1, "Hero");
        film1.addActor(actor2, "Villain");

        film2.addActor(actor2, "Detective");
        film2.addActor(actor3, "Suspect");

        // Додавання в базу даних
        database.films.add(film1);
        database.films.add(film2);

        database.actors.add(actor1);
        database.actors.add(actor2);
        database.actors.add(actor3);

        // Завдання 1
        System.out.println("1. Чи є актор без фільмів?");
        database.hasActorWithoutFilms();

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

        // Додаткове завдання
        System.out.println("\n4. Фільми, у яких грав Actor 2:");
        Set<Film> filmsByActor2 = database.getFilmsByActor(actor2);
        System.out.println(filmsByActor2);
    }
}
