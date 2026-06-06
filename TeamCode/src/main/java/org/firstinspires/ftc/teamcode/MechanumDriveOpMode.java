package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.MechanumDrive;

public class MechanumDriveOpMode extends OpMode {
    MechanumDrive drive=new MechanumDrive();
    @Override
    public void init(){
        drive.init(hardwareMap);
    }
    @Override
    public void loop(){
        double forward = -gamepad1.left_stick_y;
        double strafe  = gamepad1.left_stick_x;
        double rotate  = gamepad1.right_stick_x;
        drive.drive(forward, strafe, rotate);
    }
}
