public class Fotball extends Hobby {

    private String nameHobby;

    public Fotball() {}

    public Fotball(boolean onlyThisHobby, float friendsInHobby, int yourBestResult, String nameHobby) {
        super(onlyThisHobby, friendsInHobby, yourBestResult);
        this.nameHobby = nameHobby;
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

