package frc.robot;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.util.Color;

public class TeensyLED extends CAN {
    public TeensyLED(int deviceId) {
        super(deviceId);
    }

    public void setColor(Color color, int ledIndex) {
        writePacket(new byte[] {
                        (byte) (color.red*255),
                        (byte) (color.blue * 255),
                        (byte) (color.green*255),
                        (byte) ledIndex}
                , 10);
    }
}
