package assignment2.demo.api;

public interface GetCommand<T> extends Command<T> {
    LevelDTO get();
}
