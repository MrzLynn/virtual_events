package org.launchcode.virtual_events.controllers;

import org.launchcode.virtual_events.data.CategoryRepository;
import org.launchcode.virtual_events.data.EventRepository;
import org.launchcode.virtual_events.data.UserRepository;
import org.launchcode.virtual_events.models.Event;
import org.launchcode.virtual_events.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title","All Events");
        model.addAttribute("events", events);
        model.addAttribute("events",eventRepository.findAll());
        return "create";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Virtual Event");
        model.addAttribute(new Event());
        model.addAttribute("events", eventRepository.findAll());
        return "events/create";
    }



    @PostMapping("create")
    public String processAddEvent(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "events/create";
        }
        model.addAttribute(new Event());
        model.addAttribute(eventRepository.save(newEvent));
        return "events/create";
    }


}
