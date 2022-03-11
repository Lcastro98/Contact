package com.sofka.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

    @GetMapping(path = "/contacts")
    public void list(){ }

    @PostMapping(path = "/contact")
    public void create(){ }

    @DeleteMapping(path = "/contact/{id}")
    public void delete(){ }

    @PutMapping(path = "/contact/{id}")
    public void update(){ }

    @PatchMapping(path = "/contact/name/{id}")
    public void updateName(){ }

    @PatchMapping(path = "/contact/phone/{id}")
    public void updatePhone(){ }

    @PatchMapping(path = "/contact/email/{id}")
    public void updateEmail(){ }

    @PatchMapping(path = "/contact/dateBirth/{id}")
    public void updateDateBirth(){ }

}
