import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {
        // Create instances of Author, Quote, and Album
        Album album1 = new Album("biscuit", 2023, 100.50, "Delicious", "gravy");
        System.out.println(album1.getArtist());
        System.out.println(album1.getName());


        Author author1 = new Author("Phaze", "Burt");
        Quote quote = new Quote("They dont teach this in the academy");
        Quote quoteTwo = new Quote("That's why they call me WelBeSeeinYa");

        List<Quote> phazeQuotes = new ArrayList<>(List.of(quote,quoteTwo));

        // Print album, author, and quote information
        for (Quote phazeQuote: phazeQuotes) {
            System.out.println();
            System.out.println();
        }
    }
}
