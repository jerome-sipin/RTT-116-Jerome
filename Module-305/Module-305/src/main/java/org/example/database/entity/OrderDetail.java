package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orderdetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "quantity_ordered")
    private String quantityOrdered;

    @Column(name = "price_each")
    private Double priceEach;

    @Column(name = "order_line_number")
    private Integer orderLineNumber;

}
