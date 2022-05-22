package com.revature.registration.service;

import com.revature.registration.User;
import com.revature.registration.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    //@Autowired found better to autwire through constructor (possibly change)
    private UserRepository usersRepository;

    public UsersService(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User registerUser(String login, String password, String email, String first_name, String last_name){
        if (login ==null && password ==null){
            return null;
        } else {
            User usersModel = new User();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            usersModel.setFirst_name(first_name);
            usersModel.setLast_name(last_name);
            return usersRepository.save(usersModel);
        }
    }

    public User authenticate(String login, String password){
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
