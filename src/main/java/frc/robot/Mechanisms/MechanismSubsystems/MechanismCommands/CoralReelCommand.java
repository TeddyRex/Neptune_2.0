// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Mechanisms.MechanismSubsystems.MechanismCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Mechanisms.MechanismSubsystems.CoralSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class CoralReelCommand extends Command {
  CoralSubsystem m_coralSubsystem;
  /** Creates a new CoralReel. */
  public CoralReelCommand(CoralSubsystem coralsubsystem) {
    m_coralSubsystem = coralsubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(coralsubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // reel() method to take Coral
    m_coralSubsystem.reel();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_coralSubsystem.breakMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
