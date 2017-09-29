package Chapter3.util;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

import java.util.Stack;

public class Tower {
    private Stack<Integer> tower;
    private int index;

    public Tower(int i ){
        tower = new Stack<Integer>();
        index = i;
    }

    public int getIndex(){
        return index;
    }

    public void add(int d) {
        if(tower.isEmpty() && tower.peek() >= d) {
            tower.push(d);
        }
    }

    public void moveToTop(Tower t) {
        int top = tower.pop();
        t.add(top);
    }

    public void render(){
        System.out.println("Tower at index of " +  index);
        for(int i=tower.size(); i>=0; i--) {
            System.out.println(" " + tower.get(i));
        }
    }

    public void moveTower(int n, Tower dest, Tower buffer) {
        if ( n > 0 ) {
            moveTower(n-1, buffer, dest);
            moveToTop(dest);
            buffer.moveTower(n-1, dest, this);
        }
    }
}
