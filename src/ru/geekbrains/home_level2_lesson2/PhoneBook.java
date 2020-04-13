package ru.geekbrains.home_level2_lesson2;

import java.util.Objects;

public class PhoneBook {
    String phone;
    String mail;

    public PhoneBook (String phone, String email) {
        this.phone = phone;
        this.mail = email;
    }
    public String getPhone() {
        return phone;
    }
    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return this.getPhone() +" " + this.getMail();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneBook)) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return this.phone.equals(phoneBook.phone) && this.mail.equals(phoneBook.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, mail);
    }
}
