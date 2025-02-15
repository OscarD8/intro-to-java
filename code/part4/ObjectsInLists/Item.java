package code.part4.ObjectsInLists;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item
{
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String name;
    private LocalDateTime timestamp;
    private String formattedTimestamp;

    public Item( String name ) {
        this.name = name;
        this.timestamp = LocalDateTime.now();
        this.formattedTimestamp = timestamp.format(timeFormatter);
    }

    @Override
    public String toString() {
        return this.name + " (Created at: " + formattedTimestamp + ")";
    }
}
