package com.Marco.BibbliotecaApplication.service;

import com.Marco.BibbliotecaApplication.api.model.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AutoreService {
    private List<Autore> autori = new ArrayList<>();
    private int autoreIdCounter = 1;

    public List<Autore> getAutori() {
        return autori;
    }

    public Autore getAutoreById(int id) {
        return autori.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public Autore aggiungiAutore(Autore autore) {
        autore.setId(autoreIdCounter++);
        autori.add(autore);
        return autore;
    }

    public Autore aggiornaAutore(int id, Autore autore) {
        for (int i = 0; i < autori.size(); i++) {
            if (autori.get(i).getId() == id) {
                autore.setId(id);
                autori.set(i, autore);
                return autore;
            }
        }
        return null;
    }

    public void cancellaAutore(int id) {
        Iterator<Autore> iterator = autori.iterator();
        while (iterator.hasNext()) {
            Autore autore = iterator.next();
            if (autore.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

}
