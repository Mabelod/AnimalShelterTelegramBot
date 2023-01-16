package com.example.animalsheltertelegrambot.record;

public class UserRecord {
    private Long id;
    private Long idChat;
    private String name;
    private String phoneNumber;
    private Integer shelter;
    private AnimalRecord animal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdChat() {
        return idChat;
    }

    public void setIdChat(Long idChat) {
        this.idChat = idChat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getShelter() {
        return shelter;
    }

    public void setShelter(Integer shelter) {
        this.shelter = shelter;
    }

    public AnimalRecord getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalRecord animal) {
        this.animal = animal;
    }
}
