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
        assertEquals("USER", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.getCurrentRoleName());
    }

    @Test
    public void testSetCurrentPermissionLevel() {
        assertEquals("USER", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.getCurrentRoleName());
    }

}
