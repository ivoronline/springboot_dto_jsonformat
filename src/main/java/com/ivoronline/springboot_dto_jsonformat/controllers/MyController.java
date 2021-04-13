package com.ivoronline.springboot_dto_jsonformat.controllers;

import com.ivoronline.springboot_dto_jsonformat.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/AddPerson")
  public String addPerson(@RequestBody PersonDTO personDTO) {
    return personDTO.name + " is born on " + personDTO.birthday;
  }

}
