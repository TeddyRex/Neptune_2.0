// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Mechanisms.MechanismSubsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Libraries.HardwareConfigs;

//import static frc.robot.Constants.Elevator.*;

public class ElevatorSubsystem extends SubsystemBase {
 /* Left and Right Motors */
  private TalonFX m_elevatorMotor = new TalonFX(0, "Galigma");
  private PIDController pidController = new PIDController(0, 0, 0);
  HardwareConfigs m_hardwareConfigs = new HardwareConfigs();

  //private Follower m_follower = new Follower(LEFT_MOTOR_ID, true);
  private double speed = 0.5;
  private double THRESHOLD = 5.0;
  private double LOWER_LIMIT = Constants.Elevator.MIN;
  private double UPPER_LIMIT = Constants.Elevator.MAX;
  private double lastAction = System.currentTimeMillis();

  double eMotorPosition = 0.0;

  public ElevatorSubsystem() {
    // Load your TalonFX drive config (PID, current limit, etc.)
    var m_elevatorMotorConfig = m_elevatorMotor.getConfigurator();
    m_elevatorMotorConfig.apply(m_hardwareConfigs.getElevatorConfig(false));
    m_elevatorMotorConfig.setPosition(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
