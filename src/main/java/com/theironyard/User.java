package com.theironyard;

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

    String name;
    @OneToMany(mappedBy = "user") // the name of the field in the Beer class
    List<Beer> beers;
}
