package org.example.services;

import org.example.dao.ingredients.*;
import org.example.entity.menu.ingredients.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@DataJpaTest
class IngredientServiceTest {
    
    @Mock
    BreadRepository breadRepository;
    @Mock
    MeatRepository meatRepository;
    @Mock
    VegetableRepository vegetableRepository;
    @Mock
    SauceRepository sauceRepository;
    @Mock
    SeasoningRepository seasoningRepository;

    @InjectMocks
    IngredientService ingredientService;
    
    Bread bread1;
    Bread bread2;
    Meat meat1;
    Meat meat2;
    Vegetable vegetable1;
    Vegetable vegetable2;
    Sauce sauce1;
    Sauce sauce2;
    Seasoning seasoning1;
    Seasoning seasoning2;
    
    @BeforeEach
    public void setup(){
        bread1 = new Bread(1L,"White",1);
        bread2 = new Bread(2L,"Multigrain",2);
        meat1 = new Meat(1L,"Beef", 1);
        meat2 = new Meat(2L,"Chicken", 2);
        vegetable1 = new Vegetable(1L,"Carrot",1);
        vegetable2 = new Vegetable(2L,"Lettuce",2);
        sauce1 = new Sauce(1L, "Ketchup", 1);
        sauce2 = new Sauce(2L, "Mayonnaise", 2);
        seasoning1 = new Seasoning(1L,"Salt",1);
        seasoning2 = new Seasoning(2L,"Salt",2);
    }

    @Test
    void add_bread() {
        assertThat(ingredientService.add_bread(bread1)).isNotNull();
    }

    @Test
    void get_bread_by_id() {
        ingredientService.add_bread(bread1);
        given(breadRepository.getById(1L)).willReturn(bread1);
        assertThat(breadRepository.getById(1L)).isEqualTo(bread1);
    }

    @Test
    void update_bread() {
        ingredientService.add_bread(bread1);
        given(breadRepository.getById(1L)).willReturn(bread1);
        assertThat(breadRepository.getById(1L)).isEqualTo(bread1);
        ingredientService.update_bread(bread2);
        given(breadRepository.getById(1L)).willReturn(bread2);
        assertThat(breadRepository.getById(1L)).isEqualTo(bread2);
    }

    @Test
    void delete_bread() {
        ingredientService.add_bread(bread1);
        given(breadRepository.getById(1L)).willReturn(bread1);
        assertThat(breadRepository.getById(1L)).isEqualTo(bread1);
        ingredientService.delete_bread(1);
        Bread bread = ingredientService.get_bread_by_id(bread1.getId());
        assertThat(bread).isNull();
    }

    @Test
    void add_meat() {
        assertThat(ingredientService.add_meat(meat1)).isNotNull();
    }

    @Test
    void get_meat_by_id() {
        ingredientService.add_meat(meat1);
        given(meatRepository.getById(1L)).willReturn(meat1);
        assertThat(meatRepository.getById(1L)).isEqualTo(meat1);
    }

    @Test
    void update_meat() {
        ingredientService.add_meat(meat1);
        given(meatRepository.getById(1L)).willReturn(meat1);
        assertThat(meatRepository.getById(1L)).isEqualTo(meat1);
        ingredientService.update_meat(meat2);
        given(meatRepository.getById(1L)).willReturn(meat2);
        assertThat(meatRepository.getById(1L)).isEqualTo(meat2);
    }

    @Test
    void delete_meat() {
        ingredientService.add_meat(meat1);
        given(meatRepository.getById(1L)).willReturn(meat1);
        assertThat(meatRepository.getById(1L)).isEqualTo(meat1);
        ingredientService.delete_meat(1);
        Meat meat = ingredientService.get_meat_by_id(meat1.getId());
        assertThat(meat).isNull();
    }

    @Test
    void add_sauce() {
        assertThat(ingredientService.add_sauce(sauce1)).isNotNull();
    }

    @Test
    void get_sauce_by_id() {
        ingredientService.add_sauce(sauce1);
        given(sauceRepository.getById(1L)).willReturn(sauce1);
        assertThat(sauceRepository.getById(1L)).isEqualTo(sauce1);
    }

    @Test
    void update_sauce() {
        ingredientService.add_sauce(sauce1);
        given(sauceRepository.getById(1L)).willReturn(sauce1);
        assertThat(sauceRepository.getById(1L)).isEqualTo(sauce1);
        ingredientService.update_sauce(sauce2);
        given(sauceRepository.getById(1L)).willReturn(sauce2);
        assertThat(sauceRepository.getById(1L)).isEqualTo(sauce2);
    }

    @Test
    void delete_sauce() {
        ingredientService.add_sauce(sauce1);
        given(sauceRepository.getById(1L)).willReturn(sauce1);
        assertThat(sauceRepository.getById(1L)).isEqualTo(sauce1);
        ingredientService.delete_sauce(1);
        Sauce sauce = ingredientService.get_sauce_by_id(sauce1.getId());
        assertThat(sauce).isNull();
    }

    @Test
    void add_seasoning() {
        assertThat(ingredientService.add_seasoning(seasoning1)).isNotNull();
    }

    @Test
    void get_seasoning_by_id() {
        ingredientService.add_seasoning(seasoning1);
        given(seasoningRepository.getById(1L)).willReturn(seasoning1);
        assertThat(seasoningRepository.getById(1L)).isEqualTo(seasoning1);
    }

    @Test
    void update_seasoning() {
        ingredientService.add_seasoning(seasoning1);
        given(seasoningRepository.getById(1L)).willReturn(seasoning1);
        assertThat(seasoningRepository.getById(1L)).isEqualTo(seasoning1);
        ingredientService.update_seasoning(seasoning2);
        given(seasoningRepository.getById(1L)).willReturn(seasoning2);
        assertThat(seasoningRepository.getById(1L)).isEqualTo(seasoning2);
    }

    @Test
    void delete_seasoning() {
        ingredientService.add_seasoning(seasoning1);
        given(seasoningRepository.getById(1L)).willReturn(seasoning1);
        assertThat(seasoningRepository.getById(1L)).isEqualTo(seasoning1);
        ingredientService.delete_seasoning(1);
        Seasoning seasoning = ingredientService.get_seasoning_by_id(seasoning1.getId());
        assertThat(seasoning).isNull();
    }

    @Test
    void add_vegetable() {
        assertThat(ingredientService.add_vegetable(vegetable1)).isNotNull();
    }

    @Test
    void get_vegetable_by_id() {
        ingredientService.add_vegetable(vegetable1);
        given(vegetableRepository.getById(1L)).willReturn(vegetable1);
        assertThat(vegetableRepository.getById(1L)).isEqualTo(vegetable1);
    }

    @Test
    void update_vegetable() {
        ingredientService.add_vegetable(vegetable1);
        given(vegetableRepository.getById(1L)).willReturn(vegetable1);
        assertThat(vegetableRepository.getById(1L)).isEqualTo(vegetable1);
        ingredientService.update_vegetable(vegetable2);
        given(vegetableRepository.getById(1L)).willReturn(vegetable2);
        assertThat(vegetableRepository.getById(1L)).isEqualTo(vegetable2);
    }

    @Test
    void delete_vegetable() {
        ingredientService.add_vegetable(vegetable1);
        given(vegetableRepository.getById(1L)).willReturn(vegetable1);
        assertThat(vegetableRepository.getById(1L)).isEqualTo(vegetable1);
        ingredientService.delete_vegetable(1);
        Vegetable vegetable = ingredientService.get_vegetable_by_id(vegetable1.getId());
        assertThat(vegetable).isNull();
    }
}