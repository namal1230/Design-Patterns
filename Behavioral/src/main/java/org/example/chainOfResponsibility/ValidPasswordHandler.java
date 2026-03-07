package org.example.chainOfResponsibility;

public class ValidPasswordHandler extends Handler{

    String password = "12345";

    @Override
    public boolean handle(String username, String password) {

        if (!password.equalsIgnoreCase(this.password)){
            System.out.println("Password Not Matched");
            return false;
        }

        return handleNext(username, password);
    }
}
