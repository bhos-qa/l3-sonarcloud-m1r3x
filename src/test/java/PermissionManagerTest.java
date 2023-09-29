import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {
    private PermissionManager permissionManager;

    @BeforeEach
    public void setUp() {
        // Initialize a new PermissionManager instance before each test
        permissionManager = new PermissionManager();
    }

    @Test
    public void testGetCurrentRoleName() {
        // Test the getCurrentRoleName method
        assertEquals("User", permissionManager.getCurrentRoleName());

        // Change the permission level to ADMIN
        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getCurrentRoleName());

        // Change the permission level to DEVELOPER
        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getCurrentRoleName());
    }

    @Test
    public void testSetCurrentPermissionLevel() {
        // Test the setCurrentPermissionLevel method
        assertEquals("User", permissionManager.getCurrentRoleName());

        // Change the permission level to DEVELOPER
        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getCurrentRoleName());

        // Change the permission level to ADMIN
        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getCurrentRoleName());
    }

    public void testUnknownPermissionLevel() {
        PermissionLevel unknownPermissionLevel = mock(PermissionLevel.class);
        when(unknownPermissionLevel.toString()).thenReturn("UNKNOWN");
        permissionManager.setCurrentPermissionLevel(unknownPermissionLevel);
        assertEquals("Unknown", permissionManager.getCurrentRoleName());
    }
}
