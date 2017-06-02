package org.usfirst.frc.team2906.robot.commands;



import org.usfirst.frc.team2906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class SetArmSetpoint extends Command {
	private double setpoint;

	public SetArmSetpoint(double setpoint) {
		this.setpoint = setpoint;
		requires(Robot.armDrive);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.armDrive.enable();
		Robot.armDrive.setSetpoint(setpoint);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Robot.armDrive.onTarget();
	}
}



