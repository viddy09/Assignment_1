package com.example.productservice_proxy_assignment.Inheritance.TablePerClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_Mentor")
public class Mentor extends User {
    private int rating;
}
