package hu.nye.progkor.movie.model;

import java.util.Objects;

/**
 * Movie model.
 */
public class Movie {

  private int id;
  private String title;
  private int year;
  private Genre genre;

  public Movie() {
  }

  /**
   * Movie constructor.
   */
  public Movie(int id, String title, int year, Genre genre) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.genre = genre;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public Genre getGenre() {
    return genre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Movie)) {
      return false;
    }
    Movie movie = (Movie) o;
    return id == movie.id && year == movie.year
            && Objects.equals(title, movie.title) && genre == movie.genre;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, year, genre);
  }

  @Override
  public String toString() {
    return "Movie{"
            +
            "id=" + id
            +
            ", title='" + title + '\''
            +
            ", year=" + year
            +
            ", genre=" + genre
            +
            '}';
  }
}
