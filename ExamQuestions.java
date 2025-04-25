
/**
 * Exam 2 questions 24- 27 fix.
 *
 * @author Chloe Castrataro
 * @version 04/25/2025
 */
public class ExamQuestions
{
    /**
     * Constructor for objects of class ExamQuestions
     */
    public ExamQuestions()
    {
    
    }

    /**
     * Question 24
     */
    public void sampleMethod()
    {
        String s1 = new String();
        String s2 = new String();
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
     *
     */
    public void feverTemp(ArrayList<> temperature)
    {
        for(double i = 0; i< temperature.length; i++) {
            if(i> 37.5) {
                System.out.println(i);
            }
        }
        
        double max = 0;
        while(i> max && < temperature.length) {
            System.out.println(max);
            max++;
        }
    }
    
    /**
     * Question 26
     */
    public void feverTemp()
    {
        System.out.println(Collections.max(ArrayList<> temperature));
    }
    
    /**
     * Question 27
     */
    public void feverTemp()
    {
        Collections.sort(ArrayList<> temperature));
        System.out.println(temperature.max());
    }
}
