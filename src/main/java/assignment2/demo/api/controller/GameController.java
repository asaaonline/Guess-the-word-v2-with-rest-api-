package assignment2.demo.api.controller;

import assignment2.demo.api.*;
import assignment2.demo.api.repository.Game;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/wordGame")
public class GameController {

    private final Validator validator;
    private final Mapper<Game> mapper;
    private final Store<Game> store;


    public GameController(Validator validator, Mapper<Game> wordListMapper, Store<Game> wordListStore) {
        this.validator = validator;
        this.mapper = wordListMapper;
        this.store = wordListStore;
    }


    @PostMapping("/saveText")
    public void saveTextWordFile(@RequestParam MultipartFile file) throws IOException {

        if (!StringUtils.endsWithIgnoreCase(file.getOriginalFilename(), "text")) {
            throw new IllegalArgumentException("Only text allowed.");
        }

        DataSource dataSource = new TextDataSource(file.getInputStream());

        Command<Game> importCommand = new ImportCommand<>(
                validator, store, dataSource, mapper);

        importCommand.execute();


    }

}
