package com.example.form_dang_ky.controller;

import com.example.form_dang_ky.dto.UserDto;
import com.example.form_dang_ky.model.User;
import com.example.form_dang_ky.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

   @GetMapping("/list")
    public String getUserList(@RequestParam(defaultValue = "0",required = false) int page,
                              @RequestParam(defaultValue = " ",required = false) String nameSearch,
                              Model model){
       Pageable pageable = PageRequest.of(page,3);
       Page<User> userPage = userService.findAll(pageable,nameSearch);
       model.addAttribute("userPage",userPage);
       return "index";
   }

   @GetMapping("/form/create")
    public String showFormCreate(Model model){
       model.addAttribute("userDto",new UserDto());
       return "create";
   }

   @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute UserDto userDto,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
       if (bindingResult.hasErrors()){
           return "create";
       }
       User user = new User();
       BeanUtils.copyProperties(userDto,user);
       userService.createUser(user);
       return "result";
   }
}
