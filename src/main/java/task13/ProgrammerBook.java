package task13;

import task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) o;
        return level == book.level && Objects.equals(language, book.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return String.format("ProgrammerBook{language='%s', level=%d}", language, level);
    }
}
