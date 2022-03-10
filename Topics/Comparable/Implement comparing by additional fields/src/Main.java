import java.util.Comparator;

class Article implements Comparable<Article> {
    private String title;
    private int size;
    private static final Comparator<Article> COMPARE_BY_SIZE_AND_TITLE =
            Comparator.comparing(Article::getSize)
                    .thenComparing(Article::getTitle);

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        return COMPARE_BY_SIZE_AND_TITLE.compare(this, otherArticle);
    }
}