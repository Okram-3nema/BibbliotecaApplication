package com.Marco.BibbliotecaApplication.service;

import com.Marco.BibbliotecaApplication.api.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class LibroService {
    private List<Libro> libri = new ArrayList<>();
    private int libroIdCounter = 1;

    public List<Libro> getLibri() {
        return libri;
    }

    public Libro getLibroById(int id) {
        return libri.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    public Libro aggiungiLibro(Libro libro) {
        libro.setId(libroIdCounter++);
        libri.add(libro);
        return libro;
    }

    public Libro aggiornaLibro(int id, Libro libro) {
        for (int i = 0; i < libri.size(); i++) {
            if (libri.get(i).getId() == id) {
                libro.setId(id);
                libri.set(i, libro);
                return libro;
            }
        }
        return null;
    }

    public void cancellaLibro(int id) {
        Iterator<Libro> iterator = libri.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}

