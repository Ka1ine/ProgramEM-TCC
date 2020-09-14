package com.programem.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AreaDoAlunoController {
    
  @GetMapping("/areaDoAluno")
    public String areaDoAluno(){
      return "areaDoAluno";
    }
}