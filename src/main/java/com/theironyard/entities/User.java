package com.theironyard.entities;

import com.theironyard.entities.Beer;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jack on 11/11/15.
 */

@Entity
@Table(name = "users")  //Customize the table name that it generates in PostgreSQL
public class User {
    @Id
    @GeneratedValue
    Integer id;

    public String name;
    public String password;
    @OneToMany(mappedBy = "user") // the name of the field in the Beer class
    public List<Beer> beers;
}
