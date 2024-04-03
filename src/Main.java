import com.patterns.behavioral.strategy.*;
import com.patterns.structural.facade.Facade;

public class Main {
    public static void main(String[] args) {

        // Strategy

        Behavior defaultStrategy = new DefaultBehavior();
        Behavior defensiveStrategy = new DefensiveBehavior();
        Behavior offensiveStrategy = new OffensiveBehavior();

        Robot myBot = new Robot();

        myBot.setStrategy(defensiveStrategy);

        myBot.move();

        myBot.setStrategy(offensiveStrategy);
        myBot.move();

        //Facade

        Facade facade = new Facade();
        facade.migrateClient("Raul", "999999");
        
    }
}