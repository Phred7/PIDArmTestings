package org.usfirst.frc.team2906.robot.commands;



import org.usfirst.frc.team2906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class SetArmSetpoint extends Command {
	
	double m_setpoint;

    public SetArmSetpoint(double setpoint) {
    	m_setpoint = setpoint;
        requires(Robot.armDrive);
        requires(Robot.armDrive);
    }

    protected void initialize() {
    	Robot.armDrive.enable();
    	Robot.armDrive.setSetpoint(m_setpoint);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.armDrive.onTarget();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}


