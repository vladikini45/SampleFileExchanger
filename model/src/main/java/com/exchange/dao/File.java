package com.exchange.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.Objects;

public class File {

    private Long id;

    private Long user_id;

    private String url;

    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;

    private Long categoryId;

    public File() {
    }

    public File(Long id, Long user_id, String url, LocalDate date) {
        this.id = id;
        this.user_id = user_id;
        this.url = url;
        this.date = date;
    }

    public File(Long id, Long user_id, String url, String description, LocalDate date) {
        this(id, user_id, url, date);
        this.description = description;
    }

    public File(Long id, Long user_id, String url, String description, LocalDate date, Long categoryId) {
        this(id, user_id, url, description, date);
        this.categoryId = categoryId;
    }

    public File(Long id, Long user_id, String url, String description, Long categoryId) {
        this.id = id;
        this.user_id = user_id;
        this.url = url;
        this.description = description;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(id, file.id) &&
                Objects.equals(user_id, file.user_id) &&
                Objects.equals(url, file.url) &&
                Objects.equals(description, file.description) &&
                Objects.equals(date, file.date) &&
                Objects.equals(categoryId, file.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, url, description, date, categoryId);
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", categoryId=" + categoryId +
                '}';
    }
}
