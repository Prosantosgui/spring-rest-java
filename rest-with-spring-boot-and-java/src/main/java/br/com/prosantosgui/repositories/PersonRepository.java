package br.com.prosantosgui.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prosantosgui.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
