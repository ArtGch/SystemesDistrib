package fr.polytech.TPRest.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "TypePokemon")
public class TypePokemon {
	@Column(name = "idType")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idType;
	
	@Column(name = "type")
	private String type; //Type du pokemon (feu,...)
	
	public TypePokemon(String type) {
		this.setType(type);
	}

	public int getIdType() {
		return idType;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
