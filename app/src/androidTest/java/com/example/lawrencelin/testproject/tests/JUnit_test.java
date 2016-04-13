package com.example.lawrencelin.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.lawrencelin.testproject.MainActivity;
import com.example.lawrencelin.testproject.R;


/**
 * Created by lawrencelin on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity=getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!",tester);

    }

}
