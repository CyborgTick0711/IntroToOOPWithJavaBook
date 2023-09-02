/*
    Chapter 6 Sample program: Sleep statistics for Door residents
    File: Ch6SleepStatistics.java
 */
import javax.swing.*;
import java.text.*;
public class Ch6SleepStatistics {
    public static void main(String[] args){
        Ch6SleepStatistics prog = new Ch6SleepStatistics();
        prog.start();
    }
    public void start(){
        double sleepHour, sum = 0;
        int cnt = 0;

        //Enter the dorm name
        String dorm = JOptionPane.showInputDialog(null,"Dorm Name: ");

        //Loop: get hours of sleep foe each resident
        //      until 0 is entered


        sleepHour = getDouble("Enter sleep hours (0 - to stop:)");//priming read

        while (sleepHour != 0){
            sum += sleepHour;
            cnt++;

            sleepHour = getDouble("Enter sleep hours (0 - to stop:)");
        }
        if (cnt == 0){
            JOptionPane.showMessageDialog(null,"No Data Entered");
        }else {
            DecimalFormat df = new DecimalFormat("0.00");
            JOptionPane.showMessageDialog(null,
                    "Average sleep time for  "+
                            dorm + "is \n\n                   "+
                            df.format(sum/cnt) + "hours .");
        }
    }

    private double getDouble(String message){
        double result;

        String str = JOptionPane.showInputDialog(null,message);

        result = Double.parseDouble(str);

        return result;
    }

}
