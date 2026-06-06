// package com.praneetha.springecom.model;


// import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// import java.math.BigDecimal;
// import java.util.Date;

// @Entity
// @Data

// public class Product {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;
//     private String name;
//     private String description;
//     private String brand;
//     private BigDecimal price;
//     private String category;
//     private Date releaseDate;
//     private boolean productAvailable;
//     private int stockQuantity;
//     private String imageName;
//     private String imageType;
//     @Lob
//     private byte[] imageData;

//   public Product() {
// }
//    public Product(int id) {
//        this.id = id;
//      }

   
//     public String getImageName() {
//     return imageName;
// }

// public void setImageName(String imageName) {
//     this.imageName = imageName;
// }

// public String getImageType() {
//     return imageType;
// }

// public void setImageType(String imageType) {
//     this.imageType = imageType;
// }

// public byte[] getImageData() {
//     return imageData;
// }

// public void setImageData(byte[] imageData) {
//     this.imageData = imageData;
// }
// public int getId() {
//     return id;
// }

// public BigDecimal getPrice() {
//     return price;
// }

// public int getStockQuantity() {
//     return stockQuantity;
// }

// public void setStockQuantity(int stockQuantity) {
//     this.stockQuantity = stockQuantity;
// }
// public String getName() {
//     return name;
// }
// }

package com.praneetha.springecom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;
    public Product(int id) {
        this.id = id;
    }
}