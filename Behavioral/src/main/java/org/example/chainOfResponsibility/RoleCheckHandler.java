package org.example.chainOfResponsibility;

public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        String role = "admin";
        String admin = "namal";

        if (username.equalsIgnoreCase(admin)){
            System.out.println("Load Admin dashboard");
            return true;
        }
        System.out.println("Load User dashboard");
        return true;
    }
}
