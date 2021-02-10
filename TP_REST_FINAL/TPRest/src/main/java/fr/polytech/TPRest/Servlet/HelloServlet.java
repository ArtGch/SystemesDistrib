package fr.polytech.TPRest.Servlet;

import fr.polytech.TPRest.Classes.Pokemon;
import fr.polytech.TPRest.Classes.PokemonManager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static List<Pokemon> pokemons = new ArrayList<>();
	static {
		pokemons.add(new Pokemon(0,"Bulbizarre",5));
		pokemons.add(new Pokemon(1,"Salameche",5));
		pokemons.add(new Pokemon(2,"Carapuce",5));
	}
	
    @GET
    @Path("sayHello")
    public String sayHello() {
        return "hello";
    }
    
    @POST
    @Path("ajoutPokemon")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon addPokemon(Pokemon pokemon) {
    	PokemonManager pokemonManager = new PokemonManager();
    	return pokemonManager.create(pokemon);
   }

    @PUT
    @Path("changementNiveau")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon changementNiveau(String nom, int niveau) {
    	PokemonManager pokemonManager = new PokemonManager();
    	for(Pokemon pokemon : pokemons) {
    		if(pokemon.getNom().equals(nom)) {
    			return pokemonManager.update(pokemon);
    		}
    	}
		return null;
    }
    
    @DELETE
    @Path("mortPokemon")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon mortPokemon(String nom) {
    	PokemonManager pokemonManager = new PokemonManager();
    	for(Pokemon pokemon : pokemons) {
    		if(pokemon.getNom().equals(nom)) {
    			return pokemonManager.delete(pokemon);
    		}
    	}
		return null;
    }
}
