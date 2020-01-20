package com.iampatildipak;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (this.age > 12) {
            if (age < 20)
                return true;
        }
        return false;
    }

    public String getFullName() {
        if ((firstName != null && firstName.trim() != "") && (lastName != null && lastName.trim() != ""))
            return this.firstName + " " + lastName;
        else if (firstName != null && firstName.trim() != "")
            return this.firstName;
        else if (lastName != null && lastName.trim() != "")
            return this.lastName;
        else return "";
    }
}