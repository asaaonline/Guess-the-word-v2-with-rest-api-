package assignment2.demo.api;

import assignment2.demo.api.repository.Game;
import assignment2.demo.api.repository.Level;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Component
public class BasicAlgoritham implements Algoritham {
    @Override
    public LevelDTO solve(int levelNo, Game game) {

        LevelDTO levelDTO = new LevelDTO();
        int deficulty = 10;
        for (Level level :
                game.getMap()) {

            if (level.getLevel() == levelNo) {
                levelDTO.setWord(level.getWord());
                levelDTO.setAttempts(deficulty - levelNo);
                levelDTO.setLevel(levelNo);
            }

        }
        return levelDTO;
    }
}
