package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void insertTest() {
        //Arrange
        Account account = new Account("1234", "Luay", 50);
        int expected = 100;
        //Act
        int actual = account.insert(50);
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void withdrawTest() {
        //Arrange
        Account account = new Account("1234", "Luay", 50);
        int expected = -1;
        // Act
        int actual = account.withdraw(60);
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void transferTest() {
        Account account1 = new Account("1234", "Luay", 100);
        Account account2 = new Account("5678", "Efraim", 250);
        int expected = 35;

        int actual = account1.transfer(account2, 60);

        assertEquals(expected, actual);
    }

}