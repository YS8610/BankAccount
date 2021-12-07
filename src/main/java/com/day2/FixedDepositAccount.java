package com.day2;

import java.util.ArrayList;
import java.util.List;

public class FixedDepositAccount
{
    //Declaring Attributes
        private final String name;
        private String accountNumber;
        private final float accountBalance;
        private List<String> transaction;
        private boolean isClosed;
        private String accountCreateDate;
        private String accountClosedDate;
        private float interest = 3;
        private int duration = 6;
        private boolean isChangedInterest = false;
        private boolean isChangedduration = false;

    //Constructors overloading
        public FixedDepositAccount(String name, float accountBalance)
        {
            this.name = name;
            this.accountBalance = accountBalance;
            this.isClosed = false;
            this.isChangedInterest = false;
            this.isChangedduration = false;
            this.transaction = new ArrayList<>(); 
        }
        public FixedDepositAccount(String name, float accountBalance, float interest)
        {
            this.name = name;
            this.accountBalance = accountBalance;
            this.interest = interest;
            this.isClosed = false;
            this.isChangedduration = false;
            this.transaction = new ArrayList<>(); 
        }
        public FixedDepositAccount(String name, float accountBalance, float interest, int dur)
        {
            this.name = name;
            this.accountBalance = accountBalance;
            this.interest = interest;
            this.duration = dur;
            this.isClosed = false;
            this.isChangedInterest = true;
            this.isChangedduration = true;
            this.transaction = new ArrayList<>(); 
        }
        //Get Name
        public String getName()
        {
            return this.name;
        }
    //Get and set Account number
        public String getAccountNumber()
        {
            return this.accountNumber;
        }
        public void setAccountNumber(String acctNo)
        {
            this.accountNumber = acctNo;
        }
    //Get accountBalance
        public float getaccountBalance()
        {
            return this.accountBalance;
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
        //Get and Set interest
        public float getInterest()
        {
            return this.interest;
        }
        public void setInterest(float rate)
        {
            try
            {
                if (isChangedInterest)
                {
                    throw new IllegalArgumentException("Interest rate can only be changed once");
                }
                else
                {
                    this.interest = rate;
                }
            }
            catch (IllegalArgumentException i)
            {
                System.err.println("Interest cannot be changed.");
            }
        }
        //Get and Set duration
        public int getDuration()
        {
            return this.duration;
        }
        public void setDuration(int month)
        {
            try 
            {
                if (isChangedduration)
                {
                    throw new IllegalArgumentException("Duration can only be changed once");
                }
                else
                {
                    this.duration = month;
                }
            }
            catch (IllegalArgumentException i) 
            {
                System.err.println("Duration cannot be changed");;
            }
        }
        // methods
        public void deposit(float amt)
        {
            System.out.println("Deposit operation is not allowed for fixed deposit");
        }
        public void withdraw(float amt)
        {
            System.out.println("withdraw operation is not allowed for fixed deposit");
        }
}

