package com.anwar.ecom_project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  int id;
//    private String name;
//    private String desc;
//    private String brand;
//    private BigDecimal price;
//    private String category;
//    private Date releaseDate;
//    private boolean available;
//    private int quantity;
//
//}



@Entity
public class  Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String description;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("category")
    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
    @JsonProperty("releaseDate")
    private Date releaseDate;

    @JsonProperty("available")
    private boolean productAvailable;

    @JsonProperty("quantity")
    private int StockQuantity;

    @JsonProperty("image-name")
    private String imageName;

    @JsonProperty("image-type")
    private String imageType;

    @JsonProperty("image-date")
    @Lob
    private byte[]  imageDate;
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailable() {
        return productAvailable;
    }

    public void setAvailable(boolean available) {
        this.productAvailable = available;
    }

    public int getQuantity() {
        return StockQuantity;
    }

    public void setQuantity(int quantity) {
        this.StockQuantity = quantity;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

}

