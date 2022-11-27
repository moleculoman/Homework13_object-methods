import java.util.Objects;

public class Author  {
    private String authorFirstName;
    private String authorSurName;
    public Author(String authorFirstName, String authorSurName) {
        this.authorFirstName = authorFirstName;
        this.authorSurName = authorSurName;
    }

    public String getAuthorFullName(){
        return authorFirstName+ " "+ authorSurName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorSurName.equals(author.authorSurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSurName);
    }

    @Override
    public String toString() {
        return "Автор: " + this.authorFirstName + " " + this.authorSurName;
    }
}
