package org.example.chainOfResponsibility;

public class UserExistsHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {

        String name = "Nimal"; // or database data

        if (!username.equalsIgnoreCase(name)){
            System.out.println("User Not Registered");
            return false;
        }

        return handleNext(username,password);
    }
}
