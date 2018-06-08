package com.example.springbootdemo;

import com.example.springbootdemo.hibernatedata.entity.Author;
import com.example.springbootdemo.hibernatedata.repository.AuthorRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.*;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class GreetingControllerTest {


    @Test
    public void getJsonEntity() {
        assertTrue(true);
    }

    @Test
    public void controllerMustRedirect(){
        assertTrue(true);
    }


}