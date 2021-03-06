package com.streammedia.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Role.
 *
 * @author Jeanne
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "Crew")
@Table(name = "Crew")
//@Proxy(lazy=false)
public class Crew {
    @Id
    @Column(name = "crew_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int crewId;;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "profession")
    private String profession;
    @Column(name = "biography")
    private String biography;

    @Column(name = "created_at")
    @CreationTimestamp
    @EqualsAndHashCode.Exclude
    private LocalDate createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    @EqualsAndHashCode.Exclude
    private LocalDate updateAt;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "crews")
    private Set<Film> films = new HashSet<>();

    /**
     * Add film.
     *
     * @param film the film
     */
    public void addFilm(Film film) {
        this.films.add(film);
        film.getCrews().add(this);
    }

    /**
     * Remove film.
     *
     * @param film the film
     */
    public void removeFilm(Film film) {
        this.films.remove(film);
        film.getCrews().remove(this);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
