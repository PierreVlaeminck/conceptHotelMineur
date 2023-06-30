package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.service.BookmarkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller class for managing bookmarks.
 */
@Controller
public class BookmarkController {

    private final BookmarkService bookmarkService;

    /**
     * Constructs a new BookmarkController with the given BookmarkService.
     *
     * @param bookmarkService the BookmarkService to be used
     */
    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    /**
     * Adds a bookmark.
     *
     * @param bookmark the bookmark to be added
     * @return the added bookmark
     */
    @PostMapping("/favoris")
    public Bookmark addBookmark(@RequestBody Bookmark bookmark) {
        return bookmarkService.addBookmark(bookmark);
    }

    /**
     * Deletes a bookmark with the specified ID.
     *
     * @param id the ID of the bookmark to be deleted
     */
    @DeleteMapping("/favoris/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
    }
}