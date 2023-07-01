package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.UserProfileRepository;
import com.simplon.concepthotelmineur.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing UserProfile entities.
 */
@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    /**
     * Retrieves a UserProfile by its ID.
     *
     * @param id the ID of the UserProfile
     * @return the UserProfile associated with the specified ID
     * @throws RuntimeException if no UserProfile is found for the given ID
     */
    public UserProfile findUserProfileByIdUp(Long id) {
        return userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Profile not found for this id: " + id));
    }

    /**
     * Adds a new UserProfile.
     *
     * @param userProfile the UserProfile to be added
     */
    public void addUserProfile(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }

    /**
     * Updates an existing UserProfile.
     *
     * @param userProfile the UserProfile to be updated
     * @return the updated UserProfile
     */
    public UserProfile updateUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    /**
     * Deletes a UserProfile by its ID.
     *
     * @param id the ID of the UserProfile to be deleted
     */
    public void deleteUserProfile(Long id) {
        userProfileRepository.deleteById(id);
    }

    public UserProfile findByUsername(String username) {
        return userProfileRepository.findByUsername(username);
    }
}