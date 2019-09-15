package assignment2.demo.api;

import java.util.Iterator;

public interface DataSource extends Iterator<Record>, Iterable<Record> {

    default Iterator<Record> iterator() {
        return this;
    }
}
