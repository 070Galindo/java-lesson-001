import java.util.Random;


public class MagicEightBall {
    String[] answer;
    Random random;

    public  MagicEightBall() {
        //created random variable with random type
        random = new Random();
        
        //Array compilled this way to make it easier to read
        answer = new String[8];
        answer[0] = new String("Yes");
        answer[1] = new String("No");
        answer[2] = new String("Maybe");
        answer[3] = new String("Ask Again");
        answer[4] = new String("Most Likely");
        answer[5] = new String("Probally Not");
        answer[6] = new String("Definitly");
        answer[7] = new String("Not A Chance");        
    }

    public String getRandomAnswer() {               
        //index goes to the amount given
        int index = random.nextInt(answer.length);
        
        //returns answer based on array + random variable
        return (answer[index]);
    }
}
