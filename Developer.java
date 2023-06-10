import java.util.Set;
import java.util.HashSet;
public class Developer {
    private Integer id;
    private String name;
    private Set<String> books;

    public Integer getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Set<String> getBooks(){
        return books;
    }
    public void setBooks(Set<String> books){
        this.books = books;
    }

    public void addBook(String books){
        if(this.books == null){
            this.books = new HashSet<>();
        }
        this.books.add(books);
    }
    @Override
    public String toString() {
        return "Developer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
