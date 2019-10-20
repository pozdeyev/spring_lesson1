package cameras;
import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }
}
