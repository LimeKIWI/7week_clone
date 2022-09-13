package com.example.week7project.repository;

import com.example.week7project.domain.ImageFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FilesRepository extends JpaRepository<ImageFile, Long> {

    ImageFile findByUrl(String url);

}
