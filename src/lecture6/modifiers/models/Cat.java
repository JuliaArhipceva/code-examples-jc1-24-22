package lecture6.modifiers.models;

public class Cat {

    public String name;
    protected String breed;
    int age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void walk() {
        System.out.println("walk");
    }

    protected void talk() {
        System.out.println("meow");
    }

    void eat() {
        System.out.println("eat");
    }

    private void sleep() {
        System.out.println("sleep");
    }

    public void callSleepMethod() {
        sleep();
    }
}
