package com.sammidev.belajar.web.model;

import java.util.Date;
import java.util.Objects;

public class Todo {
    private int id;
    private String user;
    private String desc;
    private Date targetData;
    private boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTargetData() {
        return targetData;
    }

    public void setTargetData(Date targetData) {
        this.targetData = targetData;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Todo(int id, String user, String desc, Date targetData, boolean isDone) {
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.targetData = targetData;
        this.isDone = isDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id &&
                isDone == todo.isDone &&
                Objects.equals(user, todo.user) &&
                Objects.equals(desc, todo.desc) &&
                Objects.equals(targetData, todo.targetData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, desc, targetData, isDone);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", targetData=" + targetData +
                ", isDone=" + isDone +
                '}';
    }
}
