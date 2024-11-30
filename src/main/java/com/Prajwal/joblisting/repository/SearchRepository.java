package com.Prajwal.joblisting.repository;

import com.Prajwal.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
