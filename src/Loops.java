public class Loops {
    public static void main(String[] args) {
        Loops mycount = new Loops();
    }

    public Loops(){
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
    }
    public void countUp(){
        for (int x=0; x<6; x++){
            System.out.println(x);}
    }
    public void countByThrees(){
        for (int x=1;x<6;x++){
            System.out.print(3*x+" ");
        }
    }
    public void countDown() {
        System.out.println();
        for (int x = 10; x > 0; x--) {
            System.out.print(x+", ");
        }
        System.out.print("Happy Loop Year!");
    }
    public void nestedLoop(){
        for(int x=1;x<=5;x++){
            System.out.println();
            for(int y=1;y<=x;y++){
                System.out.print(x+" ");
            }
        }
    }
}
