package com.gerenciamentodepessoas.demo.model;

import com.gerenciamentodepessoas.demo.model.enums.Position;
import com.gerenciamentodepessoas.demo.model.enums.Projects;
import com.gerenciamentodepessoas.demo.model.enums.Seniority;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Person {
    //#region Atributs
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name_person")
    private String name;
    @Column(name = "link_linkedin")
    private String linkedin;
    @Column(name = "postintion")
    private Position  postition;
    private Seniority seniority;
    private Projects projects;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @PrePersist
    protected void onCreate() {
        createDate = new Date();
    }
    //#endregion

    //#region Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public Position getPostition() {
        return postition;
    }

    public void setPostition(Position postition) {
        this.postition = postition;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    //#endregion
}

