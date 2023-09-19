package com.Marco.BibbliotecaApplication.api.controller;

import com.Marco.BibbliotecaApplication.api.model.Autore;
import com.Marco.BibbliotecaApplication.api.model.Editore;
import com.Marco.BibbliotecaApplication.api.model.Libro;
import com.Marco.BibbliotecaApplication.service.AutoreService;
import com.Marco.BibbliotecaApplication.service.EditoreService;
import com.Marco.BibbliotecaApplication.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BibliotecaController {

//AUTORE
    @Autowired
    private AutoreService autoreService;

    // Ottengo tutti gli autori
    @GetMapping("/autori")
    public List<Autore> getAutori() {
        return autoreService.getAutori();
    }

    // Autore specifico
    @GetMapping("/autori/{id}")
    public Autore getAutoreById(@PathVariable int id) {
        return autoreService.getAutoreById(id);
    }

    // ADD un autore
    @PostMapping("/autori")
    public Autore aggiungiAutore(@RequestBody Autore autore) {
        return autoreService.aggiungiAutore(autore);
    }

    // EDIT un autore
    @PutMapping("/autori/{id}")
    public Autore aggiornaAutore(@PathVariable int id, @RequestBody Autore autore) {
        return autoreService.aggiornaAutore(id, autore);
    }

    // DELETE un autore
    @DeleteMapping("/autori/{id}")
    public void cancellaAutore(@PathVariable int id) {
        autoreService.cancellaAutore(id);
    }

//EDITORE
    @Autowired
    private EditoreService editoreService;

    // Ottengo tutti gli editori
    @GetMapping("/editori")
    public List<Editore> getEditori() {
        return editoreService.getEditori();
    }

    // Editore specifico
    @GetMapping("/editori/{id}")
    public Editore getEditoreById(@PathVariable int id) {
        return editoreService.getEditoreById(id);
    }

    // ADD editore
    @PostMapping("/editori")
    public Editore aggiungiEditore(@RequestBody Editore editore) {
        return editoreService.aggiungiEditore(editore);
    }

    // EDIT un editore
    @PutMapping("/editori/{id}")
    public Editore aggiornaEditore(@PathVariable int id, @RequestBody Editore editore) {
        return editoreService.aggiornaEditore(id, editore);
    }

    // DELETE un editore
    @DeleteMapping("/editori/{id}")
    public void cancellaEditore(@PathVariable int id) {
        editoreService.cancellaEditore(id);
    }

//LIBRI
    @Autowired
    private LibroService libroService;

    // Ottengo tutti i libri
    @GetMapping("/libri")
    public List<Libro> getLibri() {
        return libroService.getLibri();
    }
    // Libro specifico
    @GetMapping("/libri/{id}")
    public Libro getLibroById(@PathVariable int id) {
        return libroService.getLibroById(id);
    }
    // ADD un libro
    @PostMapping("/libri")
    public Libro aggiungiLibro(@RequestBody Libro libro) {
        return libroService.aggiungiLibro(libro);
    }
    // EDIT un libro
    @PutMapping("/libri/{id}")
    public Libro aggiornaLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.aggiornaLibro(id, libro);
    }
    // DELETE libro
    @DeleteMapping("/libri/{id}")
    public void cancellaLibro(@PathVariable int id) {
        libroService.cancellaLibro(id);
    }

}