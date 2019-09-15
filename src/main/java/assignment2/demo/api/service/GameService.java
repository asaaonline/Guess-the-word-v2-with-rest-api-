package assignment2.demo.api.service;

import org.springframework.web.multipart.MultipartFile;

public interface GameService {

    public boolean saveTxt(MultipartFile file);
}
