package com.day2_homework.fileservice.repositories;


import com.day2_homework.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {


}
