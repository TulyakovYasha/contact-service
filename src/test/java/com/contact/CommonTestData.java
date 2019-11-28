package com.contact;

import com.contact.domain.ContactEntity;

import java.util.ArrayList;
import java.util.List;

public final class CommonTestData {

    public static List<ContactEntity> contacts = new ArrayList<>();

    static {
        contacts.add(new ContactEntity(1L, "John"));
        contacts.add(new ContactEntity(2L, "Andrei"));
        contacts.add(new ContactEntity(3L, "Tania"));
        contacts.add(new ContactEntity(4L, "Anna"));
        contacts.add(new ContactEntity(5L, "Nastya"));
        contacts.add(new ContactEntity(6L, "Yasha"));
        contacts.add(new ContactEntity(7L, "Vova"));
        contacts.add(new ContactEntity(8L, "Dmitro"));
        contacts.add(new ContactEntity(9L, "Maksim"));
        contacts.add(new ContactEntity(10L, "Olga"));
        contacts.add(new ContactEntity(11L, "Sasha"));
        contacts.add(new ContactEntity(12L, "Vika"));
        contacts.add(new ContactEntity(13L, "Veronika"));
        contacts.add(new ContactEntity(14L, "Evgenii"));
    }
}
