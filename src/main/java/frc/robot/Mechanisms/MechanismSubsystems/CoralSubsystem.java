// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.Mechanisms.MechanismSubsystems;

import com.ctre.phoenix6.configs.TalonFXSConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.MusicTone;
import com.ctre.phoenix6.hardware.TalonFXS;
import com.ctre.phoenix6.signals.InvertedValue;

import dev.doglog.DogLog;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class CoralSubsystem extends SubsystemBase {
  private final TalonFXS m_coralTopMotor = new TalonFXS(0, Constants.GALIGMA_BUS);
  private final TalonFXS m_coralButtMotor = new TalonFXS(0, Constants.GALIGMA_BUS);
  // Jeremiah is a butt motor  | TalonFXS config and follower object
  private final TalonFXSConfiguration m_fxsconfig = new TalonFXSConfiguration();
  private final Follower followTopMotor = new Follower(0, true);
  
  public CoralSubsystem() {
    // Grabs the motors stinky stupid configs and applies them
    var m_topConfigs = m_coralTopMotor.getConfigurator();

    m_topConfigs.apply(m_fxsconfig.MotorOutput.withInverted(InvertedValue.CounterClockwise_Positive)); // inverts master motor, this would inherently change the bottom motor if changes
    m_coralButtMotor.setControl(followTopMotor);
    }

  @Override
  public void periodic() {
    
    //* HAVEN'T TESTED !!! MAY NOT WORK !!! */

    // In Laymen's terms: "is ts connected to the bot fr gang ong ong?"
    if (!m_coralTopMotor.isConnected(3) && !m_coralButtMotor.isConnected(3)) {
      MusicTone m_tone = new MusicTone(1000.0); // I am NOT doing all that shit with frequency, not yet. hold your horses fellas.
        m_coralTopMotor.setControl(m_tone);
        m_coralButtMotor.setControl(m_tone);
      Timer.delay(3);
      System.out.println("The Duo Coral is NOT connected");
    } else if (!m_coralButtMotor.isAlive() || !m_coralTopMotor.isAlive()) {
      MusicTone m_tone = new MusicTone(500.0);
        m_coralTopMotor.setControl(m_tone);
        m_coralButtMotor.setControl(m_tone);
      Timer.delay(3);
      System.out.println("The Duo Coral is NOT operating normally");
    } else {
      return;
    }
  }

  public void breakMotor() {
    m_coralTopMotor.stopMotor();
    m_coralButtMotor.stopMotor();
  }

  public void reel() {
    m_coralTopMotor.set(0);
  }

  public void spit() {
    m_coralTopMotor.set(-0);
  }
}
