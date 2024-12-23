package com.example.demo.controllers;

import com.example.demo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dal.DataAccessLayer;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/unautorized")
@Slf4j
public class MainController {
    private final DataAccessLayer dataAccessLayer;
    @Autowired
    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

    @PostMapping("/create/actor")
    public ResponseEntity<String> createActor(@RequestBody Actor actor) {
        dataAccessLayer.createActor(actor);
        return ResponseEntity.ok("Actor created");
    }

    @PostMapping("/create/booking")
    public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
        dataAccessLayer.createBooking(booking);
        return ResponseEntity.ok("Booking created");
    }

    @PostMapping("/create/dataClient")
    public ResponseEntity<String> createDataClient(@RequestBody DataClient dataClient) {
        dataAccessLayer.createDataClient(dataClient);
        return ResponseEntity.ok("DataClient created");
    }

    @PostMapping("/create/dataWorkers")
    public ResponseEntity<String> createDataWorkers(@RequestBody DataWorkers dataWorkers) {
        dataAccessLayer.createDataWorkers(dataWorkers);
        return ResponseEntity.ok("DataWorkers created");
    }

    @PostMapping("/create/dateTableShow")
    public ResponseEntity<String> createDateTableShow(@RequestBody DateTableShow dateTableShow) {
        dataAccessLayer.createDateTableShow(dateTableShow);
        return ResponseEntity.ok("DateTableShow created");
    }

    @PostMapping("/create/film")
    public ResponseEntity<String> createFilm(@RequestBody Film film) {
        dataAccessLayer.createFilm(film);
        return ResponseEntity.ok("Film created");
    }

    @PostMapping("/create/genre")
    public ResponseEntity<String> createGenre(@RequestBody Genre genre) {
        dataAccessLayer.createGenre(genre);
        return ResponseEntity.ok("Genre created");
    }

    @PostMapping("/create/post")
    public ResponseEntity<String> createPost(@RequestBody Post post) {
        dataAccessLayer.createPost(post);
        return ResponseEntity.ok("Post created");
    }

    @PostMapping("/create/tickets")
    public ResponseEntity<String> createTickets(@RequestBody Tickets tickets) {
        dataAccessLayer.createTickets(tickets);
        return ResponseEntity.ok("Tickets created");
    }

//    Delete

    @DeleteMapping("/delete/actor/{id}")
    public ResponseEntity<String> deleteActorById(@PathVariable("id") long id) {
        dataAccessLayer.deleteActorById(id);
        return ResponseEntity.ok("Actor deleted");
    }

    @DeleteMapping("/delete/booking/{id}")
    public ResponseEntity<String> deleteBookingById(@PathVariable("id") long id) {
        dataAccessLayer.deleteBookingById(id);
        return ResponseEntity.ok("Booking deleted");
    }

    @DeleteMapping("/delete/dataClient/{id}")
    public ResponseEntity<String> deleteDataClientById(@PathVariable("id") long id) {
        dataAccessLayer.deleteDataClientById(id);
        return ResponseEntity.ok("DataClient deleted");
    }

    @DeleteMapping("/delete/dataWorkers/{id}")
    public ResponseEntity<String> deleteDataWorkersById(@PathVariable("id") long id) {
        dataAccessLayer.deleteDataWorkersById(id);
        return ResponseEntity.ok("DataWorkers deleted");
    }

    @DeleteMapping("/delete/dateTableShow/{id}")
    public ResponseEntity<String> deleteDateTableShowById(@PathVariable("id") long id) {
        dataAccessLayer.deleteDateTableShowById(id);
        return ResponseEntity.ok("DateTableShow deleted");
    }

    @DeleteMapping("/delete/film/{id}")
    public ResponseEntity<String> deleteFilmById(@PathVariable("id") long id) {
        dataAccessLayer.deleteDateTableShowById(id);
        return ResponseEntity.ok("Film deleted");
    }

    @DeleteMapping("/delete/genre/{id}")
    public ResponseEntity<String> deleteGenreById(@PathVariable("id") long id) {
        dataAccessLayer.deleteGenreById(id);
        return ResponseEntity.ok("Genre deleted");
    }

    @DeleteMapping("/delete/post/{id}")
    public ResponseEntity<String> deletePostById(@PathVariable("id") long id) {
        dataAccessLayer.deletePostById(id);
        return ResponseEntity.ok("Post deleted");
    }

    @DeleteMapping("/delete/Tickets/{id}")
    public ResponseEntity<String> deleteTicketsById(@PathVariable("id") long id) {
        dataAccessLayer.deleteTicketsById(id);
        return ResponseEntity.ok("Tickets deleted");
    }

//    Get

    @GetMapping("/get/actor/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable("id") long id){
        Actor actor = dataAccessLayer.getActorById(id);
        if (actor == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(actor);
        }
    }

    @GetMapping("/get/booking/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") long id){
        Booking booking = dataAccessLayer.getBookingById(id);
        if (booking == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(booking);
        }
    }

    @GetMapping("/get/dataClient/{id}")
    public ResponseEntity<DataClient> getDataClientById(@PathVariable("id") long id){
        DataClient dataClient = dataAccessLayer.getDataClientById(id);
        if (dataClient == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(dataClient);
        }
    }

    @GetMapping("/get/dataWorkers/{id}")
    public ResponseEntity<DataWorkers> getDataWorkersById(@PathVariable("id") long id){
        DataWorkers dataWorkers = dataAccessLayer.getDataWorkersById(id);
        if (dataWorkers == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(dataWorkers);
        }
    }

    @GetMapping("/get/dateTableShow/{id}")
    public ResponseEntity<DateTableShow> getDateTableShowById(@PathVariable("id") long id){
        DateTableShow dateTableShow = dataAccessLayer.getDateTableShowById(id);
        if (dateTableShow == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(dateTableShow);
        }
    }

    @GetMapping("/get/film/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable("id") long id){
        Film film = dataAccessLayer.getFilmById(id);
        if (film == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(film);
        }
    }

    @GetMapping("/get/genre/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable("id") long id){
        Genre genre = dataAccessLayer.getGenreById(id);
        if (genre == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(genre);
        }
    }

    @GetMapping("/get/post/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") long id){
        Post post = dataAccessLayer.getPostById(id);
        if (post == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(post);
        }
    }

    @GetMapping("/get/tickets/{id}")
    public ResponseEntity<Tickets> getTicketsById(@PathVariable("id") long id){
        Tickets tickets = dataAccessLayer.getTicketsById(id);
        if (tickets == null) {
            return ResponseEntity.notFound().build();
        } else{
            return ResponseEntity.ok(tickets);
        }
    }

//    Patch

    @PatchMapping("/patch/actor/{id}")
    public ResponseEntity<String> patchActorById(@PathVariable("id") long id, @RequestBody Actor updateActor){
        dataAccessLayer.updateActor(id, updateActor);
        return ResponseEntity.ok("Update actor");
    }


    @PatchMapping("/patch/booking/{id}")
    public ResponseEntity<String> patchBookingById(@PathVariable("id") long id, @RequestBody Booking updateBooking){
        dataAccessLayer.updateBooking(id, updateBooking);
        return ResponseEntity.ok("Update booking");
    }

    @PatchMapping("/patch/dataClient/{id}")
    public ResponseEntity<String> patchDataClientById(@PathVariable("id") long id, @RequestBody DataClient updateDataClient){
        dataAccessLayer.updateDataClient(id, updateDataClient);
        return ResponseEntity.ok("Update dataClient");
    }

    @PatchMapping("/patch/dataWorkers/{id}")
    public ResponseEntity<String> patchDataWorkersById(@PathVariable("id") long id, @RequestBody DataWorkers updateDataWorkers){
        dataAccessLayer.updateDataWorkers(id, updateDataWorkers);
        return ResponseEntity.ok("Update dataWorkers");
    }

    @PatchMapping("/patch/dateTableShow/{id}")
    public ResponseEntity<String> patchDateTableShowById(@PathVariable("id") long id, @RequestBody DateTableShow updateDateTableShow){
        dataAccessLayer.updateDateTableShow(id, updateDateTableShow);
        return ResponseEntity.ok("Update dateTableShow");
    }

    @PatchMapping("/patch/film/{id}")
    public ResponseEntity<String> patchFilmById(@PathVariable("id") long id, @RequestBody Film updateFilm){
        dataAccessLayer.updateFilm(id, updateFilm);
        return ResponseEntity.ok("Update film");
    }

    @PatchMapping("/patch/genre/{id}")
    public ResponseEntity<String> patchGenreById(@PathVariable("id") long id, @RequestBody Genre updateGenre){
        dataAccessLayer.updateGenre(id, updateGenre);
        return ResponseEntity.ok("Update genre");
    }

    @PatchMapping("/patch/post/{id}")
    public ResponseEntity<String> patchPostById(@PathVariable("id") long id, @RequestBody Post updatePost){
        dataAccessLayer.updatePost(id, updatePost);
        return ResponseEntity.ok("Update post");
    }

    @PatchMapping("/patch/tickets/{id}")
    public ResponseEntity<String> patchTicketsById(@PathVariable("id") long id, @RequestBody Tickets updateTickets){
        dataAccessLayer.updateTickets(id, updateTickets);
        return ResponseEntity.ok("Update tickets");
    }
}