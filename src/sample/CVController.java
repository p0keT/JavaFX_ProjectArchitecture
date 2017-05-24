package sample;


public class CVController implements IView {
    String[] args;

    CVController(){
        new MainController(getInstance());
    }

    @Override
    public IView getInstance() {
        return this;
    }

    @Override
    public void putText(String[] str) {
        args = str;
    }

    @Override
    public void startWork(int i) {
        System.out.println("Work started - args:"+i);
    }
}
