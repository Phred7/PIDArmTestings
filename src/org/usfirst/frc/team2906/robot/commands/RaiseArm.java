package org.usfirst.frc.team2906.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class RaiseArm extends CommandGroup {

    public RaiseArm() {
       addSequential(new SetArmSetpoint(50));
    }
}
