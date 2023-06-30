package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Bookmark entities.
 */
@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    /**
     * Adds a bookmark.
     *
     * @param bookmark the bookmark to add
     * @return the added bookmark
     */
    public Bookmark addBookmark(Bookmark bookmark){
        return bookmarkRepository.save(bookmark);
    }

    /**
     * Deletes a bookmark by its ID.
     *
     * @param id the ID of the bookmark to delete
     */
    public void deleteBookmark(Long id){
        bookmarkRepository.deleteById(id);
    }
}