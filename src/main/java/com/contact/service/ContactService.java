package com.contact.service;

import com.contact.dao.ContactRepository;

import com.contact.domain.ContactEntity;
import com.contact.dto.ContactDto;
import com.contact.util.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<ContactDto> getContactsWithoutMatchesRegex(String regex) {
        List<ContactEntity> entityList = contactRepository.findAll();
        List<ContactEntity> matchesEntity = entityList.stream().filter(contactEntity -> contactEntity.getName().matches(regex)).collect(Collectors.toList());
        entityList.removeAll(matchesEntity);
        return entityList.stream().map(EntityMapper::mapToDto).collect(Collectors.toList());
    }
}
