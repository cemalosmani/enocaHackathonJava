package com.dejkoveci.enocaHackathonJava.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dejkoveci.enocaHackathonJava.model.ERole;
import com.dejkoveci.enocaHackathonJava.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
