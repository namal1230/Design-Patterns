package org.example.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler username = new UserExistsHandler();
        Handler password = new ValidPasswordHandler();
        Handler userRole = new RoleCheckHandler();

        username.setNextHandler(password);
        password.setNextHandler(userRole);

        username.handle("Nimal","1234");

    }
}
