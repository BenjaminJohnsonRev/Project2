package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Customer {
    private long customer_id;
    private String customer_username;
    private String customer_password;

    public Customer(String customer_username, String customer_password) {
        this.customer_username = customer_username;
        this.customer_password = customer_password;
    }
}
