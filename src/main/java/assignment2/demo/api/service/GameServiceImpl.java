package assignment2.demo.api.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class GameServiceImpl implements GameService{
    @Override
    public boolean saveTxt(MultipartFile file) {
        return false;
    }
}
