// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Libraries;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.TalonFXSConfiguration;
import com.ctre.phoenix6.signals.InvertedValue;

import frc.robot.Constants;

/** Add your docs here. */
public class HardwareConfigs {
    public HardwareConfigs() {

    }

    public TalonFXConfiguration getElevatorConfig(boolean invertMotor) {
        TalonFXConfiguration elevatorTalonConfig = new TalonFXConfiguration();
        elevatorTalonConfig.MotorOutput.Inverted = invertMotor ? InvertedValue.Clockwise_Positive : InvertedValue.CounterClockwise_Positive;
        // elevatorTalonConfig.MotorOutput.NeutralMode = Constants.Elevator.NEUTRALMODE;
        elevatorTalonConfig.Feedback.SensorToMechanismRatio = Constants.Elevator.GEARRATIO;
        elevatorTalonConfig.CurrentLimits.SupplyCurrentLimitEnable = Constants.Elevator.ENABLECURRENTLIMIT;
        elevatorTalonConfig.CurrentLimits.SupplyCurrentLimit = Constants.Elevator.CURRENTLIMIT;
        elevatorTalonConfig.Slot0.kP = Constants.Elevator.KP;
        elevatorTalonConfig.Slot0.kI = Constants.Elevator.KI;
        elevatorTalonConfig.Slot0.kD = Constants.Elevator.KD;
        elevatorTalonConfig.OpenLoopRamps.DutyCycleOpenLoopRampPeriod = Constants.Elevator.OPENLOOPRAMP;
        elevatorTalonConfig.OpenLoopRamps.VoltageOpenLoopRampPeriod = Constants.Elevator.OPENLOOPRAMP;
        elevatorTalonConfig.ClosedLoopRamps.DutyCycleClosedLoopRampPeriod = Constants.Elevator.CLOSEDLOOPRAMP;
        elevatorTalonConfig.ClosedLoopRamps.VoltageClosedLoopRampPeriod = Constants.Elevator.CLOSEDLOOPRAMP;
        return elevatorTalonConfig;
    }

    public TalonFXSConfiguration getCoralConfig() {
        TalonFXSConfiguration m_coralConfig = new TalonFXSConfiguration();
        return m_coralConfig;
    }
}
