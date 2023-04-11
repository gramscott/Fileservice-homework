package com.day2_homework.fileservice.components;


import com.day2_homework.fileservice.models.File;
import com.day2_homework.fileservice.models.Folder;
import com.day2_homework.fileservice.models.Person;
import com.day2_homework.fileservice.repositories.FileRepository;
import com.day2_homework.fileservice.repositories.FolderRepository;
import com.day2_homework.fileservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person graeme = new Person("Graeme");
        personRepository.save(graeme);

        Folder folder1 = new Folder("CodeClan: Documents", graeme);
        folderRepository.save(folder1);

        File file1 = new File("CodeClan: The Movie", "React", 127, folder1);
        fileRepository.save(file1);


    }


}
