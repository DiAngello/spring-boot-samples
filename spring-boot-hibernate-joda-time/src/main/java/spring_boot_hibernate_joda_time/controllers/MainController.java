package spring_boot_hibernate_joda_time.controllers;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring_boot_hibernate_joda_time.models.User;
import spring_boot_hibernate_joda_time.models.UserRepository;

@Controller
public class MainController {

  @Autowired
  private UserRepository userRepository;
  
  @RequestMapping("/")
  public String index() {
    return "index.html";
  }
  
  @RequestMapping(
      value = "/user",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<?> addUser(@RequestBody User user) {
    user.setCreateTime(new DateTime());
    userRepository.save(user);
    return new ResponseEntity<>(HttpStatus.OK);
  }
  
} 
