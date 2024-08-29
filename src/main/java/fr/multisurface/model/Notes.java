package fr.multisurface.model;

import javax.annotation.processing.Generated;

@Entity
public class Notes {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
