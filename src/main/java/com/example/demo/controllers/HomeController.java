package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    // en controller är en klass som mappar
    // en URL tex "/" eller "/profile" eller "/dogs"
    // till en viss funktion
    // och funktionen kommer då att köras när användaren
    // surfar till en url:en
    // funktionen ska då returnewra HTML för den sidan

    @GetMapping("/")
    public String home(Model model) {
        // TODO nu ska vi generera HTMLK för startsidan
        List<String> players = new ArrayList<>();
        players.add("John Doe");
        players.add("Jane Doe");
        players.add("Jack Doe");

        model.addAttribute("players", players);

        return "startpage";
    }
    @GetMapping("/profile")
    public String profile() {
        // TODO nu ska vi generera HTMLK för profile
        return "profile";
    }

}
