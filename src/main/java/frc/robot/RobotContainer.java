// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Libraries.Gulikit;
import frc.robot.Mechanisms.MechanismSubsystems.CoralSubsystem;
import frc.robot.Mechanisms.MechanismSubsystems.ElevatorSubsystem;
import frc.robot.Mechanisms.MechanismSubsystems.MechanismCommands.coral.CoralReelCommand;
import frc.robot.Mechanisms.MechanismSubsystems.MechanismCommands.coral.CoralSpitCommand;

public class RobotContainer {

  // A.I.O = ALL IN ONE
  private final Gulikit m_AIOcontroller = new Gulikit(0);

  private final int translationAxis = m_AIOcontroller.AXIS_LEFT_Y;
  private final int strafeAxis = m_AIOcontroller.AXIS_LEFT_X;
  private final int rotationAxis = m_AIOcontroller.AXIS_RIGHT_X;
  //* Coral */
  CoralSubsystem m_CoralSubsystem = new CoralSubsystem();
  CoralReelCommand m_reel = new CoralReelCommand(m_CoralSubsystem);
  CoralSpitCommand m_spit = new CoralSpitCommand(m_CoralSubsystem);
  //* Elevator */
  ElevatorSubsystem m_ElevatorSubsystem =  new ElevatorSubsystem();
  //* Swerve */
  //* LEDs */

  // modes.
  enum MODE {
    COMP,
    PTIS,
    TEST
  }

  // Set the currentMode before deploying
  MODE currentMode = MODE.COMP;

  public RobotContainer() {

    // checks what mode it's in, sets it based on that.
    if (currentMode == MODE.COMP) {
      configureBindings();
      configureCompBindings();
    } else if (currentMode == MODE.PTIS) {
      configureBindings();
      configurePitBindings();
    } else if (currentMode == MODE.TEST) {
      configureBindings();
      configureTestBindings();
    }

  }

  private void configureBindings() {
    
  }

  private void configureCompBindings() {

  }

  private void configurePitBindings() {

  }

  private void configureTestBindings() {

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
