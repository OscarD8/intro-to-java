package intro_pt1.part4.ObjectsInLists;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item
{
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final String name;
    private final LocalDateTime timestamp;
    private final String formattedTimestamp;

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
