import java.util.Random;

public class Deck {
    boolean[] exists = new boolean[36];

    {
        for (int i = 0; i<36;i++){
            exists[i] = true;
        }
    }

    int get(){
        Random r = new Random();
        while (true) {
            int id = r.nextInt(0, 36);
            boolean ex = exists[id];
            if (ex) {
                exists[id] = false;
                return id;
            }
        }
    }
}
