package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class DropDown {

    Servo servo;

    public static boolean reversed=false;
    double upPosition=0 , downPosition=1;

    public DropDown(HardwareMap hardwareMap)
    {
        servo=hardwareMap.get(Servo.class , "port0");
        if(reversed)
        servo.setDirection(Servo.Direction.REVERSE);

        servo.setPosition(upPosition);
    }

    public void setUp()
    {
        servo.setPosition(upPosition);
    }
    public void setDown()
    {
        servo.setPosition(downPosition);
    }

    public boolean isUp()
    {
        if(servo.getPosition()==upPosition)return true;
        return false;
    }

    public boolean isDown()
    {
        if(servo.getPosition()==downPosition)return true;
        return false;
    }

}
