import java.util.Objects;

public class Book {
        private final String title;
        private final Author authorName;
        public int yearPublishing;
        public   Book(String title, Author authorName, int yearPublishing) {
            this.title = title;
            this.authorName = authorName;
            this.yearPublishing = yearPublishing;
        }

        public String getTitle() {
            return this.title;
        }

        public Author getAuthorName() {
            return this.authorName;
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
            return yearPublishing == book.yearPublishing && title.equals(book.title) && authorName.equals(book.authorName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, authorName, yearPublishing);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    "authorName=" + authorName+
                    ", yearPublishing=" + yearPublishing +
                    '}';
        }

        public String getname() {
            return getAuthorName().getname();
        }

        public String getsurname() {
            return getAuthorName().getsurname();
        }

}
