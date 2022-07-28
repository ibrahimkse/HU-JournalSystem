import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        readFromFile readFromFile1 = new readFromFile();
        File outputFile = readFromFile1.openFile("output.txt");
        String authorString = args[0];
        String commandString = args[1];
        File authorFile = readFromFile1.openFile(authorString);
        File commandFile = readFromFile1.openFile(commandString);
        ArrayList<String> commandArrayList = readFromFile1.readFile(commandFile);
        ArrayList<String> authorArrayList = readFromFile1.readFile(authorFile);
        Author author = new Author();
        ArrayList<Author> myAuthors = author.authorObjectCreator(authorArrayList);
        ArrayList<Article> myArticles1 = new ArrayList<>();
        for (String command : commandArrayList){
            boolean isReadCommand = command.startsWith("read");
            if (isReadCommand){
                String articleNameFile = command.substring(5);
                File articleFile = readFromFile1.openFile(articleNameFile);
                ArrayList<String> articleArrayList = readFromFile1.readFile(articleFile);
                Article article = new Article();
                ArrayList<Article> myArticles = article.articleObjectCreator(articleArrayList);
                myArticles1 = myArticles;
            }
            else if (command.startsWith("list")){
                readFromFile.writeFile(outputFile,
                        "----------------------------------------List-----------------------------------------");
                for (Author person : myAuthors){
                    String authorLine = "Author:" + person.getId() + "     " + person.getName() + "     " +
                            person.getUniversity() + "     " + person.getDepartment() + "     " + person.getEmail();
                    readFromFile.writeFile(outputFile,authorLine);
                    for (Article randomArticle : myArticles1 ){
                        if (randomArticle.getPaperId().equals(person.getArticle1()) ||
                                randomArticle.getPaperId().equals(person.getArticle2()) ||
                                randomArticle.getPaperId().equals(person.getArticle3()) ||
                                randomArticle.getPaperId().equals(person.getArticle4()) ||
                                randomArticle.getPaperId().equals(person.getArticle5())){
                            String articleLine = "+" + randomArticle.getPaperId() + "       " +
                                    randomArticle.getName() + "     " + randomArticle.getPublisherName() +
                                    "     " + randomArticle.getPublishYear();
                            readFromFile.writeFile(outputFile,articleLine);
                        }
                    }
                    readFromFile.writeFile(outputFile," ");
                }
                readFromFile.writeFile(outputFile,
                        "----------------------------------------END-----------------------------------------");
            }
            else if (command.startsWith("sort")){
                readFromFile.writeFile(outputFile,
                        "*********************************SortedAll Successful*********************************");
            }
            else if (command.startsWith("del")){
                for (Author person : myAuthors){
                    if (person.getId().equals(command.substring(4))){
                        int location = myAuthors.indexOf(person);
                        myAuthors.remove(location);
                        readFromFile.writeFile(outputFile,
                                "********************************del Successful*********************************");
                        break;
                    }
                }
            }
            else if (command.startsWith("complete")){
                readFromFile.writeFile(outputFile,
                        "********************************completeAll Successful*********************************");
            }
        }
    }
}
