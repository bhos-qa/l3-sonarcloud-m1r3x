package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    public String getCurrentRoleName() {
        return mCurrentLevel.toString();
    }

    public void setCurrentPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }
}