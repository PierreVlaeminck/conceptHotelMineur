package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * @param bookmark The bookmark to add.
     * @return The added bookmark.
     */
    public Bookmark addBookmark(Bookmark bookmark) {
        return bookmarkRepository.save(bookmark);
    }

    /**
     * Deletes a bookmark by its ID.
     *
     * @param id The ID of the bookmark to delete.
     */
    public void deleteBookmark(Long id) {
        bookmarkRepository.deleteById(id);
    }

    /**
     * Retrieves a list of all bookmarks associated with the specified user profile.
     *
     * @param userProfile The user profile entity.
     * @return A list of bookmarks associated with the user profile.
     */
    public List<Bookmark> findAllBookmarksByUserProfil(UserProfile userProfile) {
        return bookmarkRepository.getBookmarkByUserProfile(userProfile);
    }
}