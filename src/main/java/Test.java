import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Hobby arrFishing[] = new Fishing[2];
        Hobby arrFootball[] = new Fotball[2];

        byte frequensyOfClasses;
        char markOfYourSkills;
        String nameHobby;
        int durationOfFishing;
        System.out.println("FISHING");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name of hobby number " + Integer.toString(i+1));
            nameHobby = scan.next();
            System.out.println("Input mark of your skill(char) of hobby number " + Integer.toString(i+1));
            markOfYourSkills = scan.next().charAt(0);
            System.out.println("Input frequensy of classes of hobby number " + Integer.toString(i+1));
            frequensyOfClasses = scan.nextByte();
            System.out.println("Enter duration of classes hobby number " + Integer.toString(i+1));
            durationOfFishing = scan.nextInt();
            arrFishing[i] = new Fishing(frequensyOfClasses, markOfYourSkills, nameHobby, durationOfFishing);
        }

        boolean onlyThisHobby;
        float friendsInHobby;
        int yourBestResult;
        System.out.println("OTHERS");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name of hobby number " + Integer.toString(i+1));
            nameHobby = scan.next();
            System.out.println("Hobby number " + Integer.toString(i+1) + " is only for you?");
            onlyThisHobby = scan.nextBoolean();
            System.out.println("How meny friends you found with hobby number " + Integer.toString(i+1));
            friendsInHobby = scan.nextFloat();
            System.out.println("Your best result in hobby number " + Integer.toString(i+1));
            yourBestResult = scan.nextInt();
            arrFootball[i] = new Fotball(onlyThisHobby, friendsInHobby, yourBestResult, nameHobby);
        }

        for(int i = 0; i < 2; i++) {
            arrFishing[i].tellAboutHobby();
        }

        for(int i = 0; i < 2; i++) {
            arrFootball[i].tellAboutHobby();
        }
    }

}
