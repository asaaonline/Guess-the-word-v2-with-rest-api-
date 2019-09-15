package assignment2.demo.api.controller;

import assignment2.demo.api.*;
import assignment2.demo.api.repository.Game;
import assignment2.demo.api.SaveCommand;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/wordGame")
public class GameController {

    private final Validator validator;
    private final Mapper<Game> mapper;
    private final Store<Game> store;
    private Algoritham algoritham;


    public GameController(Validator validator, Mapper<Game> wordListMapper, Store<Game> wordListStore,Algoritham algoritham) {
        this.validator = validator;
        this.mapper = wordListMapper;
        this.store = wordListStore;
        this.algoritham=algoritham;
    }


    @PostMapping("/saveText")
    public void saveTextWordFile(@RequestParam MultipartFile file) throws IOException {

        if (!StringUtils.endsWithIgnoreCase(file.getOriginalFilename(), "text")) {
            throw new IllegalArgumentException("Only text allowed.");
        }

        DataSource dataSource = new TextDataSource(file.getInputStream());

        SaveCommand<Game> importCommand = new ImportCommand<>(
                validator, store, dataSource, mapper);

        importCommand.execute();


    }
    @GetMapping("/getLevel")
    public LevelDTO getLevel(@RequestParam int level){

            GetCommand<LevelDTO> getCommand=new GetCommandImpl(level,store,algoritham);
            return getCommand.get();
    }

}
