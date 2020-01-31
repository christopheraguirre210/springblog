package com.codeup.springblog.Models;
import javax.persistence.*;


//TODO:One-to-Many Mini Exercise:
//        You will create a one-to-many relationship between the Post entity and the PostImage entity. Consider that...
//        - "One post may have many images."
//        - "Many images belong to one post."
//        1. In the relationship-practice branch of your Spring Blog's, add an entity of PostImage with the following fields:
//        id (typical primary key annotations)
//        image_title VARCHAR(100) NOT NULL
//        url VARCHAR(1000) NOT NULL - the url is for simple hot linking of images for now
//        post_id (a FK that will be created with the proper One-To-Many mapping)
//        2. Seed your posts table with a blog post about cats
//        3. Seed your post_images table with three images related to cats (use a hot-linked address for now).
//        4. Create a simple view that includes the title of the cat blog post and the three images
//        5 (BONUS). Add a form to add additional images to the cat blog post.

@Entity
@Table(name = "post_images")
public class PostImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String image_title;

    @Column(columnDefinition = "VARCHAR(1000) NOT NULL")
    private String url;

    @ManyToOne
    @JoinColumn (name = "post_id")
    private Post post;

    public PostImage() {
    }

    public PostImage(String image_title, String url, Post post) {
        this.image_title = image_title;
        this.url = url;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage_title() {
        return image_title;
    }

    public void setImage_title(String image_title) {
        this.image_title = image_title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
