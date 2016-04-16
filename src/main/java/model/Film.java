package model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the film database table.
 * 
 */
@Entity
@Table(name="film")
@NamedQuery(name="Film.findAll", query="SELECT a FROM Film a")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="filmId", orphanRemoval=true,targetEntity=FilmActor.class)
	@Id
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="title", nullable=false, length=255)
	private String title;

	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private Date releaseYear;

	@Column(name="language_id", unique=true, nullable=false)
	private int languageId;
	
	@Column(name="original_language_id", unique=true)
	private int originalLanguageId;
	
	@Column(name="rental_duration", unique=true, nullable=false)
	private int rentalDuration;
	
	@Column(name="rental_rate", nullable=false)
	private BigDecimal rentalRate;
	
	@Column(name="length", unique=true)
	private int length;
	
	@Column(name="replacement_cost", nullable=false)
	private BigDecimal replacementCost;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="special_features")
	private String specialFeatures;
	
	@Column(name="last_update", nullable=false)
	private Timestamp lastUpdate;
	

	public Film() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getReleaseYear() {
		return this.releaseYear;
	}
	
	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public int getLanguageId() {
		return this.languageId;
	}
	
	
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
	public int getOriginalLanguageId() {
		return this.originalLanguageId;
	}
	
	public void setOriginalLanguageId(int originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}
	
	public int getRentalDuration() {
		return this.rentalDuration;
	}
	
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	public BigDecimal getRentalRate() {
		return this.rentalRate;
	}
	
	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public BigDecimal getReplacementCost() {
		return this.replacementCost;
	}
	
	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getSpecialFeatures() {
		return this.specialFeatures;
	}
	
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}