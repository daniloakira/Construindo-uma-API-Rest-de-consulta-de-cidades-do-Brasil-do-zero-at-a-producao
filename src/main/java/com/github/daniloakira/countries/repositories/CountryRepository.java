package com.github.daniloakira.countries.repositories;

import com.github.daniloakira.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
