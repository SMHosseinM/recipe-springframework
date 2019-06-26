package hossein.springframework.services;

import hossein.springframework.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
