package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    Manager m = new Manager("alex", "constantin", 2, LocalDate.of(2025,2,23), 40000, "tutte" );
    assertEquals("constantin", m)
}


