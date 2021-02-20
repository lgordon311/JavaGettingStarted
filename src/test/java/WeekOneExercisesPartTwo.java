import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekOneExercisesPartTwo {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?
    //   When refactoring you don't want to change the results so you need to run the test clean prior to refactoring or
    //     you may introduce more bugs.

    //added return to first test and hardcoded .03
    // I didn't know i was going to learn math equations too, LOL!

    @Test

    public void bloodAlcoholLevelForAMale() {
        char gender = 'M';
        float genderRate = .73f;
        int weightInPounds = 185;
        int ouncesOfAlcoholConsumed = 3;
        float hoursSinceLastDrink = 2;

        float actualBAC = calculateBAC(gender, genderRate, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.03, actualBAC, .001);
        return;
    }

    @Test

    public void bloodAlcoholLevelForAFemale() {
        char gender = 'F';
        float genderRate = .66f;
        int weightInPounds = 135;
        int ouncesOfAlcoholConsumed = 5;
        float hoursSinceLastDrink = 1;

        float actualBAC = calculateBAC(gender, genderRate, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.11, actualBAC, .001);
    }

    /**
     * Given your weight, gender, number of drinks, the amount of alcohol
     * by volume of the drinks consumed, and the amount of time since your last drink,
     * calculate your Blood Alcohol Content (BAC).
     *
     * The weight quotient is 5.14 divided by the person's weight in pounds.
     * The alcohol distribution ratio is 0.73 for men and 0.66 for women.
     * The peak alcohol content is the product of the weight quotient, ounces of alcohol consumed, and the
     * alcohol distribution ratio.
     * The last consumption interval is the product of the hours since the last drink and 0.015.
     *
     * The Blood Alcohol Content is the difference between the peak alcohol content and the last consumption interval.
     *
     * @param gender
     * @param weightInPounds
     * @param ouncesOfAlcoholConsumed
     * @param hoursSinceLastDrink
     * @param genderRate
     * @return
     */

    private float calculateBAC(char gender, float genderRate, int weightInPounds, int ouncesOfAlcoholConsumed, float hoursSinceLastDrink) {
        // TODO RESPONSE: In the PluralSight video, you learned of three ways to make decisions based on the value
        //   in the gender variable. Implement this method using one way, and describe how the other ways could work.
        return ((5.14f/weightInPounds) * ouncesOfAlcoholConsumed * genderRate)-(hoursSinceLastDrink*.015f) ;
    }
}