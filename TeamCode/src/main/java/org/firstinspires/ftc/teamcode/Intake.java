package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Intake extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {

        ActiveIntake activeIntake=new ActiveIntake(hardwareMap);
        DropDown dropDown=new DropDown(hardwareMap);


        while(opModeInInit())
        {
            activeIntake.setPause();
            dropDown.setUp();
        }

        waitForStart();

        while(opModeIsActive())
        {



            if(gamepad1.right_trigger>0)
            {
                activeIntake.setIntake();
                dropDown.setDown();
            }

            if(gamepad1.left_trigger>0)
            {
                activeIntake.setReverse();
                dropDown.setUp();
            }
            
            if(gamepad1.right_trigger==0 && gamepad1.left_trigger==0)
            {
                dropDown.setUp();
                activeIntake.setPause();
            }

        }


    }
}
