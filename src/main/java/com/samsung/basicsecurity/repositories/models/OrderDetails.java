package com.samsung.basicsecurity.repositories.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orderDetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Order_id")  // Tên cột khóa ngoại trong bảng OrderDetails
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "Product_id")  // Tên cột khóa ngoại trong bảng OrderDetails
    private Product product;

    private Long Unit_que;
    private int Qty;
}
