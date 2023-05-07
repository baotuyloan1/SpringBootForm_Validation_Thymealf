package com.example.springbootform;

import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/register")
  public String showForm(Model model) {
    User user = new User();
    model.addAttribute(user);

    List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
    model.addAttribute("listProfession", listProfession);
    return "register_form";
  }

  @PostMapping("/register")
  public String submitForm(
      @Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
    System.out.println(bindingResult.getAllErrors());
    System.out.println(model);
    if (bindingResult.hasErrors()) {
      List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
      model.addAttribute("listProfession", listProfession);
      return "register_form";
    } else {
      model.addAttribute("user", user);
      return "register_success";
    }
  }
}
