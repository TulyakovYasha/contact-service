package com.contact.dao;

import com.contact.domain.ContactEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Cacheable(value = "contact", cacheManager = "contactCacheManager")
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
