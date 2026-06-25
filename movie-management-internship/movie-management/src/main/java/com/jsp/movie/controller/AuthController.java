package com.jsp.movie.controller;

import com.jsp.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // Spring Security handles POST /login itself — we only need the GET to show the page
    @GetMapping("/login")
    public String loginPage(@RequestParam(required = false) String error,
                             @RequestParam(required = false) String logout,
                             Model model) {
        if (error != null) model.addAttribute("error", "Invalid username or password.");
        if (logout != null) model.addAttribute("logout", "You have been logged out.");
        return "auth/login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "auth/register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                                @RequestParam String password,
                                @RequestParam String confirmPassword,
                                RedirectAttributes redirectAttributes) {
        if (!password.equals(confirmPassword)) {
            redirectAttributes.addFlashAttribute("error", "Passwords do not match!");
            return "redirect:/register";
        }
        if (userService.existsByUsername(username)) {
            redirectAttributes.addFlashAttribute("error", "Username already taken!");
            return "redirect:/register";
        }
        userService.registerUser(username, password);
        redirectAttributes.addFlashAttribute("success", "Registration successful! Please login.");
        return "redirect:/login";
    }
}
