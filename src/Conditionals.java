public class Conditionals {
    public String question;

    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();

    }//main method

    public Conditionals(){
        question = "Is your favorite color teal?";
        System.out.println(question);
        int randomInt = (int)(Math.random()*10)+1;

        if (randomInt==1) {
            System.out.println("unsure");
        } else if (randomInt==2) {
            System.out.println("Perchance, methinks");
        } else if (randomInt==3){
            System.out.println("Absolutely not");
        } else if (randomInt==4){
            System.out.println("Positively yes!");
        } else if (randomInt==5) {
            System.out.println("Probably");
        } else if (randomInt==6) {
            System.out.println("On everyone's life but mine, yes");
        } else if (randomInt==7) {
            System.out.println("Probably (smiles and nods convincingly)");
        } else if (randomInt==8) {
            System.out.println("Um... no");
        } else if (randomInt==9) {
            System.out.println("HAHAHAHAHAHA       no.");
        } else if (randomInt==10) {
            System.out.println("I don't know, what do you think");
        }


    }

}
