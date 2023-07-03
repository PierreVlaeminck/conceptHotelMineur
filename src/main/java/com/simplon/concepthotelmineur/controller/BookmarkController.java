package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.service.BookmarkService;
import com.simplon.concepthotelmineur.service.HostelService;
import com.simplon.concepthotelmineur.service.UserProfileService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for managing bookmarks.
 */
@Controller
public class BookmarkController {

    private final BookmarkService bookmarkService;
    private final UserProfileService userProfileService;
    private final HostelService hostelService;

    /**
     * Constructs a new BookmarkController with the given BookmarkService, UserProfileService, and HostelService.
     *
     * @param bookmarkService     The BookmarkService to be used.
     * @param userProfileService The UserProfileService to be used.
     * @param hostelService       The HostelService to be used.
     */
    public BookmarkController(BookmarkService bookmarkService, UserProfileService userProfileService, HostelService hostelService) {
        this.bookmarkService = bookmarkService;
        this.userProfileService = userProfileService;
        this.hostelService = hostelService;
    }

    /**
     * Adds a bookmark for the specified hostel.
     *
     * @param hostelId      The ID of the hostel to be bookmarked.
     * @param model         The Model object.
     * @param userDetails  The authenticated user details.
     * @return A string representing the redirect URL to the home page.
     */
    @PostMapping("/favoris")
    public String addBookmark(@RequestParam("hostelId") Long hostelId, Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        UserProfile userProfile = userProfileService.findByUsername(username);
        Hostel hostel = hostelService.findHostelByIdH(hostelId);

        Bookmark bookmark = new Bookmark();
        bookmark.setUserProfile(userProfile);
        bookmark.setHostel(hostel);
        bookmarkService.addBookmark(bookmark);

        return "redirect:/";
    }

    /**
     * Deletes a bookmark with the specified ID.
     *
     * @param id The ID of the bookmark to be deleted.
     */
    @DeleteMapping("/favoris/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
    }
}