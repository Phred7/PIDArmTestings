package org.usfirst.frc.team2906.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;


public class LowerArm extends CommandGroup {

    public LowerArm() {
        addSequential(new SetArmSetpoint(10));
        addSequential(new WaitCommand(.5));
        addSequential(new SetArmSetpoint(0));
    }
}
