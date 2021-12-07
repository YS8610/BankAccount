package com.day2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest
{

    BankAccount acct1 = new BankAccount("TFIP"); //Create bank account with name only (initial bank bal is set to 0f)
    BankAccount acct2 = new BankAccount("TFIP",1000f); // create bank acct with name and account balance of 1000f initialized

    @Test
    public void testGetAccountName()
    {
        assertTrue( acct1.getName().equals("TFIP") );
        assertTrue( acct1.getaccountBalance()==0f );
    }
    
    @Test
    public void testGetAccountBalance()
    {
        assertTrue( acct2.getName().equals("TFIP") );
        assertTrue( acct2.getaccountBalance() == 1000f );
    }

    @Test
    public void testDeposit()
    {
        float beforeDeposit = acct1.getaccountBalance();
        acct1.deposit(1000f, "071221");
        assertTrue(acct1.getaccountBalance()==beforeDeposit+1000f);
    }

    @Test
    public void testWithdraw()
    {
        float beforeWithdraw = acct2.getaccountBalance();
        acct2.withdraw(500f,"071221");
        assertTrue(acct2.getaccountBalance()==beforeWithdraw-500f);
    }

}
