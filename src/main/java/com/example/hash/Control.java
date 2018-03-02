package com.example.hash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.*;


@Controller
public class Control {
  String hash;
  double num;
  int style = 50;
  ThreadRunner tr = new ThreadRunner();

  ThreadRunner.Distance[] distances = tr.getDistances();
  double frac = 100;
  double time1;
  double time2;
  double time3;



  @GetMapping("/")
  public String index(Model model) {

    time1 += distances[0].getTime() / frac;
    time2 += distances[1].getTime() / frac;
    time3 += distances[2].getTime() / frac;
    System.out.println(time1);

    model.addAttribute("hash", hash);
    model.addAttribute("num", num);
    model.addAttribute("time1", time1);
    model.addAttribute("time2", time2);
    model.addAttribute("time3", time3);


    return "index";
  }

//  @PostMapping("/")
//  public String cal(@RequestParam String input) throws NoSuchAlgorithmException {
//
//    MessageDigest m = MessageDigest.getInstance("MD5");
//    m.update(input.getBytes(), 0, input.length());
//    hash = "Hash value: " + new BigInteger(1, m.digest()).toString(16);
//
//
//    return "redirect:/";
//  }

  @PostMapping("/")
  public String cal() throws NoSuchAlgorithmException {
    tr.startAll();


    return "redirect:/";
  }

//  @Scheduled(fixedDelay = 1000)
//  public void repeat(){
//    System.out.println("repeat");
//    num++;
//  }

}
