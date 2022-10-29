public class Main {
    public static void main(String[] args) {
        String[] authors = {"Nicola Remy", "Abdul Alhazred"};
        String[] titles = {"Demonolatry", "Necronomicon"};
        System.out.println("Уголок Юного Сатаниста");

        for (int i = 0; i < titles.length; i++) {
            System.out.println("Автор: "+authors[i]+" Название книги: "+titles[i]);
        }

        Author author1 = new Author("Nicola", "Remy");
        Author author2 = new Author("Abdul", "Alhazred");
        Book book1 = new Book("Demonolatry", author1, 1595);
        Book book2 = new Book("Necronomicon", author2, 730);

        System.out.println("demonolatry.title = " + book1.getTitle());
        System.out.println("demonolatry.authorName : " + book1.getAuthor());
        System.out.println("demonolatry.yearPublishing = " + book1.getYearPublishing()+" AD");
        book1.setYearPublishing(1666);
        System.out.println("necronomicon.title = " + book2.getTitle());
        System.out.println("necronomicon.authorName : " + book2.getAuthor());
        System.out.println("necronomicon.yearPublishing = " + book2.getYearPublishing()+" AD");
        book2.setYearPublishing(666);
        System.out.println("demonolatry.getYearPublishing() = " + book1.getYearPublishing()+" AD");
        System.out.println("necronomicon.getYearPublishing() = " + book2.getYearPublishing()+" AD");
    }
}