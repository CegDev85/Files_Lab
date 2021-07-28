package com.example.codeclan.FilesLab.repositories;


import com.example.codeclan.FilesLab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
