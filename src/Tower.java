import java.util.ArrayList;

public abstract class Tower {
    private ArrayList<Flyable> observers;

    public Tower() {
        observers = new ArrayList<Flyable>();
    }

    public void register(Flyable flyable) {
//        if (flyable == null)
//            return ;
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
        //System.out.println("Tower says: " + flyable. + "#" + flyable "(" + this.id + ") unregistered from weather tower.");
    }

    protected void conditionsChanged() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateConditions();
        }
    }
}
