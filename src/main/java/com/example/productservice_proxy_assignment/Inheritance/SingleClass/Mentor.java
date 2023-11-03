package com.example.productservice_proxy_assignment.Inheritance.SingleClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "sc_Mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    private int rating;
}
