package assignment2.demo.api;

import assignment2.demo.api.repository.Game;


public class GetCommandImpl<T> implements GetCommand<T> {

    private int level;
    private Store<T> store;
    private Algoritham algoritham;


    public GetCommandImpl(int level, Store<T> store, Algoritham algoritham) {
        this.level = level;
        this.store = store;
        this.algoritham = algoritham;
    }


    @Override
    public LevelDTO get() {

        Game game = store.get();
        LevelDTO solve = algoritham.solve(level, game);
        return solve;
    }
}
