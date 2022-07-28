import java.util.ArrayList;

public class Author {
    public Author() {

    }

    //attributes
    private String id;
    private String name;
    private String university;
    private String department;
    private String email;
    private String article1;
    private String article2;
    private String article3;
    private String article4;
    private String article5;

    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArticle1() {
        return article1;
    }

    public void setArticle1(String article1) {
        this.article1 = article1;
    }

    public String getArticle2() {
        return article2;
    }

    public void setArticle2(String article2) {
        this.article2 = article2;
    }

    public String getArticle3() {
        return article3;
    }

    public void setArticle3(String article3) {
        this.article3 = article3;
    }

    public String getArticle4() {
        return article4;
    }

    public void setArticle4(String article4) {
        this.article4 = article4;
    }

    public String getArticle5() {
        return article5;
    }

    public void setArticle5(String article5) {
        this.article5 = article5;
    }
    public ArrayList<Author> authorObjectCreator(ArrayList<String> arrayList){
        ArrayList<Author> authorArr = new ArrayList<Author>();
        for(int i = 0; i < arrayList.size(); i++){
            String line = arrayList.get(i);
            ArrayList<String> ar = new ArrayList<>();
            for (String piece : line.split(" ")){
                ar.add(piece);
            }
            authorArr.add(new Author());
            authorDefiner(authorArr.get(i),ar);
        }
        return authorArr;
    }
    public static void authorDefiner(Author author, ArrayList<String> arrayList){
        if (arrayList.size() == 2){
            author.setId(arrayList.get(1));
        }
        else if (arrayList.size() == 6){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
        }
        else if (arrayList.size() == 7){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
            author.setArticle1(arrayList.get(6));
        }
        else if (arrayList.size() == 8){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
            author.setArticle1(arrayList.get(6));
            author.setArticle2(arrayList.get(7));
        }
        else if (arrayList.size() == 9){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
            author.setArticle1(arrayList.get(6));
            author.setArticle2(arrayList.get(7));
            author.setArticle3(arrayList.get(8));
        }
        else if (arrayList.size() == 10){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
            author.setArticle1(arrayList.get(6));
            author.setArticle2(arrayList.get(7));
            author.setArticle3(arrayList.get(8));
            author.setArticle4(arrayList.get(9));
        }
        else if (arrayList.size() == 11){
            author.setId(arrayList.get(1));
            author.setName(arrayList.get(2));
            author.setUniversity(arrayList.get(3));
            author.setDepartment(arrayList.get(4));
            author.setEmail(arrayList.get(5));
            author.setArticle1(arrayList.get(6));
            author.setArticle2(arrayList.get(7));
            author.setArticle3(arrayList.get(8));
            author.setArticle4(arrayList.get(9));
            author.setArticle5(arrayList.get(10));
        }
    }
}
