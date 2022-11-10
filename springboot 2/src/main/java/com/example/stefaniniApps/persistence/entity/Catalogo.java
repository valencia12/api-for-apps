package com.example.stefaniniApps.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("catalogo")
public class Catalogo {
    /*
     * Agregar:
     * - ID: q1123weads
     * - Name: Example
     * - Description: This is a Description
     * - Category: [ para filtrar por categoria] String
     * - Precio 23$ String
     * - url: "http://example.com/" String
     * - number_rating: 0 - 5 int
     *
     * 
     */
    @Id
    private String id;
    private String name;
    private String description;
    private String category;
    private Double price;
    private String url;
    private Integer numberRating;
    private String banner;
    private Boolean isInstalled;

    public Catalogo(String id, String name, String description, String category, Double price, String url,
            Integer numberRating, String banner, Boolean isInstalled) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.url = url;
        this.numberRating = numberRating;
        this.banner = banner;
        this.isInstalled = isInstalled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNumberRating() {
        return numberRating;
    }

    public void setNumberRating(Integer numberRating) {
        this.numberRating = numberRating;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public void setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    public Boolean getIsInstalled() {
        return isInstalled;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                ", numberRating=" + numberRating +
                ", banner='" + banner + '\'' +
                '}';
    }
}
