package fr.polytech.TPRest.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pokemon")
public class Pokemon {
	 	@javax.persistence.Id
	    @Column(name = "Id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int Id;

	 	@Column(name = "nom")
	    String nom;
	 	
	 	@Column(name = "niveau")
	    int niveau;

	    @OneToOne
	    @JoinColumn(name="idType",nullable=false)
	    private TypePokemon typePokemon;
	    
	    @ManyToOne  
	    @JoinColumn( name="iDresseurs" )
	    private Dresseurs dresseurs;
	    
	    public Pokemon() {}

	    public Pokemon(int Id, String nom, int niveau) {
	        this.Id     = Id;
	        this.nom    = nom;
	        this.niveau = niveau;
	    }

	    public int getId() {
	        return Id;
	    }

	    public void setId(int Id) {
	        this.Id = Id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public int getNiveau()
	    {
	        return niveau;
	    }

	    public void setNiveau(int niveau) {
	        this.niveau = niveau;
	    }

	    @Override
	    public String toString() {
	        return "Pokemon[Pokemon " + nom + ", au niveau " + niveau + ']';
	    }
}
