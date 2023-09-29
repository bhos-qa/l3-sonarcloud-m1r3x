import org.example.PermissionLevel;
import org.example.PermissionManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PermissionManagerTest {
    private PermissionManager permissionManager;

    @BeforeEach
    public void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    public void testGetCurrentRoleName() {
        assertEquals("User", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getCurrentRoleName());
    }

    @Test
    public void testSetCurrentPermissionLevel() {
        assertEquals("User", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getCurrentRoleName());
    }

}
