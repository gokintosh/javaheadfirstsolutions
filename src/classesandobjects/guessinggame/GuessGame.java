package classesandobjects.guessinggame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean isp1Right=false;
        boolean isp2Right=false;
        boolean isp3Right=false;

        int targetNumber=(int)(Math.random()*10);
        System.out.println("I am guessing a number between 0 and 9");

        while(true){
            System.out.println("The number to guess is "+targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.println("player 1 has guessed"+guessp1);
            guessp2=p2.number;
            System.out.println("player 2 has guessed"+guessp2);
            guessp3=p3.number;
            System.out.println("player 3 has guessed"+guessp3);

            if(guessp1==targetNumber){
                isp1Right=true;
            }
            if(guessp2==targetNumber){
                isp2Right=true;
            }
            if(guessp3==targetNumber){
                isp3Right=true;
            }

            if(isp1Right||isp2Right||isp3Right){
                System.out.println("we have a winner!!");
                System.out.println("is it player 1?"+isp1Right);
                System.out.println("is it player 2?"+isp2Right);
                System.out.println("is it player 3?"+isp3Right);

                System.out.println("GAME OVER!!!");
                break;
            }else{
                System.out.println("player will have to try again");
            }


        }
    }
}
