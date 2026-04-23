package project.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post2 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment2> comment = new ArrayList<>();


    public Post2(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment2 comment2){
        comment.add(comment2);
    }

    public void removeComment(Comment2 comment2){
        comment.remove(comment2);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle()).append("\n");
        sb.append(getLikes()).append(" Likes - ").append(fmt1.format(getMoment())).append("\n");
        sb.append(getContent()).append("\n");
        sb.append("Comments: \n");
        for(Comment2 c : comment){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();

    }


}
