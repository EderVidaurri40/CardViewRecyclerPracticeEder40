package com.example.cardviewrecycler;

public class Peliculas {

    // Paso 1

    private String Title, Category, Description;
    private int Thumbnail;

    // Paso 2
    // alt + insert - Generar Constructor


    public Peliculas() {
    }

    // Paso 3
    // Generar Constructor - Title, Category, Description, Thumbnail


    public Peliculas(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    // Paso 4
    // Getters - Title, Category, Description Thumbnail


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    // Paso 5
    // Setters


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }


}
