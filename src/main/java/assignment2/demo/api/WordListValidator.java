package assignment2.demo.api;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class WordListValidator implements Validator {

    @Override
    public List<String> validate(Record r) {
        List<String> errors = new ArrayList<>();

        if(r.size() != 5){
            errors.add("Expected 5 columns, found = " + r.size());
        }else {
            if (r.get(0).length() == 0) {
                errors.add("cannot be empty.");
            }
        }

        return errors;
    }
}
