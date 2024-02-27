package oop.lesson2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    ArrayDeque<Actor> queue;
    ArrayList<Actor> market;

    @Override
    public void acceptToMarket(Actor actor) {
        market.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        market.removeAll(actors);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        Human human = (Human) queue.peek();
        if (human != null) {
            human.setTakeOrder();
        }
    }

    @Override
    public void giveOrders() {
        Human human = (Human) queue.peek();
        if (human != null) {
            human.setMakeOrder();
        }
    }

    @Override
    public void releaseFromQueue() {
        queue.poll();
    }
}
