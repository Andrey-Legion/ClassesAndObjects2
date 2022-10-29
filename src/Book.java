import java.util.Objects;

public class Book {
        private final String title;
        private final Author author;
        public int yearPublishing;
        public Book(String title, Author author, int yearPublishing) {
            this.title = title;
            this.author = author;
            this.yearPublishing = yearPublishing;
        }

        public String getTitle() {
            return this.title;
        }

        public Author getAuthor() {
            return this.author;
        }

        public int getYearPublishing() {
            return this.yearPublishing;
        }

        public void setYearPublishing(int yearPublishing) {
            if (yearPublishing>2023){
                System.out.println("Неправильно введённый год издания " + yearPublishing);
                return;
            }
            this.yearPublishing=yearPublishing;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return yearPublishing == book.yearPublishing && title.equals(book.title) && author.equals(book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, yearPublishing);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    //"author=" + author +
                    ", yearPublishing=" + yearPublishing +
                    '}';
        }



}
