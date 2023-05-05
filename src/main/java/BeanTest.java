import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {

    public static void main(String[] args) {

        // Instantiating albums
        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("Taylor Swift");
        album1.setName("1989");
        album1.setReleaseDate(2014);
        album1.setSales(10.5);
        album1.setGenre("Pop, Rock, Electronic");

        Album album2 = new Album();
        album2.setId(2);
        album2.setArtist("Adele");
        album2.setName("21");
        album2.setReleaseDate(2011);
        album2.setSales(30.1);
        album2.setGenre("Soul, Pop, Blues");

        Album album3 = new Album();
        album3.setId(3);
        album3.setArtist("Ed Sheeran");
        album3.setName("÷");
        album3.setReleaseDate(2017);
        album3.setSales(20.2);
        album3.setGenre("Pop, Folk, Hip-hop");

        Album album4 = new Album();
        album4.setId(4);
        album4.setArtist("Billie Eilish");
        album4.setName("When We All Fall Asleep, Where Do We Go?");
        album4.setReleaseDate(2019);
        album4.setSales(7.5);
        album4.setGenre("Pop, Electronic, Indie");

        Album album5 = new Album();
        album5.setId(5);
        album5.setArtist("The Beatles");
        album5.setName("Abbey Road");
        album5.setReleaseDate(1969);
        album5.setSales(12.0);
        album5.setGenre("Rock, Pop, Psychedelic");

        // Instantiating Authors

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("William");
        author1.setLastName("Shakespeare");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Mark");
        author2.setLastName("Twain");

        Author author3 = new Author();
        author3.setId(3);
        author3.setFirstName("Oscar");
        author3.setLastName("Wilde");

        Author author4 = new Author();
        author4.setId(4);
        author4.setFirstName("Virginia");
        author4.setLastName("Woolf");

        Author author5 = new Author();
        author5.setId(5);
        author5.setFirstName("Ernest");
        author5.setLastName("Hemingway");

        // Instantiating Quotes
        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("To be, or not to be: that is the question");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("All the world's a stage, and all the men and women merely players.");
        quote2.setAuthor(author1);

        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setContent("The secret of getting ahead is getting started.");
        quote3.setAuthor(author2);

        Quote quote4 = new Quote();
        quote4.setId(4);
        quote4.setContent("Age is an issue of mind over matter. If you don't mind, it doesn't matter.");
        quote4.setAuthor(author2);

        Quote quote5 = new Quote();
        quote5.setId(5);
        quote5.setContent("Be yourself; everyone else is already taken.");
        quote5.setAuthor(author3);

        Quote quote6 = new Quote();
        quote6.setId(6);
        quote6.setContent("I have nothing to declare except my genius.");
        quote6.setAuthor(author3);

        Quote quote7 = new Quote();
        quote7.setId(7);
        quote7.setContent("One cannot think well, love well, sleep well, if one has not dined well.");
        quote7.setAuthor(author4);

        Quote quote8 = new Quote();
        quote8.setId(8);
        quote8.setContent("A woman must have money and a room of her own if she is to write fiction.");
        quote8.setAuthor(author4);

        Quote quote9 = new Quote();
        quote9.setId(9);
        quote9.setContent("The world breaks everyone, and afterward, some are strong at the broken places.");
        quote9.setAuthor(author5);

        Quote quote10 = new Quote();
        quote10.setId(10);
        quote10.setContent("The first draft of anything is shit.");
        quote10.setAuthor(author5);

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3, quote4, quote5, quote6, quote7, quote8, quote9, quote10));
        for(Quote quote : quotes) {
            System.out.printf("%nAuthor: %s %s%nQuote: %s%n%n", quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());
        }



    }
}
