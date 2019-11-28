package com.contact.util;

import com.contact.domain.ContactEntity;
import com.contact.dto.ContactDto;

public class EntityMapper {

    public static ContactDto mapToDto(ContactEntity contactEntity){
        ContactDto contactDto = new ContactDto();
        contactDto.setId(contactEntity.getId());
        contactDto.setName(contactEntity.getName());
        return contactDto;
    }
}
