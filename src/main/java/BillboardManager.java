public class BillboardManager {

    private Poster[] posters ;
    private int postersCount=0;

//    public void addPoster(Poster poster) {
//        int length = posters.length + 1;
//
//        Poster[] tmp = new Poster[length];
//        for (int i = 0; i < posters.length; i++) {
//            tmp[i] = posters[i];
//
//            int lastIndex = posters.length - 1;
//            tmp[lastIndex] = poster;
//            posters = tmp;
//        }
//    }

    public void addPoster(Poster poster) {
        if ( postersCount < posters.length )
            postersCount = postersCount+1;
        for (int i = postersCount  - 1; i > 0; i--) {
            posters[i] = posters [i - 1];
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

//    public Poster[] recentMovies() {
//
//        int resultLength;
//        if (posters.length < posterBatchSize) {
//            resultLength = posters.length;
//        } else {
//            resultLength = posterBatchSize;
//        }
//        Poster[] tmp = new Poster[resultLength];
//        for (int i = posters.length - resultLength; i < posters.length; i++);
//        return tmp;
//    }

}


