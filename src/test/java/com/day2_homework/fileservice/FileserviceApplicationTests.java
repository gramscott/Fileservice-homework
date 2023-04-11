package com.day2_homework.fileservice;

import com.day2_homework.fileservice.models.File;
import com.day2_homework.fileservice.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FileserviceApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFile(){
		File file = new File("CodeClan: The Movie", "React", 127, "CodeClan: Documents");
		fileRepository.save(file);
	}


}
