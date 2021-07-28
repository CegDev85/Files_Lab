package com.example.codeclan.FilesLab.components;


import com.example.codeclan.FilesLab.models.File;
import com.example.codeclan.FilesLab.models.Folder;
import com.example.codeclan.FilesLab.repositories.FileRepository;
import com.example.codeclan.FilesLab.repositories.FolderRepository;
import com.example.codeclan.FilesLab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args)  {
        Folder xmasIdeas = new Folder("Xmas Shopping ideas");
        folderRepository.save(xmasIdeas);
        Folder weekendFood = new Folder("Weekend Food");
        folderRepository.save(weekendFood);

        File davidsXmas = new File("Davids Xmas Ideas","PDF",50,xmasIdeas);
        fileRepository.save(davidsXmas);

        File tescoItems = new File("Tesco Items","WORD",100,weekendFood);
        fileRepository.save(tescoItems);

    }
}
