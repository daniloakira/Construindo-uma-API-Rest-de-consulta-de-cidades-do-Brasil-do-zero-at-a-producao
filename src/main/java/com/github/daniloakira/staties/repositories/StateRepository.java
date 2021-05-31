package com.github.daniloakira.staties.repositories;

import com.github.daniloakira.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
