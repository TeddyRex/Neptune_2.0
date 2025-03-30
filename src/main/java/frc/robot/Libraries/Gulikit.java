// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Libraries;
import edu.wpi.first.wpilibj.Joystick;

public class Gulikit implements ControllerInterface {
    private Joystick joystick;
    // Controller Button Mappings
    public static final int BUTTON_A = 2;
    public static final int BUTTON_B = 1;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4;
    public static final int BUTTON_LEFT_BUMPER = 5;
    public static final int BUTTON_RIGHT_BUMPER = 6;
    public static final int BUTTON_BACK = 7;
    public static final int BUTTON_START = 8;
    public static final int BUTTON_LEFT_STICK = 9;
    public static final int BUTTON_RIGHT_STICK = 10;
    public static final int BUTTON_DPAD_UP = 12;
    public static final int BUTTON_DPAD_DOWN = 13;
    public static final int BUTTON_DPAD_LEFT = 14;
    public static final int BUTTON_DPAD_RIGHT = 15;


    // Controller Axis Mappings
    public static final int AXIS_LEFT_X = 0;
    public static final int AXIS_LEFT_Y = 1;
    public static final int AXIS_RIGHT_X = 4;
    public static final int AXIS_RIGHT_Y = 5;
    public static final int AXIS_LEFT_TRIGGER = 2;
    public static final int AXIS_RIGHT_TRIGGER = 5;

    public Gulikit(int port) {
        joystick = new Joystick(port);
    }

    public boolean getButton(int button) {
        return joystick.getRawButton(button);
    }

    public double getAxis(int axis) {
        return joystick.getRawAxis(axis);
    }

    public int getPOV(){
        return joystick.getPOV();
    }

    public boolean getButtonA() {
        return getButton(BUTTON_A);
    }

    public boolean getButtonB() {
        return getButton(BUTTON_B);
    }

    public boolean getButtonX() {
        return getButton(BUTTON_X);
    }

    public boolean getButtonY() {
        return getButton(BUTTON_Y);
    }

    public boolean getLeftBumper() {
        return getButton(BUTTON_LEFT_BUMPER);
    }

    public boolean getRightBumper() {
        return getButton(BUTTON_RIGHT_BUMPER);
    }

    public boolean getButtonBack() {
        return getButton(BUTTON_BACK);
    }

    public boolean getButtonStart() {
        return getButton(BUTTON_START);
    }

    public boolean getLeftStickButton() {
        return getButton(BUTTON_LEFT_STICK);
    }

    public boolean getRightStickButton() {
        return getButton(BUTTON_RIGHT_STICK);
    }

    public boolean getButtonDPadUp() {
        return getButton(BUTTON_DPAD_UP);
    }

    public boolean getButtonDPadDown() {
        return getButton(BUTTON_DPAD_DOWN);
    }

    public boolean getButtonDPadLeft() {
        return getButton(BUTTON_DPAD_LEFT);
    }

    public boolean getButtonDPadRight() {
        return getButton(BUTTON_DPAD_RIGHT);
    }

    public double getLeftXAxis() {
        return getAxis(AXIS_LEFT_X);
    }

    public double getLeftYAxis() {
        return getAxis(AXIS_LEFT_Y);
    }

    public double getRightXAxis() {
        return getAxis(AXIS_RIGHT_X);
    }

    public double getRightYAxis() {
        return getAxis(AXIS_RIGHT_Y);
    }

    public double getLeftTriggerAxis() {
        return getAxis(AXIS_LEFT_TRIGGER);
    }

    public double getRightTriggerAxis() {
        return getAxis(AXIS_RIGHT_TRIGGER);
    }
}