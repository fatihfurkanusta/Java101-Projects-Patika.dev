public class Main {
    public static void main(String[] args) {
        Fighter f1 =new Fighter("Muhammed Ali",15,100,85,75);
        Fighter f2=new Fighter("Mike Tyson",25,100,85,25);

        Match match=new Match(f1,f2,83,86);
        match.run();

    }
}