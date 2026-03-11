package edu.wctc.wholesale.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "customer_id")
    private int id;

    @Column(name = "name")
    private String name;
}