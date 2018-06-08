package com.example.springbootdemo;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.springbootdemo.hibernatedata.entity.Author;
import com.example.springbootdemo.hibernatedata.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    AuthorRepository authorRepository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

      List<Author> authorList =  authorRepository.findByFioContainingIgnoreCaseOrderByFio("Пауло");
       name = authorList.get(0).toString();

        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping(value = "/getJsonParam", method = RequestMethod.POST, consumes = "application/json")
    public Greeting getJsonEntity(@RequestBody Greeting greeting) {
        System.out.println("marker");
        greeting.setContent("Testname");

        return greeting;
    }

}
