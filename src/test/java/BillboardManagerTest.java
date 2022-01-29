import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class BillboardManagerTest {

    @Test
    public void testLess() {
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
    public void testMore() {
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

    @Test
    public void Equals() {
        BillboardManager manager = new BillboardManager();
        Poster poster1 = new Poster("comedy", "film 1", new Date());
        manager.addPoster(poster1);
        Poster poster2 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster2);
        Poster poster3 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster3);
        Poster poster4 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster4);
        Poster poster5 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster5);
        Poster poster6 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster6);
        Poster poster7 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster7);
        Poster poster8 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster8);
        Poster poster9 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster9);
        Poster poster10 = new Poster("comedy", "film 2", new Date());
        manager.addPoster(poster10);

        Poster[] actual = manager.getPosters();
        Poster[] expected = new Poster[]{poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};

        assertArrayEquals(expected, actual);
    }


}




