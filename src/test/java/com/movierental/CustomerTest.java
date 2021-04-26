package com.movierental;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CustomerTest {
    @Test
    public void test(){}
    @Test
    public void verifyThatTheGenratedStatementIsCorrect()
    {
      Customer customer=new Customer("Ginni");
      customer.addRental(new Rental(new Movie("avengers",Movie.REGULAR),3));
      customer.addRental(new Rental(new Movie("ruhi",Movie.CHILDRENS),2));
      customer.addRental(new Rental(new Movie("vd",Movie.NEW_RELEASE),4));
    assertEquals("Rental Record for Ginni\n"+
            "\tavengers\t3.5\n"+
            "\truhi\t1.5\n"+
            "\tvd\t12.0\n"+
            "Amount owed is 17.0\n"+
            "You earned 4 frequent renter points",customer.statement());


    }

}