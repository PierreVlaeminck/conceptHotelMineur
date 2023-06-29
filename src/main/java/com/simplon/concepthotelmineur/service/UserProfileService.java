package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.UserProfileRepository;
import com.simplon.concepthotelmineur.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfile findUserProfileByIdUp(Long id){
        return userProfileRepository.findById(id).orElseThrow(() -> new RuntimeException("User Profile not found for this id : " + id));
    }

    public UserProfile addUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile updateUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public void deleteUserProfile(Long id) {
        userProfileRepository.deleteById(id);
    }
}
