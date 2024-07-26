package com.DGamesOF.videojuegos.Service;

import com.DGamesOF.videojuegos.Domains.VideoGames;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoGameService {
    public List<VideoGames> searchBetters(){
        List<VideoGames> betters = new ArrayList<>();
        VideoGames game = new VideoGames();
        game.setName("biosock");
        game.setDescription("basic model to biosock game the inmortal franchice");
        game.setImageUrl("https://th.bing.com/th/id/OIP.b4laWCU4MiM7V0CW10V6XwHaEK?rs=1&pid=ImgDetMain");
        betters.add(game);
        game = new VideoGames();
        game.setName("pokemon");
        game.setDescription("lounch2");
        game.setImageUrl("https://th.bing.com/th/id/OIP.h-D3AAtIsaXGDc_7-hJ3IgHaHa?rs=1&pid=ImgDetMain");
        betters.add(game);
        game = new VideoGames();
        game.setName("hollowKnight");
        game.setDescription("lounch2");
        game.setImageUrl("https://th.bing.com/th/id/OIP.fKzjBJCJVhSdKUYz50HBjQHaEP?rs=1&pid=ImgDetMain");
        betters.add(game);
        game = new VideoGames();
        game.setName("mario");
        game.setDescription("lounch2");
        game.setImageUrl("https://th.bing.com/th/id/OIP.W2UR_0qHkPDFl6DlyELO8gHaKD?rs=1&pid=ImgDetMain");
        betters.add(game);
        return betters;
    }
}
