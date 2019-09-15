package assignment2.demo.api.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Entity
public class WordList {
    @Id
    @GeneratedValue
    private Integer id;
    private Map<Object, String> map;


    public WordList(Map<Object, String> map) {
        this.map = map;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Object, String> getMap() {
        return map;
    }

    public void setMap(Map<Object, String> map) {
        this.map = map;
    }
}
