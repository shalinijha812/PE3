package myexercise3;

public class ConsecutiveSeries {
    public String consecutiveSeriesChecker(int[] arr) {
        int temp, flag = 0;
        for (int i = 0; i <= 5; i++) {

            if ((arr[i+1] - arr[i]) != 1) {
                flag = 1;
                break;
            }



        }
        if (flag == 1)
            return "non consecutive Series";
        else
            return "consecutive Series";

    }
}
