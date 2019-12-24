public class StrategyPatternDemo {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp=new BasicCameraApp();
        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.setShareStrategy(new ShareByEmail());
        cameraApp.share();
    }
}
