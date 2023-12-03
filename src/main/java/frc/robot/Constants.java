package frc.robot;

import edu.wpi.first.math.util.Units;

public class Constants {
    public static class ControllerConstants {
        public static final int kDriverPort = 0;
    }

    public static class SwerveConstants {
        public static final double kDeadband = .35;
        public static final double kMaxSpeed = Units.feetToMeters(15.1);
        public static final double kMaxRotationalSpeed = 4; // DOES THIS NEED TO BE DIFFERENT THAN MAX SPEED?
    }
}
