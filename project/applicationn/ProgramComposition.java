package project.applicationn;

import project.entities.Comment;
import project.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramComposition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

        List<Post> list = new ArrayList<>();

        for(int i = 0; i < 2; i++) {

            System.out.print("moment: ");
            String date = sc.nextLine();
            LocalDateTime dt1 = LocalDateTime.parse(date, dtf1);
            System.out.print("title = ");
            String title = sc.nextLine();
            System.out.print("content = ");
            String content = sc.nextLine();
            System.out.print("Likes = ");
            Integer likes = sc.nextInt();
            sc.nextLine();

            Post post = new Post(dt1, title, content, likes);
            list.add(post);


            System.out.print("Text1 = ");
            String text1 = sc.nextLine();
            System.out.print("Text2 = ");
            String text2 = sc.nextLine();

            Comment comment1 = new Comment(text1);
            Comment comment2 = new Comment(text2);

            list.get(i).addComent(comment1);
            list.get(i).addComent(comment2);


        }

        for(Post post : list){
            System.out.println(post.getTitle());
            System.out.println(post.getLikes() + " Likes - " + post.getMoment());
            System.out.println(post.getContent());
            System.out.println("Comments: ");
            for(int i = 0; i < 2; i++){
                System.out.println(post.getComments().get(i).getText());
            }
            System.out.println();
        }




        sc.close();
    }
}
