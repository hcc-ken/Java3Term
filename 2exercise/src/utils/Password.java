package utils;

import java.util.Random;

public class Password {
    private int length;
    private String password;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Password() {
        length = 0;
        password = "";
    }

    public Password(int length) {
        this.length = length;
        generatePassword();
    }

    public boolean isStrong() {
        int upperCount = 0, lowerCount = 0, numberCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        return upperCount > 2 && lowerCount > 1 && numberCount > 2;
    }

    public String generatePassword() {
        Random generator = new Random();
        char character;
        String characters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ;,.:-_()[]{}0123456789";
        password = "";

        for (int i = 0; i < length; i++) {
            character = characters.charAt(generator.nextInt(characters.length()));
            password += character;
        }

        return password;
    }

    public boolean Equals(Password p){
        return password.equals(p.getPassword());
    }

}
