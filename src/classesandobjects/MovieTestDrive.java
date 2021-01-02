package classesandobjects;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one=new Movie();
        one.title="Titanic";
        one.genre="love";
        one.rating=4;
        one.playIt();

        Movie two=new Movie();
        two.title="Tenet";
        two.genre="action";
        two.rating=5;
        two.playIt();

        Movie three=new Movie();
        three.title="RoboCop";
        three.genre="sci-fi";
        three.rating=3;
        three.playIt();
    }
}
