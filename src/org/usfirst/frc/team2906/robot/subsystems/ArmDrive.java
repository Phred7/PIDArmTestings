package org.usfirst.frc.team2906.robot.subsystems;



import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class ArmDrive extends PIDSubsystem {

    // Initialize your subsystem here
	private final Spark motor;
	private final Encoder enc;
	private String name;

	// Initialize your subsystem here
	public ArmDrive(int motorPort, String name) {
		super(name, 10.0, 0.0, 10.0);
		this.name = name;
		motor = new Spark(motorPort);
		enc = new Encoder(0, 1);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		getPIDController().setSetpoint(0);
		getPIDController().enable();

		LiveWindow.addActuator(this.name, "motor", motor);
		LiveWindow.addSensor(this.name, "enc", enc);
		LiveWindow.addActuator(this.name, "PIDSubsystem Controller", getPIDController());

	}

	public void initDefaultCommand() {
	}

	@Override
	public boolean onTarget() {
		double e = Math.abs(getPIDController().getError());
		System.out.println(name+", "+e);
		return e < .15;
	}
	
	protected double returnPIDInput() {
		return enc.get();
	}

	protected void usePIDOutput(double output) {
		if (!Double.isNaN(output)) {
			motor.pidWrite(output);
		}
	}
}
