package com.crmsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmsystem.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

	List<Contact> findAll();

	Contact save(Contact contact);

	Optional<Contact> findById(Long id);

	void deleteById(Long id);
}
