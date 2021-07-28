package com.example.codeclan.FilesLab.repositories;


import com.example.codeclan.FilesLab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
