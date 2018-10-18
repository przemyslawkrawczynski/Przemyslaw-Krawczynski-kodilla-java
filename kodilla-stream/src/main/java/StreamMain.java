import stream.Person.People;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forumUsers = new Forum();
        Map<Integer, ForumUser> resultForumList = forumUsers.getList().stream()
                .filter(f -> f.getUserSex() == 'M')
                .filter(f -> f.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(f -> f.getPublicatedPost() > 0)
                .collect(Collectors.toMap(ForumUser::getIdUser, f -> f));

        System.out.println("ForumUser list found [" + resultForumList.size() + "] items.");
        resultForumList.entrySet().stream()
                .map(entry -> "Id: " + entry.getKey() + entry.getValue())
                .forEach(System.out::println);
    }
}