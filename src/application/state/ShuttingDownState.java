package application.state;

import application.ApplicationManager;

public class ShuttingDownState implements ApplicationState {
    protected ShuttingDownState() {

    }

    public static ShuttingDownState getInstance() {
        return InstanceHolder.instance;
    }

    @Override
    public void enter(ApplicationManager am) {

    }

    @Override
    public ApplicationState handleInput(ApplicationManager am, String str) {
        return null;
    }

    @Override
    public void update(ApplicationManager am) {

    }

    @Override
    public void render() {

    }

    @Override
    public void exit() {

    }

    private static class InstanceHolder {
        public static ShuttingDownState instance = new ShuttingDownState();
    }
}
