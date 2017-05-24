package sample;

public class Main{


    public static void main(String[] args) {
        args = new String[1];
        args[0]="1";
        if(args[0].equals("0")){
            new CVController();
        }else{
            new ViewLauncher().dosmth(args);
        }


    }
}
