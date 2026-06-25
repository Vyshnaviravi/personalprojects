package com.jsp.movie.controller;

import com.jsp.movie.entity.Movie;
import com.jsp.movie.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MovieController {

    @Autowired private MovieService movieService;
    @Autowired private GenreService genreService;
    @Autowired private DirectorService directorService;

    @GetMapping({"/", "/movies"})
    public String listMovies(Model model,
                              @RequestParam(required = false) String search,
                              @RequestParam(required = false) Integer genreId) {
        if (search != null && !search.isEmpty()) {
            model.addAttribute("movies", movieService.searchByTitle(search));
            model.addAttribute("search", search);
        } else if (genreId != null) {
            model.addAttribute("movies", movieService.filterByGenre(genreId));
            model.addAttribute("selectedGenre", genreId);
        } else {
            model.addAttribute("movies", movieService.getAllMovies());
        }
        model.addAttribute("genres", genreService.getAllGenres());
        model.addAttribute("totalMovies", movieService.getTotalCount());
        return "movies/list";
    }

    @GetMapping("/movies/add")
    public String showAddForm(Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("genres", genreService.getAllGenres());
        model.addAttribute("directors", directorService.getAllDirectors());
        return "movies/add";
    }

    @PostMapping("/movies/save")
    public String saveMovie(@Valid @ModelAttribute Movie movie,
                             BindingResult result,
                             Model model,
                             RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("genres", genreService.getAllGenres());
            model.addAttribute("directors", directorService.getAllDirectors());
            return "movies/add";
        }
        movieService.saveMovie(movie);
        redirectAttributes.addFlashAttribute("success", "Movie saved successfully!");
        return "redirect:/movies";
    }

    @GetMapping("/movies/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model, RedirectAttributes ra) {
        return movieService.getMovieById(id).map(movie -> {
            model.addAttribute("movie", movie);
            model.addAttribute("genres", genreService.getAllGenres());
            model.addAttribute("directors", directorService.getAllDirectors());
            return "movies/edit";
        }).orElseGet(() -> {
            ra.addFlashAttribute("error", "Movie not found!");
            return "redirect:/movies";
        });
    }

    @PostMapping("/movies/update")
    public String updateMovie(@Valid @ModelAttribute Movie movie,
                               BindingResult result,
                               Model model,
                               RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("genres", genreService.getAllGenres());
            model.addAttribute("directors", directorService.getAllDirectors());
            return "movies/edit";
        }
        movieService.saveMovie(movie);
        redirectAttributes.addFlashAttribute("success", "Movie updated successfully!");
        return "redirect:/movies";
    }

    @GetMapping("/movies/delete/{id}")
    public String deleteMovie(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        movieService.deleteMovie(id);
        redirectAttributes.addFlashAttribute("success", "Movie deleted successfully!");
        return "redirect:/movies";
    }

    @GetMapping("/movies/view/{id}")
    public String viewMovie(@PathVariable Integer id, Model model, RedirectAttributes ra) {
        return movieService.getMovieById(id).map(movie -> {
            model.addAttribute("movie", movie);
            return "movies/view";
        }).orElseGet(() -> {
            ra.addFlashAttribute("error", "Movie not found!");
            return "redirect:/movies";
        });
    }
}
