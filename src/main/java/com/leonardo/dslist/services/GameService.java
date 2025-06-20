package com.leonardo.dslist.services;

import com.leonardo.dslist.dto.GameMinDTO;
import com.leonardo.dslist.entities.Game;
import com.leonardo.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
