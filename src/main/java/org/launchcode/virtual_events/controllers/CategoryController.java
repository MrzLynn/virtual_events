package org.launchcode.virtual_events.controllers;

import org.launchcode.virtual_events.data.CategoryRepository;
import org.launchcode.virtual_events.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title","All Categories");
        model.addAttribute("categories", categoryRepository.findAll());
        return "categories/index";
    }

    @GetMapping("create")
    public String RenderCreateEventCategoryForm(Model model){
        model.addAttribute("title","Create Category");
        model.addAttribute(new Category());
        return "categories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(@Valid @ModelAttribute Category category, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title","Create Category");
            model.addAttribute(new Category());
            return "categories/create";
        }

        categoryRepository.save(category);
        return "redirect:";
    }
}
