package com.firefirer.springeasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.firefirer.springeasy.repository.UsersRepository;
import com.firefirer.springeasy.entity.Users;
//import com.firefirer.springeasy.entity.Students;
//import com.firefirer.springeasy.repository.StudentsRepository;
//import com.firefirer.springeasy.entity.JpaTest;
//import com.firefirer.springeasy.repository.JpaTestRepository;
import java.util.Date;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DBap {

    @Autowired
    private UsersRepository usersRepository;
    @PostConstruct
    public void test() {
        Users fyman = new Users();
        fyman.setUsername("fyman");
        fyman.setNaickname("xy");
        fyman.setBinding(false);
        fyman.setPassword("123456789");
        fyman.setRoles(8);
        fyman.setStatus("enable");
        fyman.setAuthotp("helloasdfsdfsaf");
        usersRepository.save(fyman);
//        JpaTest jpaTest = new JpaTest();
//        jpaTest.setName("test");
//        jpaTest.setAddTime(new Date());
//        jpaTestRepository.save(jpaTest);
    }

    public static void main(String[] args) {SpringApplication.run(DBap.class, args);}
}
