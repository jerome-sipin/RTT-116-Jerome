package org.example.database.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OrderDetail> products;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "productline_id")
    private Integer productlineId;

    @Column(name = "product_scale")
    private String productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "SMALLINT")
    private Integer quantityInStock;

    @Column(name = "buy_price", columnDefinition = "DECIMAL")
    private Double buyPrice;

    @Column(name = "msrp", columnDefinition = "DECIMAL")
    private Double msrp;


}
