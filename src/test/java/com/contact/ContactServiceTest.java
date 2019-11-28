package com.contact;

import com.contact.dao.ContactRepository;
import com.contact.dto.ContactDto;
import com.contact.service.ContactService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {

    @InjectMocks
    private ContactService contactService;

    @Mock
    private ContactRepository contactRepository;

    @After
    public void resetMocks() {
        Mockito.reset(contactRepository);
    }

    @Test
    public void getAllContactsWhichNotBeginWithA() {
        when(contactRepository.findAll()).thenReturn(CommonTestData.contacts);
        List<ContactDto> expected = new ArrayList<>();
        expected.add(new ContactDto(1L, "John"));
        expected.add(new ContactDto(3L, "Tania"));
        expected.add(new ContactDto(5L, "Nastya"));
        expected.add(new ContactDto(6L, "Yasha"));
        expected.add(new ContactDto(7L, "Vova"));
        expected.add(new ContactDto(8L, "Dmitro"));
        expected.add(new ContactDto(9L, "Maksim"));
        expected.add(new ContactDto(10L, "Olga"));
        expected.add(new ContactDto(11L, "Sasha"));
        expected.add(new ContactDto(12L, "Vika"));
        expected.add(new ContactDto(13L, "Veronika"));
        expected.add(new ContactDto(14L, "Evgenii"));
        Assert.assertEquals(expected, contactService.getContactsWithoutMatchesRegex("^A.*$"));
    }
}
