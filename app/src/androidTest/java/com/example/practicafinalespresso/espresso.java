package com.example.practicafinalespresso;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

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

    /*@Test
    public void resetear() {
        Espresso.onView(withId(R.id.buttonReset)).perform(click());
        Espresso.onView(withId(R.id.textoOriginal)).check(matches(withText("Limpiado")));


    }

    @Test
    public void pruebaCambiar(){

        Espresso.onView(withId(R.id.textoOriginal)).perform(typeText("HolaMundo"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonCambiar)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("HolaMundo")));

    }

    @Test
    public void pruebaAceptar(){
        Espresso.onView(withId(R.id.textoOriginal)).perform(typeText("Prueba Texto"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonAceptar)).perform(click());
        Espresso.onView(withId(R.id.textoNuevo)).check(matches(withText("Prueba Texto")));

    }*/

}
