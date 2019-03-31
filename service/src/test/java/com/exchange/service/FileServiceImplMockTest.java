package com.exchange.service;

//@RunWith(MockitoJUnitRunner.class)
public class FileServiceImplMockTest {

//    private static final int ZERO = 0;
//    private static final int ONE = 1;
//
//    private static final Long CORRECT_ID = 1L;
//    private static final Long NULL_ID = null;
//    private static final Long INCORRECT_ID = -1L;
//    private static final Long CORRECT_CATEGORY_ID = 3L;
//    private static final Long NULL_CATEGORY_ID = null;
//    private static final Long INCORRECT_CATEGORY_ID = -3L;
//    private static final String CORRECT_URL = "url";
//    private static final String NULL_URL = null;
//    private static final String EMPTY_URL = "";
//    private static final String CORRECT_DESCRIPTION = "description";
//    private static final String EMPTY_DESCRIPTION = "";
//    private static final String NULL_DESCRIPTION = null;
//    private static final LocalDate CORRECT_DATE = LocalDate.of(9399, 12, 2);
//    private static final LocalDate NULL_DATE = null;
//
//    @Mock
//    private UserDao userDaoMock;
//    @Mock
//    private FileDao fileDaoMock;
//    @Mock
//    private CategoryDao categoryDaoMock;
//    @InjectMocks
//    private FileServiceImpl fileServiceImpl;
//    private final File file = new File(
//            CORRECT_ID,
//            CORRECT_ID,
//            CORRECT_URL,
//            CORRECT_DESCRIPTION,
//            CORRECT_DATE,
//            CORRECT_CATEGORY_ID
//    );

    /**
     * Gets all file success 1 mock test.
     */
//    @Test
//    public void getAllFileSuccess_1_MockTest() {
//        fileServiceImpl.getAllFiles();
//        verify(fileDaoMock, times(ONE)).getAllFiles();
//    }
//
//    /**
//     * Gets all files by user id success 1 mock test.
//     */
//    @Test
//    public void getAllFilesByUserIdSuccess_1_MockTest() {
//        when(fileDaoMock.checkFileByUserId(CORRECT_ID)).thenReturn(true);
//        fileServiceImpl.getAllFilesByUserId(CORRECT_ID);
//        verify(fileDaoMock, times(ONE)).getAllFilesByUserId(anyLong());
//    }
//
//    /**
//     * Gets all files by user id un success 1 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getAllFilesByUserIdUnSuccess_1_MockTest() {
//        fileServiceImpl.getAllFilesByUserId(NULL_ID);
//        verify(fileDaoMock, never()).checkFileByUserId(anyLong());
//        verify(fileDaoMock, never()).getAllFilesByUserId(anyLong());
//    }
//
//    /**
//     * Gets all files by user id un success 2 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getAllFilesByUserIdUnSuccess_2_MockTest() {
//        fileServiceImpl.getAllFilesByUserId(INCORRECT_ID);
//        verify(fileDaoMock, never()).checkFileByUserId(anyLong());
//        verify(fileDaoMock, never()).getAllFilesByUserId(anyLong());
//    }
//
//    /**
//     * Gets all files by user id un success 3 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getAllFilesByUserIdUnSuccess_3_MockTest() {
//        when(fileDaoMock.checkFileByUserId(anyLong())).thenReturn(false);
//        fileServiceImpl.getAllFilesByUserId(CORRECT_ID);
//        verify(fileDaoMock, never()).getAllFilesByUserId(anyLong());
//    }
//
//    /**
//     * Gets file by id success 1 mock test.
//     */
//    @Test
//    public void getFileByIdSuccess_1_MockTest() {
//        when(fileDaoMock.checkFileById(anyLong())).thenReturn(true);
//        fileServiceImpl.getFileById(CORRECT_ID);
//        verify(fileDaoMock, times(ONE)).getFileById(anyLong());
//    }
//
//    /**
//     * Gets file by id un success 1 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getFileByIdUnSuccess_1_MockTest() {
//        fileServiceImpl.getFileById(NULL_ID);
//        verify(fileDaoMock, never()).checkFileById(anyLong());
//        verify(fileDaoMock, never()).getFileById(anyLong());
//    }
//
//    /**
//     * Gets file by id un success 2 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getFileByIdUnSuccess_2_MockTest() {
//        fileServiceImpl.getFileById(INCORRECT_ID);
//        verify(fileDaoMock, never()).checkFileById(anyLong());
//        verify(fileDaoMock, never()).getFileById(anyLong());
//    }
//
//    /**
//     * Gets file by id un success 3 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void getFileByIdUnSuccess_3_MockTest() {
//        when(fileDaoMock.checkFileById(anyLong())).thenReturn(false);
//        fileServiceImpl.getFileById(CORRECT_ID);
//        verify(fileDaoMock, never()).getFileById(anyLong());
//    }
//
//    /**
//     * Add file success 1 mock test.
//     */
////    @Test
////    public void addFileSuccess_1_MockTest() {
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(false);
////        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(true);
////        fileServiceImpl.addFile(file);
////        verify(fileDaoMock, times(ONE)).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 1 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_1_MockTest() {
////        file.setId(INCORRECT_ID);
////        file.setUserId(INCORRECT_ID);
////        fileServiceImpl.addFile(file);
////        verify(userDaoMock, never()).checkUserByUserId(anyLong());
////        verify(fileDaoMock, never()).checkFileByUrl(anyString());
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 2 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_2_MockTest() {
////        file.setId(NULL_ID);
////        file.setUserId(NULL_ID);
////        fileServiceImpl.addFile(file);
////        verify(userDaoMock, never()).checkUserByUserId(anyLong());
////        verify(fileDaoMock, never()).checkFileByUrl(anyString());
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 3 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_3_MockTest() {
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(false);
////        fileServiceImpl.addFile(file);
////        verify(fileDaoMock, never()).checkFileByUrl(anyString());
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 4 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_4_MockTest() {
////        file.setUrl(NULL_URL);
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(true);
////        fileServiceImpl.addFile(file);
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 5 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_5_MockTest() {
////        file.setUrl(EMPTY_URL);
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(true);
////        fileServiceImpl.addFile(file);
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 6 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_6_MockTest() {
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(true);
////        fileServiceImpl.addFile(file);
////        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 7 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_7_MockTest() {
////        file.setDate(NULL_DATE);
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(true);
////        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(false);
////        fileServiceImpl.addFile(file);
////        assertThat(file.getDate(), is(notNull()));
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Add file un success 8 mock test.
//     */
////    @Test(expected = ValidationException.class)
////    public void addFileUnSuccess_8_MockTest() {
////        file.setDate(NULL_DATE);
////        when(userDaoMock.checkUserByUserId(anyLong())).thenReturn(true);
////        when(fileDaoMock.checkFileByUrl(anyString())).thenReturn(false);
////        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(false);
////        fileServiceImpl.addFile(file);
////        assertThat(file.getDate(), is(notNull()));
////        verify(fileDaoMock, never()).addFile(any(File.class));
////    }
//
//    /**
//     * Update file un success 1 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void updateFileUnSuccess_1_MockTest() {
//        file.setDescription(NULL_DESCRIPTION);
//        fileServiceImpl.updateFile(file);
//        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
//        verify(fileDaoMock, never()).updateFile(file);
//    }
//
//    /**
//     * Update file un success 2 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void updateFileUnSuccess_2_MockTest() {
//        file.setDescription(EMPTY_DESCRIPTION);
//        fileServiceImpl.updateFile(file);
//        verify(categoryDaoMock, never()).checkCategoryById(anyLong());
//        verify(fileDaoMock, never()).updateFile(file);
//    }
//
//    /**
//     * Update file un success 3 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void updateFileUnSuccess_3_MockTest() {
//        file.setCategoryId(NULL_CATEGORY_ID);
//        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(false);
//        fileServiceImpl.updateFile(file);
//        verify(fileDaoMock, never()).updateFile(file);
//    }
//
//    /**
//     * Update file un success 4 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void updateFileUnSuccess_4_MockTest() {
//        file.setCategoryId(INCORRECT_CATEGORY_ID);
//        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(false);
//        fileServiceImpl.updateFile(file);
//        verify(fileDaoMock, never()).updateFile(file);
//    }
//
//    /**
//     * Update file un success 5 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void updateFileUnSuccess_5_MockTest() {
//        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(false);
//        fileServiceImpl.updateFile(file);
//        verify(fileDaoMock, never()).updateFile(file);
//    }
//
//    /**
//     * Update file un success 6 mock test.
//     */
//    @Test(expected = InternalServerException.class)
//    public void updateFileUnSuccess_6_MockTest() {
//        when(categoryDaoMock.checkCategoryById(anyLong())).thenReturn(true);
//        when(fileDaoMock.updateFile(any(File.class))).thenReturn(ZERO);
//        fileServiceImpl.updateFile(file);
//    }
//
//    /**
//     * Delete file success 1 mock test.
//     */
//    @Test
//    public void deleteFileSuccess_1_MockTest() {
//        when(fileDaoMock.deleteFile(anyLong())).thenReturn(ONE);
//        fileServiceImpl.deleteFile(CORRECT_ID);
//    }
//
//    /**
//     * Delete file un success 1 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void deleteFileUnSuccess_1_MockTest() {
//        fileServiceImpl.deleteFile(NULL_ID);
//        verify(fileDaoMock, never()).deleteFile(anyLong());
//    }
//
//    /**
//     * Delete file un success 2 mock test.
//     */
//    @Test(expected = ValidationException.class)
//    public void deleteFileUnSuccess_2_MockTest() {
//        fileServiceImpl.deleteFile(INCORRECT_ID);
//        verify(fileDaoMock, never()).deleteFile(anyLong());
//    }
//
//    /**
//     * Delete file un success 3 mock test.
//     */
//    @Test(expected = InternalServerException.class)
//    public void deleteFileUnSuccess_3_MockTest() {
//        when(fileDaoMock.deleteFile(anyLong())).thenReturn(ZERO);
//        fileServiceImpl.deleteFile(CORRECT_ID);
//    }

}
