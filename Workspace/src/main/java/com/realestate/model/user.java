package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(unique = true)
    private String email;

    private String role;
    private String gender;
    @Column(name = "sign_In_As_Guest")
    private boolean signInAsGuest;

    @Column(name = "lastName")
    private String lastName;

//    private String createdAt;

    // Constructors
//    public User() {}

    public user(String username, String password, String email, String role, String gender, boolean signInAsGuest, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.gender = gender;
        this.signInAsGuest = signInAsGuest;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isGuest() {
        return signInAsGuest;
    }

    public void setGuest(boolean guest) {
        this.signInAsGuest = guest;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
// there is no need for this actually so i am just going to remove it by commenting it out
//    public String getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(String createdAt) {
//        this.createdAt = createdAt;
//    }
}

