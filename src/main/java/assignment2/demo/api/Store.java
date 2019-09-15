package assignment2.demo.api;

import assignment2.demo.api.repository.Game;

public interface Store<T> {
    void save(T t);

    Game get();
}
