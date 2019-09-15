package assignment2.demo.api.repository;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name="game")
public class Game {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Level> map;

    public Game() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Level> getMap() {
        return map;
    }

    public void setMap(Set<Level> map) {
        this.map = map;
    }

    public Game(Set<Level> map) {
        for (Level level:
        map) {
            level.setGame(this);
        }
        this.map = map;
    }
}
