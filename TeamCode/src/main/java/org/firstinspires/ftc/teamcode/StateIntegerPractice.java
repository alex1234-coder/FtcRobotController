package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
@Disabled
@Autonomous
public class StateIntegerPractice extends OpMode {
    enum State{
        WAIT_FOR_A,
        WAIT_FOR_B,
        WAIT_FOR_X,
        FINISHED
    }
    State state=State.WAIT_FOR_A;
    //TestBench bench= new TestBench();
    @Override
    public void init(){
        //bench.init(hardwareMap);
        state=State.WAIT_FOR_A;
    }
    @Override
    public void loop(){
        telemetry.addData("State",state);
        switch(state){
            case WAIT_FOR_A:
                telemetry.addLine("to exit state,press A");
                if(gamepad1.a)
                    state=State.WAIT_FOR_B;
                break;
            case WAIT_FOR_B:
                telemetry.addLine("to exit state press B");
                if(gamepad1.b)
                    state=State.WAIT_FOR_X;
                break;
            case WAIT_FOR_X:
                telemetry.addLine("to exit state press X");
                if(gamepad1.x)
                    state=State.FINISHED;
                break;
            default:
                telemetry.addLine("Auto State Machine finished");
        }
    }
}
