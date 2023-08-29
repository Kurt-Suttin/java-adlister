import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {
        // Create instances of Author, Quote, and Album
        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Phaze burt");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setName("They dont teach this in the academy");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setName("That's why they call me WelBeSeeinYa");

        Album album1 = new Album();
        album1.setId(1);
        album1.setName("My first album");
        album1.setAuthor(author1);
        album1.setQuote(quote1);

        // Associating albums with author and quotes
        List<Album> albumsByAuthor1 = new ArrayList<>();
        albumsByAuthor1.add(album1);
        author1.setAlbums(albumsByAuthor1);
        quote1.setAlbums(albumsByAuthor1);
        quote2.setAlbums(albumsByAuthor1);

        // Print album, author, and quote information
        for (Album album : albumsByAuthor1) {
            System.out.println("Album Name: " + album.getName());
            System.out.println("Author Name: " + album.getAuthor().getName());
            System.out.println("Quote Content: " + album.getQuote().getName());
            System.out.println("Quote Content: " + quote2.getName()); // Print quote2 content
            System.out.println();
        }
    }
}
