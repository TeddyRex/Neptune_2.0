// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Mechanisms.MechanismSubsystems.CoralSubsystem;
import frc.robot.Mechanisms.MechanismSubsystems.ElevatorSubsystem;
import frc.robot.Mechanisms.MechanismSubsystems.MechanismCommands.coral.CoralReelCommand;
import frc.robot.Mechanisms.MechanismSubsystems.MechanismCommands.coral.CoralSpitCommand;

public class RobotContainer {

  

  //* Coral */
  CoralSubsystem m_CoralSubsystem = new CoralSubsystem();
  CoralReelCommand m_reel = new CoralReelCommand(m_CoralSubsystem);
  CoralSpitCommand m_spit = new CoralSpitCommand(m_CoralSubsystem);
  //* Elevator */
  ElevatorSubsystem m_ElevatorSubsystem =  new ElevatorSubsystem();
  //* Swerve */
  //* LEDs */

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    
  }

  public Command getReelCommand() {
    return m_reel;
  }

  public Command getSpitCommand() {
    return m_spit;
  }
  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
