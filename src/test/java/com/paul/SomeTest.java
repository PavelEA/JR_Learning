package com.paul;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Iterator;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SomeTest {
    @Mock
    Iterator mock;

    @Test
    public void someTest() {
        when(mock.next()).thenReturn(1);

        assertEquals(1, mock.next());
    }

    @Mock
    ArrayList arr;

    @Test
    public void someTestSecond() {
        doReturn(10).when(arr).size();
        assertEquals(10, arr.size());
    }

    @Test
    public void test_WhenWeUseDoThrow() {
        when(arr.size()).thenThrow(IllegalStateException.class);
        assertThrows(IllegalStateException.class, () -> arr.size());
    }

    @Test
    public void test_WhenWeUseDoThrowFirst() {
        doThrow(NumberFormatException.class).when(arr).size();

        assertThrows(NumberFormatException.class, () -> arr.size());
    }

    @Test
    public void testWithParams() {
        when(arr.get(10)).thenReturn("Ivan");
        doReturn("Maria").when(arr).get(100);

        assertEquals("Ivan", arr.get(10));
        assertEquals("Maria", arr.get(100));
    }

    @Test
    public void testWithParamsAny() {
        when(arr.get(10)).thenReturn("Ivan"); // перебил через any
        doReturn("Maria").when(arr).get(any(int.class));

        assertEquals("Maria", arr.get(10));
        assertEquals("Maria", arr.get(100));
    }

    @Test
    public void testWithParamsWithDoAnswer() {
        doAnswer(v -> {
            int params = v.getArgument(0);
            return params * params;
        }).when(arr).get(anyInt());

        assertEquals(100, arr.get(10));
        assertEquals(36, arr.get(6));
    }

    @Test
    public void testWithVerify() {
        int size = arr.size();
        verify(arr).size();
    }

    @Test
    public void testWithSomeVerify() {
        int size = arr.size();
        verify(arr, atLeastOnce()).size();
    }

    @Test
    public void testWithSomeVerifyAnother() {
        int size = arr.size();
        verify(arr, atLeastOnce()).size();
    }
}


