package com.ivoronline.springboot_dto_jsonproperty.controllers;

import com.ivoronline.springboot_dto_jsonproperty.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/AddPerson")
  public String addPerson(@RequestBody PersonDTO personDTO) {

    //GET DATA FROM PersonDTO
    String    name     = personDTO.name;
    LocalDate birthday = personDTO.birthday;

    //RETURN SOMETHING
    return name + " is born on " + birthday;

  }

}
