package org.launchcode.virtual_events.controllers;

import org.launchcode.virtual_events.data.CategoryRepository;
import org.launchcode.virtual_events.data.EventRepository;
import org.launchcode.virtual_events.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title","All Events");
        model.addAttribute("events", events);
        model.addAttribute("events",eventRepository.findAll());
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Virtual Event");
        model.addAttribute(new Event());
        model.addAttribute("categories", categoryRepository.findAll());
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }


}
