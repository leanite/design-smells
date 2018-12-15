package encapsulation.leaky.before;

import java.util.LinkedList;

public class TodoList {

    private String title;
    private LinkedList<String> entries;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LinkedList<String> getEntries() {
        return entries;
    }

    public void setEntries(LinkedList<String> entries) {
        this.entries = entries;
    }
}
