package com.sofka.controller;

import com.sofka.domain.Contact;
import com.sofka.service.ContactService;
import com.sofka.util.Response;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Los controladores le dan la funcionalidad al programa.
 *
 * @version 1.00.00 2022-03-13 los controladores corresponden a la versión 1 del sistema.
 *
 * @author Lorena Castro <lcastro0398@gmail.com>
 */

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    @Autowired
    private ContactService contactService;

    private Response response = new Response();

    @GetMapping(path = "/")
    public Map<String, String> index() {
        var res = new HashMap<String, String>();
        res.put("message", "Hola Mundo");
        return res;
    }

    /**
     * Muestra todos los contactos
     * @return
     */
    @GetMapping(path = "/contacts")
    public Response list(){
        try {
            response.data = contactService.list();
        } catch (Exception exc) {
            response.error = true;
            response.message = exc.getMessage();
            response.status = "ERROR";
        }
        return response;
    }

    /**
     * Permite crear un contacto
     * @param contact
     * @return
     */
    @PostMapping(path = "/contact")
    public ResponseEntity<Response> create(Contact contact){
        response.data = contact;
        try {
            log.info("Contacto a crear: {}", contact);
            contactService.save(contact);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception exc) {
            response.status = exc.getCause().toString();
            response.error = true;
            if (Pattern.compile("(contact.cont_email_UNIQUE)").matcher(exc.getMessage()).find()) {
                response.message = "Contacto duplicado";
                return new ResponseEntity<>(response, HttpStatus.CONFLICT);
            } else {
                response.message = exc.getMessage();
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    /**
     * Permite borrar un contacto
     * @param contact
     * @return
     */
    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<Contact> delete(Contact contact){
        log.info("Contacto a borrar: {}", contact);
        contactService.delete(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    /**
     * Permite actualizar un contacto
     * @param contact
     * @param id
     * @return
     */
    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<Contact> update(Contact contact, @PathVariable("id") Long id){
        log.info("Contacto a modificar {}", contact);
        contactService.update(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    /**
     * Permite actualizar el atributo name de un contacto
     * @param contact
     * @param id
     * @return
     */
    @PatchMapping(path = "/contact/name/{id}")
    public ResponseEntity<Contact> updateName(Contact contact, @PathVariable("id") Long id){
        log.info("Contacto a modificar {}", contact);
        contactService.updateName(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    /**
     * Permite actualizar el atributo phone de un contacto
     * @param contact
     * @param id
     * @return
     */
    @PatchMapping(path = "/contact/phone/{id}")
    public ResponseEntity<Contact> updatePhone(Contact contact, @PathVariable("id") Long id){
        log.info("Contacto a modificar {}", contact);
        contactService.updatePhone(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    /**
     * Permite actualizar el atributo email de un contacto
     * @param contact
     * @param id
     * @return
     */
    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<Contact> updateEmail(Contact contact, @PathVariable("id") Long id){
        log.info("Contacto a modificar {}", contact);
        contactService.updateEmail(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    /**
     * Permite actualizar el atributo dateBirth de un contacto
     * @param contact
     * @param id
     * @return
     */
    @PatchMapping(path = "/contact/dateBirth/{id}")
    public ResponseEntity<Contact> updateDateBirth(Contact contact, @PathVariable("id") Long id){
        log.info("Contacto a modificar {}", contact);
        contactService.updateDateBirth(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

}
