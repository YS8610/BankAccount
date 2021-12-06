package com.day2;

import java.util.ArrayList;
import java.util.List;

public class BankAccount 
{
    //Declaring Attributes
        private final String name;
        private final String accountNumber;
        private float accountBalance;
        private List<String> transactions;
        private boolean isClosed;
        private String accountCreateDate;
        private String accountClosedDate;
    //Constructors overloading
        public BankAccount(String name, float accountBalance)
        {
            this.name = name;
            double d = Math.random()*1000000000;
            this.accountNumber = d+"";
            this.accountBalance = accountBalance;
            this.transactions = new ArrayList<>();
            this.isClosed = false;
        }
        public BankAccount(String name)
        {
            this.name = name;
            double d = Math.random()*1000000000;
            this.accountNumber = d+"";
            this.accountBalance = 0;
            this.transactions = new ArrayList<>();
            this.isClosed = false;
        }
    //Get Name
        public String getName()
        {
            return this.name;
        }
    //Get Account number
        public String getAccountNumber()
        {
            return this.accountNumber;
        }
    //Get and Set accountBalance
        public float getaccountBalance()
        {
            return this.accountBalance;
        }
        public void setaccountBalance(float amt)
        {
            this.accountBalance = amt;
        }
    //Get and Set isClosed
        public boolean getIsClosed()
        {
            return this.isClosed;
        }
        public void setIsClosed(boolean tf)
        {
            this.isClosed = tf;
        }
    //Get and Set accountCreateDate
        public String getaccountCreateDate()
        {
            return this.accountCreateDate;
        }
        public void setaccountCreateDate(String datetime)
        {
            this.accountCreateDate = datetime;
        }
    //Get and Set accountClosedDate
        public String getaccountClosedDate()
        {
            return this.accountClosedDate;
        }
        public void setaccountClosedDate(String datetime)
        {
            this.accountClosedDate = datetime;
        }
    // method
        public void deposit(float amt, String datetime)
        {
            try 
            {
                if (amt<0 || !isClosed)
                {
                    this.accountBalance += amt;
                    this.transactions.add("deposit "+ amt+" at " + datetime);
                }
                else
                {
                    throw new IllegalArgumentException("value must be non-negative or account must not be closed");
                }
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("IllegalArgumentException");
            }
        }
        public void withdraw(float amt, String datetime)
        {
            try
            {
                if (amt<=this.accountBalance || amt>=0 || !isClosed)
                {
                    this.accountBalance -= amt;
                    this.transactions.add("Withdraw "+ amt+" at " + datetime);
                }
                else
                {
                    throw new IllegalArgumentException("value must be non-negative or account must not be closed or value cannot be greater than account Balance");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("IllegalArgumentException");
            }
        }
    }