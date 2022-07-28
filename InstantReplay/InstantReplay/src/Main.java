import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException {
        final Robot robot;
        robot = new Robot();

        // ctrl alt shift f11

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_F11);

        robot.delay(1000); // aka Thread.sleep :P

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_F11);
    }
}


