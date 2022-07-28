import java.util.ArrayList;

public class Article {
    public Article() {

    }

    //attributes
    private String paperId;
    private String name;
    private String publisherName;
    private String publishYear;

    //getter and setter
    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public ArrayList<Article> articleObjectCreator(ArrayList<String> arrayList) {
        ArrayList<Article> articleArr = new ArrayList<Article>();
        for (int i = 0; i < arrayList.size(); i++) {
            String line = arrayList.get(i);
            ArrayList<String> ar = new ArrayList<>();
            for (String piece : line.split(" ")) {
                ar.add(piece);
            }
            articleArr.add(new Article());
            articleDefiner(articleArr.get(i), ar);
        }
        return articleArr;
    }

    public static void articleDefiner(Article article, ArrayList<String> arrayList){
        article.setPaperId(arrayList.get(1));
        article.setName(arrayList.get(2));
        article.setPublisherName(arrayList.get(3));
        article.setPublishYear(arrayList.get(4));
    }
}
