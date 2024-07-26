package com.DGamesOF.videojuegos.controllers;

import com.DGamesOF.videojuegos.Domains.VideoGames;
import com.DGamesOF.videojuegos.Service.VideoGameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {

    private final VideoGameService videoGameService;
    public ListController(VideoGameService videoGameService) {
        this.videoGameService = videoGameService;
    }

    @RequestMapping("/")
    public String listVideoGames(Model model) {
       List<VideoGames> betters = videoGameService.searchBetters();
       model.addAttribute("VideoGames", betters);
        return "list";
    }
}
