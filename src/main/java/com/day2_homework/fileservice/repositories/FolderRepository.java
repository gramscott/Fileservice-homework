package com.day2_homework.fileservice.repositories;

import com.day2_homework.fileservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
