package stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private int idUser;
    private String userName;
    private char userSex;
    private LocalDate dateOfBirth;
    private int publicatedPost;

    public ForumUser(int idUser, String userName, char userSex, LocalDate dateOfBirth, int publicatedPost) {
        this.idUser = idUser;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.publicatedPost = publicatedPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublicatedPost() {
        return publicatedPost;
    }

    @Override
    public String toString() {
        return "    Name: " + userName + " | User Sex (M/F) :" + userSex + " | Date of Birth: " + dateOfBirth + " | Numbers of publicated posts: " + publicatedPost;
    }
}

