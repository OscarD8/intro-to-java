package intro_pt2.Interfaces.Packing;

public class Main
{
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        box.add(new CD("Help.com", "Shit the bed", 2030));

        box.add(new Box(10));
        box.add(new Box(1230));


        for (Packable item : box.getBoxContents()) {
            if (item instanceof Box that) {
                that.add(new Book("Bram Stoker", "Dracula", 5));
                that.add(new Book("Bram Stoker", "Cheese", 5));
            }
        }

        System.out.println(box);
    }
}
