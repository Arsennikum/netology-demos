package netology;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import static org.junit.jupiter.api.Assertions.*;

class ExcepDemoTest {

//    @Test
    void complexPrint() {
        ExcepDemo excepDemo = new ExcepDemo();

        assertThrows(RuntimeException.class, excepDemo::complexPrintAndAlwaysException);
    }

    @Test
    void spyTest() {
        // given
        MockitoTest superMock = Mockito.mock(MockitoTest.class);
//        Mockito.when(superMock.returnHello()).thenReturn("superHello");
        Mockito.when(superMock.returnWorld(Mockito.any())).thenReturn("superWorld");

        // when
        Wrapper wrapper = new Wrapper(superMock);
        wrapper.testMethod();

        // then
        Mockito
                .verify(superMock, Mockito.times(3))
                .returnHello();

//        Mockito.verify(superMock, Mockito.times(1)).returnWorld("asdf");

    }


    @Test
    void spyTest1() {
        // given
        MockitoTest superMock = Mockito.spy(MockitoTest.class);
        Mockito.when(superMock.returnHello()).thenReturn("superHello");
        ArgumentCaptor<Boolean> captor = ArgumentCaptor.forClass(Boolean.class);

        // when
        Wrapper wrapper = new Wrapper(superMock);
        wrapper.testMethod();

        Mockito.verify(superMock, Mockito.times(1))
                .returnWorld(captor.capture());

        // then
        Boolean value = captor.getValue();
        assertEquals(true, value);

    }

}
