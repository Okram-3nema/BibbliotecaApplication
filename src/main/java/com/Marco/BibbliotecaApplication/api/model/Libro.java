package com.Marco.BibbliotecaApplication.api.model;

public class Libro {
    private int id;
    private String titolo;
    private int annoPubblicazione;
    private int idAutore;
    private int idEditore;


    public Libro(int id, String titolo, int annoPubblicazione, int idAutore, int idEditore) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.idAutore = idAutore;
        this.idEditore = idEditore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getIdAutore() {
        return idAutore;
    }

    public void setIdAutore(int idAutore) {
        this.idAutore = idAutore;
    }

    public int getIdEditore() {
        return idEditore;
    }

    public void setIdEditore(int idEditore) {
        this.idEditore = idEditore;
    }
}
