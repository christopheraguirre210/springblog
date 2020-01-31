package com.codeup.springblog.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, columnDefinition = ("TEXT"))
    private String body;

    @OneToOne(mappedBy = "post")
    private PostDetails postDetails;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostImage> postImages;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    public Post() {
    }

    public Post(Long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PostDetails getPostDetails(){
        return postDetails;
    }

    public void setPostDetails(PostDetails postDetails){
        this.postDetails = postDetails;
    }

    public List<PostImage> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImage> postImages) {
        this.postImages = postImages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postDetails=" + postDetails +
                '}';
    }
}
