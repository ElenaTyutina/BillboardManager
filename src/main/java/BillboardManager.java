public class BillboardManager {

    private Poster[] posters;
    private int postersCount = 0;

    public void addPoster(Poster poster) {
        if (postersCount < posters.length)
            postersCount = postersCount + 1;
        for (int i = postersCount - 1; i > 0; i--) {
            posters[i] = posters[i - 1];
        }
        posters[0] = poster;
    }

    public BillboardManager() {
        this(10);
    }

    public BillboardManager(int posterBatchSize) {
        posters = new Poster[posterBatchSize];
    }

    public Poster[] getPosters() {
        Poster[] tmp = new Poster[postersCount];
        for (int i = 0; i < postersCount; i++) {

            tmp[i] = posters[i];
        }
        return tmp;

    }
}


