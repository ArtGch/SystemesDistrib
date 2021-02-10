package fr.polytech.TPRest.Classes;

import org.hibernate.Session;

import static fr.polytech.TPRest.Classes.HibernateFactory.getSession;

public class PokemonManager {
    public Pokemon create(Pokemon pokemon) {
        Session session = getSession();
        session.beginTransaction();
        session.save(pokemon);
        session.getTransaction().commit();
        return pokemon;
    }

    public Pokemon update(Pokemon pokemon) {
        Session session = getSession();
        session.beginTransaction();
        session.update(pokemon);
        session.getTransaction().commit();
        return pokemon;
    }
    
    public Pokemon delete(Pokemon pokemon) {
        Session session = getSession();
        session.beginTransaction();
        session.delete(pokemon);
        session.getTransaction().commit();
        return pokemon;
    }
}
