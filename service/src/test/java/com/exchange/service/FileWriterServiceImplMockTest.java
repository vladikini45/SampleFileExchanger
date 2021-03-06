package com.exchange.service;

import com.exchange.dao.FileWriter;
import com.exchange.dao.exception.FileNotDeletedException;
import com.exchange.service.implementation.FileWriterServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mock.web.MockMultipartFile;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * The type File writer service impl mock test.
 */
@RunWith(MockitoJUnitRunner.class)
public class FileWriterServiceImplMockTest {

    private static final Integer TIMES_ONE = 1;
    private static final String CORRECT_ENCODE_NAME = "correctEncodeName";
    private static final String INCORRECT_ENCODE_NAME = "";
    private static final String CORRECT_FILE_PATH = "path";
    private static final List<String> CORRECT_FILE_NAMES = Arrays.asList(
            "file1",
            "file2",
            "file3");

    @Mock
    private FileWriter fileWriterMock;
    @Mock
    private ServletContext servletContextMock;
    @InjectMocks
    private FileWriterServiceImpl fileWriterService;

    /**
     * Save file with correct multipart file and encode name.
     *
     * @throws IOException the io exception
     */
    @Test
    public void saveFileWithCorrectMultipartFileAndEncodeName() throws IOException {
        MockMultipartFile mockMultipartFile = new MockMultipartFile(
                "file", "originalName", null, "file".getBytes());
        doNothing().when(fileWriterMock).saveFile(any(), any());
        fileWriterService.saveFile(mockMultipartFile, CORRECT_ENCODE_NAME);
        verify(fileWriterMock, times(TIMES_ONE)).saveFile(any(), any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Gets file by name with correct file name then correct file.
     */
    @Test
    public void getFileByNameWithCorrectFileNameThenCorrectFile() {
        when(fileWriterMock.getFileByName(any())).thenReturn(any());
        fileWriterService.getFileByName(CORRECT_ENCODE_NAME);
        verify(fileWriterMock, times(TIMES_ONE)).getFileByName(any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Delete file by name with correct file name.
     */
    @Test
    public void deleteFileByNameWithCorrectFileName() {
        when(fileWriterMock.deleteFileByPath(any())).thenReturn(Boolean.TRUE);
        fileWriterService.deleteFileByName(CORRECT_ENCODE_NAME);
        verify(fileWriterMock, times(TIMES_ONE)).deleteFileByPath(any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Delete file by name with incorrect file name then throw file not deleted exception.
     */
    @Test(expected = FileNotDeletedException.class)
    public void deleteFileByNameWithIncorrectFileNameThenThrowFileNotDeletedException() {
        when(fileWriterMock.deleteFileByPath(any())).thenReturn(Boolean.FALSE);
        fileWriterService.deleteFileByName(INCORRECT_ENCODE_NAME);
        verify(fileWriterMock, times(TIMES_ONE)).deleteFileByPath(any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Delete files by name with correct file names.
     */
    @Test
    public void deleteFilesByNameWithCorrectFileNames() {
        when(fileWriterMock.deleteFileByPath(any())).thenReturn(Boolean.TRUE);
        fileWriterService.deleteFilesByNames(CORRECT_FILE_NAMES);
        verify(fileWriterMock, times(CORRECT_FILE_NAMES.size())).deleteFileByPath(any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Delete files by name with incorrect file names then throw file not deleted exception.
     */
    @Test(expected = FileNotDeletedException.class)
    public void deleteFilesByNameWithIncorrectFileNamesThenThrowFileNotDeletedException() {
        when(fileWriterMock.deleteFileByPath(any())).thenReturn(Boolean.FALSE);
        fileWriterService.deleteFilesByNames(CORRECT_FILE_NAMES);
        verify(fileWriterMock, times(CORRECT_FILE_NAMES.size())).deleteFileByPath(any());
        verifyNoMoreInteractions(fileWriterMock);
    }

    /**
     * Gets file path with correct encode name then correct file path.
     */
    @Test
    public void getFilePathWithCorrectEncodeNameThenCorrectFilePath() {
        when(servletContextMock.getRealPath(any())).thenReturn(CORRECT_FILE_PATH);
        String actualFilePath = fileWriterService.getFilePath(CORRECT_ENCODE_NAME);
        String expectedFilePath = CORRECT_FILE_PATH;
        Assert.assertEquals(expectedFilePath, actualFilePath);
    }
}
