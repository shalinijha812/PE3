package myexercise3;

import java.util.Scanner;

 public class StudentMarks {
//    int numOfStudents;
//    int stuGrades[]=new int[10];
    public int checkGrades(int grades[],int size) {
        int i = 0;
        int temp;

        for (i = 0; i < size; i++) {
            try {
                if ((grades[i] < 1) || (grades[i] > 100)) {
                    temp = grades[i];
                    throw new InvalidInput(temp);
                }

            } catch (InvalidInput e) {
                System.out.println(e);
                return grades[i];
            }
        }
        return 0;

    }
}


