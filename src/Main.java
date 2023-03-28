public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Евгений", "Петров");
        Author author2 = new Author("Александр","Иванов");
        Book book1 = new Book(1888, "Старые знаки", author1);
        Book book2 = new Book(1999, "Новые символы", author2);
        System.out.println("Первая книга: "+ book1.toString());
        System.out.println("Вторая книга: "+ book2.toString());
        System.out.println("Ниже меняем дату выхода книги");
        book1.setBookYear(1895);
        System.out.println("Переиздание первой книги: "+ book1.toString());
    }
}