// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {

  //FIELDS
  private static Arm instanceArm; 
  //add field for the XRPServo motor
  private XRPServo arm;

  /** Creates a new Arm. */
  public Arm() {
    //Construct the XRPServo
    arm = new XRPServo(1);
  }

  //Arm singleton
  public static Arm getInstance(){
    if(instanceArm == null){
      instanceArm = new Arm();
    }
    return instanceArm;
  }

  //Reset arm
  public void resetArm(){
    arm.setAngle(0);
  }

  //Method to move the arm
  public void moveArm(double angle){
    arm.setAngle(angle);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
