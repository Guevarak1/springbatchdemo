package com.kevguev.springbatchexample1.batch;


import com.kevguev.springbatchexample1.model.User;
import com.kevguev.springbatchexample1.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) {
        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}
