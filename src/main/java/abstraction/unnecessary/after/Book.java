package abstraction.unnecessary.after;

import abstraction.unnecessary.Author;

import java.util.Date;

public class Book {
    private String title;
    private Author author;
    private Date releaseDate;

    private boolean bestSeller;

    public boolean isBestSeller() {
        return bestSeller;
    }

    // ...
}
