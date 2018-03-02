package com.example.hash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

@SpringBootApplication
@EnableScheduling
public class HashApplication {

  public static void main(String[] args) {
    SpringApplication.run(HashApplication.class, args);



  }


}
