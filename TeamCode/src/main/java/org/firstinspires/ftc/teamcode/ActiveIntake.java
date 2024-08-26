package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ActiveIntake {

    DcMotorEx motor;

    public boolean reversed=false;
    double intakePower=1 , pausePower=0 , reversePower=-1;

    public ActiveIntake(HardwareMap hardwareMap)
    {
        motor=hardwareMap.get(DcMotorEx.class , "port0");

        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        if(reversed)
            motor.setDirection(DcMotorSimple.Direction.REVERSE);
        motor.setPower(pausePower);
    }

    public void setIntake()
    {
        motor.setPower(intakePower);
    }
    public void setPause()
    {
        motor.setPower(pausePower);
    }
    public void setReverse()
    {
        motor.setPower(reversePower);
    }

    public boolean isIntake()
    {
        if(motor.getVelocity()==intakePower)return true;
        return false;
    }
    public boolean isPause()
    {
        if(motor.getVelocity()==pausePower)return true;
        return false;
    }
    public boolean isReverse()
    {
        if(motor.getVelocity()==reversePower)return true;
        return false;
    }


}
