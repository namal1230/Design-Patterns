package org.example.templateMethod;

public class Main {
    public static void main(String[] args) {
        Computer windows = new WindowsComputer();
        windows.computerProcess();

        Computer linux = new LinuxComputer();
        linux.computerProcess();
    }
}
