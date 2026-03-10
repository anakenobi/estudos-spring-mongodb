package com.analeticia.workshopmongo.resources;

import com.analeticia.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1","maria", "maria@email.com");
        User leticia = new User("2", "leticia", "leticia@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, leticia));
        return ResponseEntity.ok().body(list);
    }

}
