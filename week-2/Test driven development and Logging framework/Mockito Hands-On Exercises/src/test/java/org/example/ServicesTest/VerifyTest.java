package org.example.ServicesTest;
import static org.mockito.Mockito.*;

import org.example.Services.ExternalAPI;
import org.example.Services.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VerifyTest {
    @Test
    public void testVerifyInteraction() {
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}
