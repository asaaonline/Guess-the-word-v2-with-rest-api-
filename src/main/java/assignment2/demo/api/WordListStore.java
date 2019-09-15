package assignment2.demo.api;

import assignment2.demo.api.repository.Game;

import assignment2.demo.api.repository.WordListRepo;
import org.springframework.stereotype.Component;

@Component
public class WordListStore implements Store<Game> {

    private WordListRepo repository;

    public WordListStore(WordListRepo repository) {
        this.repository = repository;
    }

    @Override
    public void save(Game game) {
        repository.save(game);
    }
}
