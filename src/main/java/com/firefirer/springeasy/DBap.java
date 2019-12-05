package com.firefirer.springeasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.firefirer.springeasy.repository.UsersRepository;
//import com.firefirer.springeasy.entity.Users;
import com.firefirer.springeasy.entity.Students;
import com.firefirer.springeasy.repository.StudentsRepository;



import javax.annotation.PostConstruct;

@SpringBootApplication
public class DBap {

    @Autowired
    private StudentsRepository studentsRepository;
    @PostConstruct
    public void test() {
        Students fyman = new Students();
//        Users fyman = new Users();
//        fyman.setUsername("fyman");
//        fyman.setNaickname("xy");
//        fyman.setBinding(false);
//        fyman.setPassword("123456789");
//        fyman.setRoles(new String[]{"dba", "auditor"});
//        fyman.setStatus("enable");
        fyman.setName("fyman");
        studentsRepository.save(fyman);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(DBap.class, args);


    }
}
