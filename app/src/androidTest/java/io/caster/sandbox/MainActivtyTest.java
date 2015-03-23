package io.caster.sandbox;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by user on 21/03/15.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivtyTest {

    @Rule public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test
    public void shouldBeAbleToLaucherMainScreen(){

        String texto = "Hello world!";

        // Type Text
        onView(withId(R.id.editText)).perform(typeText(texto));

        // Click on send
        onView(withId(R.id.button)).perform(click());

        // Verify is displayed
        onView(withId(R.id.helloword)).check(matches(withText(texto)));

        //onView(withText("Hello world!")).check(ViewAssertions.matches(isDisplayed()));
    }


}
