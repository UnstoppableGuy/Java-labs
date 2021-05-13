package com.pavel.objects;

public class VkUser {

    private String firstName;
    private String email;

    public VkUser(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}
