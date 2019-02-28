package com.stackroute.domain;

public class Actor {
    private String actorName;
    private String gender;
    private int age;

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
