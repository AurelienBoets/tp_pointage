package org.example.back.repository;

import org.example.back.entity.Role;
import org.example.back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> searchUsersByRole(Role role);

    Optional<User> findByEmail(String email);

}
