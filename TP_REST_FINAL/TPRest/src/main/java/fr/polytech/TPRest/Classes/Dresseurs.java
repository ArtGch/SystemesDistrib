package fr.polytech.TPRest.Classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Dresseurs")
public class Dresseurs {
	@Column(name = "idDresseurs")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDresseurs;
	
	@Column(name = "nomDresseurs")
	private String nomDresseurs;
	
	@OneToMany( targetEntity=Pokemon.class, mappedBy="Dresseurs" )
    private List<Pokemon> commands = new ArrayList<>();
	
	public Dresseurs(String nomDresseurs) {
		this.setNomDresseurs(nomDresseurs);
	}
	
	public int getIdDresseurs() {
		return idDresseurs;
	}
	
	public String getNomDresseurs() {
		return nomDresseurs;
	}

	public void setNomDresseurs(String nomDresseurs) {
		this.nomDresseurs = nomDresseurs;
	}
}
