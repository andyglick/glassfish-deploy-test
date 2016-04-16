package model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the film_actor database table.
 * 
 */
@Entity
@Table(name="film_actor")
@NamedQuery(name="FilmActor.findAll", query="SELECT a FROM FilmActor a")
public class FilmActor implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	
	@Id
	@JoinColumn(name = "actor_id")
//	@Column(name="actor_id", unique=true, nullable=false)
	private Actor actor;
	
	@Id
	@JoinColumn(name = "film_id")
//	@Column(name="film_id", unique=true, nullable=false)
	private Film film;
	
	@Column(name="last_update", nullable=false)
	private Timestamp lastUpdate;
	

	public FilmActor() {
	}

	public Actor getActorId() {
		return actor;
	}

	public void setActorId(Actor actor) {
		this.actor = actor;
	}
	
	public Film getFilm() {
		return film;
	}

	public void setFilmId(Film film) {
		this.film = film;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}