package sample;

import javafx.animation.AnimationTimer;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Sergiy on 5/23/2017.
 */
public class MainController {
    int i = 1;
    IView instance;

    MainController(IView instance){
        /*this.instance = instance;
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 4000);*/
        AnimationTimer timerProcessSlide = new AnimationTimer() {
            @Override
            public void handle(long now) {
                instance.startWork(i);
                i++;
            }
        };
        timerProcessSlide.start();
    }

    class SayHello extends TimerTask {
        public void run() {
            instance.startWork(i);
            i++;
        }
    }

}
