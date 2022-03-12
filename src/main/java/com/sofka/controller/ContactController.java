package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(path = "/")
    public Map<String, String> index() {
        var respuesta = new HashMap<String, String>();
        respuesta.put("message", "Hola Mundo");
        return respuesta;
    }

    @GetMapping(path = "/contacts")
    public List<Contact> list(){
        var contacts = contactService.list();
        return contacts;
    }

    @PostMapping(path = "/contact")
    public ResponseEntity<Contact> create(Contact contact){
        log.info("Contacto a crear: {}", contact);
        contactService.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);

    }

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
