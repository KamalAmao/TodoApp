import java.util.Objects;
public class Hosting {
    private int id;
    private String name; 
    private long websites;

    public Hosting(int id, String name, long websites){
        this.id = id;
        this.name = name;
        this.websites = websites;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getWebsites(){
        return websites;
    }
    public void setWebsites(long websites){
        this.websites = websites;
    }
    @Override
    public String toString() {
        return "Hosting{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", websites=" + websites +
                '}';
    } 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hosting hosting = (Hosting) o;
        return Objects.equals(name, hosting.name) && id == hosting.id && websites == hosting.websites;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, websites);
    }
}
