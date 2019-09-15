package assignment2.demo.api.repository;

import javax.persistence.*;

@Entity
public class Level {
    @Id
    @GeneratedValue
    private int id;
    private int level;
    private String word;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    public Level() {
    }

    public Level(int level, String word, Game game) {
        this.level = level;
        this.word = word;
        this.game = game;
    }

    public Level(int level, String word) {
        this.level = level;
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
