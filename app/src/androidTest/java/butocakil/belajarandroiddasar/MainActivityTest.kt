package butocakil.belajarandroiddasar

import android.content.Context
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
   
//    ini cara manual :
//
//    lateinit var activityScenario: ActivityScenario<MainActivity>

//    @Before
//    fun setUp() {
//        activityScenario = ActivityScenario.launch(MainActivity::class.java)
//    }
    

//     @After
//     fun tearDown() {
//       activityScenario.close()
//     }
// 

@get:Rule
var mainActivityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testMainActivity() {
        
        val context = ApplicationProvider.getApplicationContext<Context>()
        val name = "Audyari"

        onView(withId(R.id.nameEditText))
        .perform(typeText(name))

        onView(withId(R.id.sayHelloButton))
        .perform(click())

        onView(withId(R.id.sayHelloTextView))
        .check(matches(withText(context.getString(R.string.sayHelloTextView, name))))

        Thread.sleep(5000)

    }

}
