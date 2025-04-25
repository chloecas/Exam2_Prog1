import java.util.ArrayList;
import java.util.*;
/**
 * Exam 2 questions 24- 27 fix.
 *
 * @author Chloe Castrataro
 * @version 04/25/2025
 */
public class ExamQuestions
{
    private ArrayList<Double> temperature;
    /**
     * Constructor for objects of class ExamQuestions
     */
    public ExamQuestions()
    {
        //I have to define an ArrayList for question 26/27
        temperature = new ArrayList<>();
        temperature.add(38.5);
        temperature.add(37.5);
        temperature.add(39.1);
        temperature.add(35.5);
        temperature.add(36.5);
        temperature.add(40.0);
        
        fever(temperature);
    }

    /**
     * Question 24
     */
    public void sampleMethod()
    {
        String s1 = "hello";
        String s2 = "goodbye";
        if(s1.equals(s2)) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    }
    
    /**
     * Question 25 
     */
    private void fever(ArrayList<Double> temperature)
    {
        int count = 0;
        double max = 0;
        
        for(Double temp : temperature) {
            if(temp > 37.5) {
                count++;
            }
            if(temp > max) {
                max = temp;
            }
        }
        System.out.println("Number of fever cases reported: " + count);
        System.out.println("Highest fever case reported: " + max);
    }

    
    /**
     * Question 26
     */
    public void feverTempQ26()
    {
        System.out.println(Collections.max(temperature));
    }
    
    /**
     * Question 27
     */
    public void feverTempQ27()
    {
        Collections.sort(temperature);
        System.out.println(temperature.getLast());
    }
}
