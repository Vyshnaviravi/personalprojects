package com.jsp.movie.controller;

import com.jsp.movie.entity.*;
import com.jsp.movie.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired private GenreService genreService;
    @Autowired private DirectorService directorService;
    @Autowired private MovieService movieService;
    @Autowired private UserService userService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("totalMovies", movieService.getTotalCount());
        model.addAttribute("totalGenres", genreService.getAllGenres().size());
        model.addAttribute("totalDirectors", directorService.getAllDirectors().size());
        model.addAttribute("totalUsers", userService.getAllUsers().size());
        return "admin/dashboard";
    }

    // --- Genre Management ---
    @GetMapping("/genres")
    public String listGenres(Model model) {
        model.addAttribute("genres", genreService.getAllGenres());
        model.addAttribute("genre", new Genre());
        return "admin/genres";
    }

    @PostMapping("/genres/save")
    public String saveGenre(@Valid @ModelAttribute Genre genre,
                             BindingResult result,
                             RedirectAttributes ra) {
        if (result.hasErrors()) {
            ra.addFlashAttribute("error", "Genre name is required.");
            return "redirect:/admin/genres";
        }
        if (genreService.existsByName(genre.getName())) {
            ra.addFlashAttribute("error", "Genre already exists.");
            return "redirect:/admin/genres";
        }
        genreService.save(genre);
        ra.addFlashAttribute("success", "Genre added!");
        return "redirect:/admin/genres";
    }

    @GetMapping("/genres/delete/{id}")
    public String deleteGenre(@PathVariable Integer id, RedirectAttributes ra) {
        genreService.delete(id);
        ra.addFlashAttribute("success", "Genre deleted!");
        return "redirect:/admin/genres";
    }

    // --- Director Management ---
    @GetMapping("/directors")
    public String listDirectors(Model model) {
        model.addAttribute("directors", directorService.getAllDirectors());
        model.addAttribute("director", new Director());
        return "admin/directors";
    }

    @PostMapping("/directors/save")
    public String saveDirector(@Valid @ModelAttribute Director director,
                                BindingResult result,
                                RedirectAttributes ra) {
        if (result.hasErrors()) {
            ra.addFlashAttribute("error", "Director name is required.");
            return "redirect:/admin/directors";
        }
        directorService.save(director);
        ra.addFlashAttribute("success", "Director added!");
        return "redirect:/admin/directors";
    }

    @GetMapping("/directors/delete/{id}")
    public String deleteDirector(@PathVariable Integer id, RedirectAttributes ra) {
        directorService.delete(id);
        ra.addFlashAttribute("success", "Director deleted!");
        return "redirect:/admin/directors";
    }

    // --- User Management ---
    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "admin/users";
    }
}
