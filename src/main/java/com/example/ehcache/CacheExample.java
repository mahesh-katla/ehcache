package com.example.ehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheExample {

    @Cacheable( value = "findStudent", key = "#id")
    public Student findStudent(Long id){
        System.out.println("getting student for id ::"+id);
      return new Student("Suresh", 1l);
    }
}
