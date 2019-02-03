package com.exchange.controller;

import com.exchange.dao.File;
import com.exchange.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest controller for user.
 * Created by Hrytsau Uladzislau on 12.12.18.
 */
@CrossOrigin
@RestController
public class FileRestController {

    @Autowired
    private FileService fileService;

    /**
     * Gets all files.
     *
     * @return the all files
     */
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/files")
    @ResponseStatus(value = HttpStatus.OK)
    public List<File> getAllFiles() {
        return fileService.getAllFiles();
    }

    /**
     * Gets file by id.
     *
     * @param id the id
     * @return the file by id
     */
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @GetMapping("/file/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public File getFileById(@PathVariable(value = "id") Long id) {
        return fileService.getFileById(id);
    }

    /**
     * Gets all files by user id.
     *
     * @param userId the user id
     * @return the all files by user id
     */
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @GetMapping("/files/{userId}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<File> getAllFilesByUserId(@PathVariable(value = "userId") Long userId) {
        return fileService.getAllFilesByUserId(userId);
    }

    /**
     * Add file long.
     *
     * @param file the file
     * @return the long
     */
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN') or hasRole('IS_AUTHENTICATED_ANONYMOUSLY')")
    @PostMapping("/file")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Long addFile(@RequestBody File file) {
        return fileService.addFile(file);
    }

    /**
     * Update file.
     *
     * @param file the file
     */
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @PutMapping("/file")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateFile(@RequestBody File file) {
        fileService.updateFile(file);
    }

    /**
     * Delete file.
     *
     * @param id the id
     */
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @DeleteMapping("/file/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteFile(@PathVariable(value = "id") Long id) {
        fileService.deleteFile(id);
    }

}
