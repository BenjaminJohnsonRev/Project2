package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length =15)
    private String login;

    @Column(nullable = false, unique = true, length =45)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = true, length = 25)
    private String first_name;

    @Column(nullable = true, length = 25)
    private String last_name;


    public User(
            String login, String email, String password, String first_name, String last_name) {

        this.login = login;
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, password, first_name, last_name);
    }
}