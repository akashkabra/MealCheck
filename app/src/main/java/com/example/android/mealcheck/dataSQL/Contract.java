package com.example.android.mealcheck.dataSQL;

import android.provider.BaseColumns;

//API Contract to build the database
public final class Contract {

    //empty constructor
    private Contract() {
        //empty
    }

    public static final class MealEntry implements BaseColumns {

        //name of the 7 tables
        public final static String TABLE_MONDAY = "monday";
        public final static String TABLE_TUESDAY = "tuesday";
        public final static String TABLE_WEDNESDAY = "wednesday";
        public final static String TABLE_THURSDAY = "thursday";
        public final static String TABLE_FRIDAY = "friday";
        public final static String TABLE_SATURDAY = "saturday";
        public final static String TABLE_SUNDAY = "sunday";


        //column _id
        public final static String _ID = BaseColumns._ID;

        //column mean name
        public final static String COLUMN_MEAL_NAME = "meal";

        //column Checked or not
        public final static String COLUMN_CHECKED = "check";

        //values for COLUMN_CHECKED
        public static final int EATEN = 1;
        public static final int NOTEATEN = 0;

    }
}
