package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePad extends OpMode {
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        double speedForward = -gamepad1.left_stick_y;
        double lookForward = -gamepad1.right_stick_y;
        telemetry.addData("left joystick x axis",gamepad1.left_stick_x);
        telemetry.addData("left joystick y axis",speedForward);
        telemetry.addData("right joystick x axis",gamepad1.right_stick_x);
        telemetry.addData("right joystick y axis",lookForward);
        telemetry.addData("a button",gamepad1.a);
        telemetry.addData("b button",gamepad1.b);
        telemetry.addData("x button",gamepad1.x);
        telemetry.addData("y button",gamepad1.y);
        telemetry.addData("dpad up",gamepad1.dpad_up);
        telemetry.addData("dif lx rx",gamepad1.left_stick_x-gamepad1.right_stick_x);
        telemetry.addData("sum lt rt",gamepad1.left_trigger+gamepad1.right_trigger);
    }

}
