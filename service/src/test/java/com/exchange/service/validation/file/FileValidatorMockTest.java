package com.exchange.service.validation.file;

import com.exchange.exception.ValidationException;
import com.exchange.service.validation.CommonValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FileValidatorMockTest {

    private static final Integer TIMES_ONE = 1;

    @Mock
    private CommonValidator commonValidatorMock;
    @InjectMocks
    private FileValidator fileValidator;

    @Test
    public void validateFileId_correctFileId_correct() {
        when(commonValidatorMock.isValidIdentifier(anyLong())).thenReturn(Boolean.TRUE);
        fileValidator.validateFileId(anyLong());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidIdentifier(anyLong());
        verifyNoMoreInteractions(commonValidatorMock);
    }

    @Test(expected = ValidationException.class)
    public void validateFileId_incorrectFileId_validationException() {
        when(commonValidatorMock.isValidIdentifier(anyLong())).thenReturn(Boolean.FALSE);
        fileValidator.validateFileId(anyLong());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidIdentifier(anyLong());
        verifyNoMoreInteractions(commonValidatorMock);
    }

    @Test
    public void validateDescription_correctDescription_correct() {
        when(commonValidatorMock.isValidString(anyString())).thenReturn(Boolean.TRUE);
        fileValidator.validateDescription(anyString());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidString(anyString());
        verifyNoMoreInteractions(commonValidatorMock);
    }

    @Test(expected = ValidationException.class)
    public void validateDescription_incorrectDescription_validationException() {
        when(commonValidatorMock.isValidString(anyString())).thenReturn(Boolean.FALSE);
        fileValidator.validateDescription(anyString());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidString(anyString());
        verifyNoMoreInteractions(commonValidatorMock);
    }

    @Test
    public void validateName_correctName_correct() {
        when(commonValidatorMock.isValidString(anyString())).thenReturn(Boolean.TRUE);
        fileValidator.validateName(anyString());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidString(anyString());
        verifyNoMoreInteractions(commonValidatorMock);
    }

    @Test(expected = ValidationException.class)
    public void validateName_incorrectName_validationException() {
        when(commonValidatorMock.isValidString(anyString())).thenReturn(Boolean.FALSE);
        fileValidator.validateName(anyString());
        verify(commonValidatorMock, times(TIMES_ONE)).isValidString(anyString());
        verifyNoMoreInteractions(commonValidatorMock);
    }

}
