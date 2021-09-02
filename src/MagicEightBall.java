import javax.management.MBeanRegistrationException;

public class MagicEightBall {
    private String answers[] = new String[10];
    
    public  MagicEightBall() {
        setAnswers();
    }

    public String getRandomAnswer() {
        return "getRandomAnswer method not set.";
    }

    private void setAnswers() {

    }
}
