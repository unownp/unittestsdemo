import static org.junit.jupiter.api.Assertions.assertNotNull;

import helpers.FinalClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoMockFinalTest {
    @Test
    public void testMockFinal(@Mock FinalClass finalMocked) {
        assertNotNull(finalMocked);
    }
    @Test
    public void testMockFinalViaMockStatic() {
        MockedStatic<FinalClass> mockStatic = Mockito.mockStatic(FinalClass.class);
        assertNotNull(mockStatic);
    }
}