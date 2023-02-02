package com.netflix.netflix_project.model.service;

import com.netflix.netflix_project.model.entities.Category;
import com.netflix.netflix_project.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> listCategories(){
        return repository.findAll();
    }


    public void saveCategory(Category category){
       repository.save(category);
   }

   public Category getCategoryById(Long id){
       return repository.findById(id).get();
   }

   public void deleteCategory(Long id){
       repository.deleteById(id);
   }
}