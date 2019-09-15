package assignment2.demo.api;

import assignment2.demo.api.Command;

public interface SaveCommand<T> extends Command<T> {
    void execute();
}
