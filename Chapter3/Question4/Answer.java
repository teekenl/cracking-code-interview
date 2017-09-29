package Chapter3.Question4;

import Chapter3.util.*;

public class Answer{

    public Answer() {

    }
    public static void main(String[] args) {
        int n = 10;
        Tower[] towers = new Tower[n];
        for(int i = 0; i < 3; i++) towers[i] = new Tower(i);
        for(int i = n - 1; i>=0 ; i--) {
            towers[0].add(i);
        }
        towers[0].moveTower(n,towers[2],towers[1]);
    }

}
