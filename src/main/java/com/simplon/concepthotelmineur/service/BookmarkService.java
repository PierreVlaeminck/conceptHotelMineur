package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Bookmark;
import com.simplon.concepthotelmineur.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public Bookmark addBookmark(Bookmark bookmark){
        return bookmarkRepository.save(bookmark);
    }

    public void deleteBookmark(Long id){
        bookmarkRepository.deleteById(id);
    }
}