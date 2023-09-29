package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    // Constructor with an initial value of USER
    public PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    // Method to get the name of the current role
    public String getCurrentRoleName() {
        switch (mCurrentLevel) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                throw new IllegalArgumentException("Invalid mCurrentLevel: " + mCurrentLevel);
        }
    }

    // Method to set the current permission level
    public void setCurrentPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }
}