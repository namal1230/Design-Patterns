package org.example.templateMethod;

public class LinuxComputer extends Computer{
    @Override
    public void loadOS() {
        System.out.println("Load Linux OS");
    }
}
