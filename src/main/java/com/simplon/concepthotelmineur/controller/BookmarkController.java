package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.service.BookmarkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BookmarkController {

    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @PostMapping("/favoris")
    public Bookmark addBookmark(@RequestBody Bookmark bookmark) {
        return bookmarkService.addBookmark(bookmark);
    }

    @DeleteMapping("/favoris/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
    }
}
