package flipper.builder;

public class GameInitializer {

    public static void initializeGameTable(){
        new FlipperBuilder()
                .addTargets(6)
                .addBumpers(8)
                .build();

    }
}
