//https://borntodev.com/devlab/task/14

import java.util.Scanner;

public class gpa_cal {
    public static void main(String[] args) {
        String subject[] = { "THAI", "MATH", "ENGLISH", "SCIENCE", "SPORT" };
        float score[] = { 0, 0, 0, 0, 0 };
        float grade = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i != 5; i++) {
            float val = sc.nextFloat();
            grade += val;
            score[i] = val;
        }
        sc.close();

        for (int i = 0; i != 5; i++) {
            System.out.printf(subject[i] + " = " + "%.1f\n", score[i]);
        }
        System.out.println("---");
        float gpa = grade / 5;
        System.out.printf("GPA = %.1f", gpa);
    }
}