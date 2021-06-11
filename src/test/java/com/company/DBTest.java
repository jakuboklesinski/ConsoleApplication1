package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBTest {
private DB db;
    @BeforeEach
    public void setUp() throws Exception {
        db = new DB();
    }
    @Test
    @DisplayName("Test pobierania danych z bazy")
    void getCOSTAM() {
        assertEquals("Jan Kowalski", db.getTab("test_aeh_students"));
    }
}