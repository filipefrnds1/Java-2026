package project.applicationn;

import project.entities.Comment2;
import project.entities.Post2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramPost {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05:44",fmt1);
        LocalDateTime date2 = LocalDateTime.parse("28/07/2018 23:14:19",fmt1);

        Post2 post = new Post2(date,"Traveling to New Zealand",
                "I'm going to visit this wonderful country",12);

        Post2 post2 = new Post2(date2,"Good night guys", "See you tomorrow", 5);

        Comment2 comment = new Comment2("Have a nice trip!");
        Comment2 comment2 = new Comment2("Wow that's awesome!");

        post.addComment(comment);
        post.addComment(comment2);

        comment.setText("Good night");
        comment2.setText("May the Force be with you");

        post2.addComment(comment);
        post2.addComment(comment2);

        System.out.println(post);
        System.out.println(post2);



        sc.close();
    }
}
