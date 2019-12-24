public class UserInterface implements Observer {
    private Subject subject;

    public void display() {
        System.out.println("UserInterface display: " + subject);
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
        display();
    }
}
