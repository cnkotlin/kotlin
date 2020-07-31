package jqiang.Mutual.Java;
import java.util.ArrayList;

public class SAMInJava {
    private ArrayList<Runnable> runnables = new ArrayList<Runnable>();

    public void addTask(Runnable runnable){
        runnables.add(runnable);
        System.out.println("add: " + runnable + "size " + runnables.size() );
    }

    public void removeTask(Runnable runnable){
        runnables.remove(runnable);
        System.out.println("remove: " + runnable + " size " + runnables.size());
    }

}
