public class MadLib {

    public boolean trueOrFalse;
    public double decimalBiggerThan1;
    public int number1;
    public int number2;
    public int wholeNumberBetween1And4;
    public String miltonTeacher;
    public String miltonDean;
    public String letterGrade;
    public String season;
    public String pluralAnimal;
    public String pluralNoun;
    public String classmate ;
    public String city ;
    public String noun ;
    public String adjective ;
    public String activity;


    public static void main(String[] args) {
        System.out.println("Hello World");
        new MadLib();

    }

    public MadLib(){
        trueOrFalse= true;
        decimalBiggerThan1= 3.6;
        number1= 9;
        number2= 4;
        wholeNumberBetween1And4= 2;
        miltonTeacher = "Mrs. Polk";
        miltonDean = "Dr. Callen";
        letterGrade="A";
        season="Winter";
        pluralAnimal="Giraffes";
        pluralNoun="Houses";
        classmate="Natalie" ;
        city="New York" ;
        noun="Frog" ;
        adjective ="Shiny";
        activity="fishing";
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I think we might do some " + activity + " while there" + ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class."+" If we do not survive, however, it will be because of the "+pluralAnimal;

        //now print story to the dos window
        System.out.println(story);

    }


}
