package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 Repository interface for managing Bookmark entities.
 */
@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    /**

     Retrieves a list of bookmarks associated with the specified user profile.
     @param userProfile The user profile entity.
     @return A list of bookmarks associated with the user profile.
     */
    List<Bookmark> getBookmarkByUserProfile(UserProfile userProfile);
}