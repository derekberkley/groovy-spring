package com.codeup.groovy_spring.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    //TODO: Create a Post class. This class will ultimately represent a POST record from our database.
    // The class should have private properties and getters and setters for a title and body.
    // TODO: Add the appropriate JPA annotations to your Post class to create the table and columns.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
