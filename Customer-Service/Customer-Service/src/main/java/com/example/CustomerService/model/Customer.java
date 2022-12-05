package com.example.CustomerService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="customer")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Customer {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String phone;
    private String adresse;
    private String email;
}
