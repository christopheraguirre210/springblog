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
//        4. Create a simple view that includes displays the title of the cat blog post the three images
//        5 (BONUS). Add a form to add additional images to the cat blog post.

@Entity
@Table(name = "post_images")
public class PostImage {

    private long id;

    private String image_title;

    private String url;

    @ManyToOne
    @JoinColumn (name = "post_id")
    private Post post;
}
