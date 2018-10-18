package stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(1, "Bartosz Ułański", 'M', LocalDate.of(1996, 8, 13), 5));
        userList.add(new ForumUser(2, "Paulina Scyzor", 'F', LocalDate.of(1982, 9, 12), 0));
        userList.add(new ForumUser(3, "Grzegorz Dziubek", 'M', LocalDate.of(1981, 1, 13), 4));
        userList.add(new ForumUser(4, "Magdalena Godzwoń", 'F', LocalDate.of(1987, 2, 13), 0));
        userList.add(new ForumUser(5, "Jan Kowalski", 'M', LocalDate.of(1991, 11, 1), 5));
        userList.add(new ForumUser(6, "Joanna Wiśniewska", 'F', LocalDate.of(1982, 4, 7), 5));
        userList.add(new ForumUser(7, "Daria Grzymała", 'F', LocalDate.of(1988, 8, 9), 1));
        userList.add(new ForumUser(8, "Mariusz Jawor", 'M', LocalDate.of(1978, 9, 5), 5));
        userList.add(new ForumUser(9, "Anna Wójcik", 'F', LocalDate.of(1968, 11, 13), 5));
        userList.add(new ForumUser(10, "Hanna Leśniak", 'f', LocalDate.of(1989, 12, 11), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}