package assignment2.demo.api.controller;

import assignment2.demo.api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/wordGame")
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @PostMapping("/saveText")
    public void saveTextWordFile(@RequestParam MultipartFile file) {

        if (!StringUtils.endsWithIgnoreCase(file.getOriginalFilename(), "txt")) {
            throw new IllegalArgumentException("Only txt allowed.");
        }
        return

    }

}
