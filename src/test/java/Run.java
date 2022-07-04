import Logic.OrangeHomeLogic;
import org.testng.annotations.Test;

public class Run {
    @Test
    public static void run() throws InterruptedException {
        OrangeHomeLogic.login();
        OrangeHomeLogic.selectRecruitment();
        OrangeHomeLogic.fillRecruitmentForm();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
