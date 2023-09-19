package com.Marco.BibbliotecaApplication.service;

import com.Marco.BibbliotecaApplication.api.model.Editore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EditoreService {
    private List<Editore> editori = new ArrayList<>();
    private int editoreIdCounter = 1;

    public List<Editore> getEditori() {
        return editori;
    }

    public Editore getEditoreById(int id) {
        return editori.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public Editore aggiungiEditore(Editore editore) {
        editore.setId(editoreIdCounter++);
        editori.add(editore);
        return editore;
    }

    public Editore aggiornaEditore(int id, Editore editore) {
        for (int i = 0; i < editori.size(); i++) {
            if (editori.get(i).getId() == id) {
                editore.setId(id);
                editori.set(i, editore);
                return editore;
            }
        }
        return null;
    }

    public void cancellaEditore(int id) {
        Iterator<Editore> iterator = editori.iterator();
        while (iterator.hasNext()) {
            Editore editore = iterator.next();
            if (editore.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}


