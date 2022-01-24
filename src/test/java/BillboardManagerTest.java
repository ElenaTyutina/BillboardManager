import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class BillboardManagerTest {

    @Test
    public void add3() {
        BillboardManager manager = new BillboardManager();
        Poster poster1 = new Poster("comedy", "film 1", new Date());
        manager.addPoster(poster1);
        Poster poster2 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster2);

        Poster[] actual = manager.getPosters();
        Poster[] expected = new Poster[]{poster2, poster1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void add4() {
        BillboardManager manager = new BillboardManager(2);
        Poster poster1 = new Poster("comedy", "film 1", new Date());
        manager.addPoster(poster1);
        Poster poster2 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster2);
        Poster poster3 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster3);

        Poster[] actual = manager.getPosters();
        Poster[] expected = new Poster[]{poster3, poster2};

        assertArrayEquals(expected, actual);
    }
}