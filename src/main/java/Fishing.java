public class Fishing extends Hobby {

    private String nameHobby;
    private int durationOfFishing;

    public Fishing() {}

    public Fishing(byte frequensyOfClasses, char markOfYourSkills, String nameHobby, int durationOfFishing) {
        super(frequensyOfClasses, markOfYourSkills);
        this.nameHobby = nameHobby;
        this.durationOfFishing = durationOfFishing;
    }

    public int getDurationOfFishing() {
        return durationOfFishing;
    }

    public void setDurationOfFishing(int durationOfFishing) {
        this.durationOfFishing = durationOfFishing;
    }

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public void tellAboutHobby() {
        {
            System.out.println("My hobby is " + getNameHobby());
            System.out.println("Duration of fishing: " + getDurationOfFishing());
            System.out.println("Frequensy of classes: " + getFrequensyOfClasses());
            System.out.println("Experience of hobby: " + getExperienceOfHobby());
            System.out.println("Your best result in this hobby:" + getYourBestResult());
            System.out.println("Period of starting: " + getPeriodOfStarting());
            System.out.println("Mark of your skills: " + getMarkOfYourSkills());
            System.out.println("You doing only this hobby? " + getOnlyThisHobby());
            System.out.println("How much friends you find in this hobby? " + getFriendsInHobby());
            System.out.println("Mark of benefit for you: " + getMarkOfBenefit());
        }
    }
}

