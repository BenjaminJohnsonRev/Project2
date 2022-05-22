package com.revature.registration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("john@aol.com");
        user.setPassword("red");
        user.setFirst_name("Tom");
        user.setLast_name("rap");

        User savedUser = repo.save(user);

        User existingUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existingUser.getEmail()).isEqualTo(user.getEmail());
    }
}
