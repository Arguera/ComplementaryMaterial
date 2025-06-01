package com.amgems.complementarymaterial.application.service.implementation;

import com.amgems.complementarymaterial.application.dto.commons.CategoryDTO;
import com.amgems.complementarymaterial.domain.entity.Category;
import com.amgems.complementarymaterial.infrastructure.repository.iCategoryRepository;
import com.amgems.complementarymaterial.application.service.iCategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements iCategoryService {
    private final iCategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category newCategory = modelMapper.map(categoryDTO, Category.class);

        return modelMapper.map(categoryRepository.save(newCategory), CategoryDTO.class);
    }
}
