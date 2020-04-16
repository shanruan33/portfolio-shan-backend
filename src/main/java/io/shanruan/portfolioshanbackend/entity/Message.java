package io.shanruan.portfolioshanbackend.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String content;

    public Message() {
    }

    public Message(String name, String email, String content) {
        this.name = name;
        this.email = email;
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message id(int id) {
        this.id = id;
        return this;
    }

    public Message name(String name) {
        this.name = name;
        return this;
    }

    public Message email(String email) {
        this.email = email;
        return this;
    }

    public Message content(String content) {
        this.content = content;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Message)) {
            return false;
        }
        Message message = (Message) o;
        return id == message.id && Objects.equals(name, message.name) && Objects.equals(email, message.email) && Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, content);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", content='" + getContent() + "'" +
            "}";
    }
}