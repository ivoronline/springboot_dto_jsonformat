package com.ivoronline.springboot_dto_jsonformat.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class PersonDTO {

  //PROPERTIES
  public String name;

  @JsonFormat(pattern="dd.MM.yyyy")     //Define date format used by JSON Property: dd.MM.yyyy  25.02.2021
  public LocalDate birthday;            //It gets converted to LocalDate format:    yyyy-MM-dd  2021-02-25

}
