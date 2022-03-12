package com.sofka.service;

import com.sofka.dao.ContactDao;
import com.sofka.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService implements IContactService {

    @Autowired // para inyectar usuarioDao
    private ContactDao contactDao;

    @Override
    @Transactional(readOnly = true)
    public List<Contact> list() {
        return (List<Contact>) contactDao.findAll();
    }

    @Override
    @Transactional
    public Contact save(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    @Transactional
    public Contact update(Long id, Contact contact) {
        contact.setId(id);
        return contactDao.save(contact);
    }

    @Override
    @Transactional
    public void delete(Contact contact) {
        contactDao.delete(contact);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Contact> findContact(Contact contact) {
        return contactDao.findById(contact.getId());
    }
}
