public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    // Because there are 10 frames each has 2 chances to pick up pins except the 10th frame that has 3 = 10*2+1
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        // we're increasing the rolls by 1 for the array
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
        //arrays always start with zero
        int startOfNextFrameIndex = 0;

        for (int frame = 1; frame < 11; frame++) {
            if (rolls[startOfNextFrameIndex] == 10) {
                score += 10 + rolls[startOfNextFrameIndex + 1] + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 1;
            } else if (rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1] == 10) {
                score += 10 + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex = +2;
            } else {
                score += rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1];
                startOfNextFrameIndex += 2;
            }
        }

        return score;
    }
}
