
package com.example.demo.dal;

import com.example.demo.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataAccessLayer {
    private final SessionFactory sessionFactory;
    @Autowired
    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    Session session = null;

//    Post

    public void createActor(Actor newActor) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newActor);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createBooking(Booking newBooking) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newBooking);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createDataClient(DataClient newDataClient) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newDataClient);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createDataWorkers(DataWorkers newDataWorkers) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newDataWorkers);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createDateTableShow(DateTableShow newDateTableShow) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newDateTableShow);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createFilm(Film newFilm) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newFilm);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createGenre(Genre newGenre) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newGenre);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createPost(Post newPost) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newPost);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createTickets(Tickets newTickets) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newTickets);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

//    Delete

    public void deleteActorById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Actor actor = session.get(Actor.class, id);
        session.remove(actor);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteBookingById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Booking booking = session.get(Booking.class, id);
        session.remove(booking);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteDataClientById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        DataClient dataClient = session.get(DataClient.class, id);
        session.remove(dataClient);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteDataWorkersById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        DataWorkers dataWorkers = session.get(DataWorkers.class, id);
        session.remove(dataWorkers);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteDateTableShowById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        DateTableShow dateTableShow = session.get(DateTableShow.class, id);
        session.remove(dateTableShow);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteFilmById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Film film = session.get(Film.class, id);
        session.remove(film);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteGenreById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Genre genre = session.get(Genre.class, id);
        session.remove(genre);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deletePostById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Post post = session.get(Post.class, id);
        session.remove(post);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteTicketsById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Tickets tickets = session.get(Tickets.class, id);
        session.remove(tickets);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

//    Get

    public Actor getActorById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Actor actor = session.get(Actor.class, id);
            return actor;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Booking getBookingById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Booking booking = session.get(Booking.class, id);
            return booking;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public DataClient getDataClientById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            DataClient dataClient = session.get(DataClient.class, id);
            return dataClient;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public DataWorkers getDataWorkersById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            DataWorkers dataWorkers = session.get(DataWorkers.class, id);
            return dataWorkers;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public DateTableShow getDateTableShowById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            DateTableShow dateTableShow = session.get(DateTableShow.class, id);
            return dateTableShow;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Film getFilmById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Film film = session.get(Film.class, id);
            return film;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Genre getGenreById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Genre genre = session.get(Genre.class, id);
            return genre;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Post getPostById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Post post = session.get(Post.class, id);
            return post;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Tickets getTicketsById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Tickets tickets = session.get(Tickets.class, id);
            return tickets;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

//    Patch

//    public Client patchClientById(long id, Client updatedClient){
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        try {
//            Client client = session.get(Client.class, id);
//
//            client.setNameClient(updatedClient.getNameClient());
//            client.setPhoneClient(updatedClient.getPhoneClient());
//            client.setEmailClient(updatedClient.getEmailClient());
//
//            session.merge(client);
//            session.getTransaction().commit();
//            return client;
//        } finally {
//            if (session != null){
//                session.close();
//            }
//        }
//    }

    public void updateActor(long id, Actor updatedActor) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Actor actor = session.get(Actor.class, id);
        actor.setId(updatedActor.getId());
        session.merge(actor);
        session.getTransaction().commit();
    }


    public void updateBooking(long id, Booking updatedBooking) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Booking booking = session.get(Booking.class, id);
        booking.setId(updatedBooking.getId());
        session.merge(booking);
        session.getTransaction().commit();
    }

    public void updateDataClient(long id, DataClient updatedDataClient) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        DataClient dataClient = session.get(DataClient.class, id);
        dataClient.setId(updatedDataClient.getId());
        session.merge(dataClient);
        session.getTransaction().commit();
    }

    public void updateDataWorkers(long id, DataWorkers updatedDataWorkers) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        DataWorkers dataWorkers = session.get(DataWorkers.class, id);
        dataWorkers.setLogin(updatedDataWorkers.getLogin());
        session.merge(dataWorkers);
        session.getTransaction().commit();
    }

    public void updateDateTableShow(long id, DateTableShow updatedDateTableShow) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        DateTableShow dateTableShow = session.get(DateTableShow.class, id);
        dateTableShow.setId(updatedDateTableShow.getId());
        session.merge(dateTableShow);
        session.getTransaction().commit();
    }

    public void updateFilm(long id, Film updatedFilm) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Film film = session.get(Film.class, id);
        film.setFilmId(updatedFilm.getFilmId());
        session.merge(film);
        session.getTransaction().commit();
    }

    public void updateGenre(long id, Genre updatedGenre) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Genre genre = session.get(Genre.class, id);
        genre.setId(updatedGenre.getId());
        session.merge(genre);
        session.getTransaction().commit();
    }

    public void updatePost(long id, Post updatedPost) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Post post = session.get(Post.class, id);
        post.setPostId(updatedPost.getPostId());
        session.merge(post);
        session.getTransaction().commit();
    }

    public void updateTickets(long id, Tickets updatedTickets) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Tickets tickets = session.get(Tickets.class, id);
        tickets.setId(updatedTickets.getId());
        session.merge(tickets);
        session.getTransaction().commit();
    }








}

