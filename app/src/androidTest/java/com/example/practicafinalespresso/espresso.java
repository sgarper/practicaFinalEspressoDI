package com.example.practicafinalespresso;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)

public class espresso {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void millasAkms()
    {
        String [] kms={"1.60934","160.934","32.1868","-160.934","12.87472"};
        String [] millas={"1","100","20","-100","8"};

        for(int i=0;i<kms.length;i++)
        {
            Espresso.onView(withId(R.id.original)).perform(typeText(millas[i]), closeSoftKeyboard());
            Espresso.onView(withId(R.id.millas)).perform(click());
            Espresso.onView(withId(R.id.resultado)).check(matches(withText(kms[i])));
            Espresso.onView(withId(R.id.original)).perform(clearText());
        }
    }

    @Test
    public void kmsAmillas()
    {

        String [] kms={"1.60934","160.934","32.1868","-160.934","12.87472"};
        String [] millas={"1.0","100.0","20.0","-100.0","8.0"};

        for(int i=0;i<millas.length;i++)
        {
            Espresso.onView(withId(R.id.original)).perform(typeText(kms[i]), closeSoftKeyboard());
            Espresso.onView(withId(R.id.kms)).perform(click());
            Espresso.onView(withId(R.id.resultado)).check(matches(withText(millas[i])));
            Espresso.onView(withId(R.id.original)).perform(clearText());
        }
    }

    @Test
    public void celsiusAFahrenheit()
    {

        String [] Fahrenheit={"32.0","212.0","68.0","-148.0","46.4"};
        String [] celsius={"0","100","20","-100","8"};

        for(int i=0;i<Fahrenheit.length;i++)
        {
            Espresso.onView(withId(R.id.original)).perform(typeText(celsius[i]), closeSoftKeyboard());
            Espresso.onView(withId(R.id.f)).perform(click());
            Espresso.onView(withId(R.id.resultado)).check(matches(withText(Fahrenheit[i])));
            Espresso.onView(withId(R.id.original)).perform(clearText());
        }
    }

    @Test
    public void fahrenheitACelsius()
    {

        String [] Fahrenheit={"32","212","68","-148","46.4"};
        String [] celsius={"0.0","100.0","20.0","-100.0","8.0"};

        for(int i=0;i<celsius.length;i++)
        {
            Espresso.onView(withId(R.id.original)).perform(typeText(Fahrenheit[i]), closeSoftKeyboard());
            Espresso.onView(withId(R.id.c)).perform(click());
            Espresso.onView(withId(R.id.resultado)).check(matches(withText(celsius[i])));
            Espresso.onView(withId(R.id.original)).perform(clearText());
        }
    }


}
