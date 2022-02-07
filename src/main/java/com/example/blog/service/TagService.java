package com.example.blog.service;
import com.example.blog.entity.Tag;
import com.example.blog.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id,Tag tag);

    List<Tag> listTag();
    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    void deleteTag(Long id);
}
