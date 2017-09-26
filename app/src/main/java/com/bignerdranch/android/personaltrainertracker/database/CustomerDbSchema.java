package com.bignerdranch.android.personaltrainertracker.database;

/**
 * Created by k on 9/25/2017.
 */

public class CustomerDbSchema {
    public static final class CustomerTable {
        public static final String Name = "customers";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String FNAME = "First Name";
            public static final String LNAME = "Last Name";
            public static final String EMAIL = "Email Address";
            public static final String CCARD = "Credit Card";
            public static final String CCEXP = "Expiration Date";
        }
    }
}
