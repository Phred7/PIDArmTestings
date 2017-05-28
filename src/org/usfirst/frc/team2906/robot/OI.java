package org.usfirst.frc.team2906.robot;

import org.usfirst.frc.team2906.robot.commands.LowerArm;
import org.usfirst.frc.team2906.robot.commands.RaiseArm;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick joystick1;
	public Joystick joystick2;
	public JoystickButton j1b1;
	public JoystickButton j1b2;
	public JoystickButton j1b3;
	public JoystickButton j1b4;
	public JoystickButton j1b5;
	public JoystickButton j1b6;
	public JoystickButton j1b7;
	public JoystickButton j1b8;
	public JoystickButton j1b9;
	public JoystickButton j1b10;
	public JoystickButton j2b1;
	public JoystickButton j2b2;
	public JoystickButton j2b3;
	public JoystickButton j2b4;
	public JoystickButton j2b5;
	public JoystickButton j2b6;
	public JoystickButton j2b7;
	public JoystickButton j2b8;
	public JoystickButton j2b9;
	public JoystickButton j2b10;
	public JoystickButton j2b11;
	public JoystickButton j2b12;

	public OI() {

		j1b1.whenPressed(new RaiseArm());
		j1b1.whenReleased(new LowerArm());
	}
}
