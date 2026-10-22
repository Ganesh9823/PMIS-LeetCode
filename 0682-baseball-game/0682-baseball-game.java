
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                // Remove the previous score
                scores.remove(scores.size() - 1);
            }
            else if (op.equals("D")) {
                // Double the previous score
                int last = scores.get(scores.size() - 1);
                scores.add(last * 2);
            }
            else if (op.equals("+")) {
                // Sum of the previous two scores
                int last = scores.get(scores.size() - 1);
                int secondLast = scores.get(scores.size() - 2);
                scores.add(last + secondLast);
            }
            else {
                // Record a new integer score
                scores.add(Integer.parseInt(op));
            }
        }

        // Calculate the total score
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}
