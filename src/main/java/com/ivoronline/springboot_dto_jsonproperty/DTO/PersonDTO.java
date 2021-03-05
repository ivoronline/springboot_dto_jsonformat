package com.ivoronline.springboot_dto_jsonproperty.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class PersonDTO {

  public String    name;

  //DEFINE WHICH DATE FORMAT IS USED BY JSON PROPERTY:  dd.MM.yyyy  25.02.2021
  //IT WILL BE CONVERTED TO LOCALDATE FORMAT:           yyyy-MM-dd  2021-02-25
  @JsonFormat(pattern="dd.MM.yyyy")
  public LocalDate birthday;

}
