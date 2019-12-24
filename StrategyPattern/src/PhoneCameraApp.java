abstract public class PhoneCameraApp {
    /*------------- Common behaviours --------------*/
    public void take() {
        System.out.println("Photo is been clicked");
    }

    public void save() {
        System.out.println("Photo is been saved");
    }
    /*------------- Common behaviours --------------*/

    // Different mechanism for different Apps
    abstract public void edit();

    // Different algorithm for sharing - by Text/Email/Social
    private ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share(){
        this.shareStrategy.share();
    }
}
