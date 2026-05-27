package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        boolean aButton = gamepad1.a;
        if(aButton==false){
            telemetry.addData("speed",gamepad1.left_stick_y * 0.5);
        }
        else{
            telemetry.addData("speed",gamepad1.left_stick_y);
        }


    }

}
