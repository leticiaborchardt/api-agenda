package com.example.agenda.domain.person;

import com.example.agenda.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "people")
@Entity(name = "people")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    public Person(String name, User user) {
        this.name = name;
        this.user = user;
    }
}
