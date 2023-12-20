package data.models;

import lombok.Data;

@Data
public class Admin {
    private String adminId;
    private String username;
    private String password; //encrypt password
    private String email;
    private String role; // Role of the admin within the logistics system (e.g., system admin, user admin)
    private String permissions; // Permissions assigned to the admin (e.g., read, write, update, delete)
    private boolean isActive;
}
