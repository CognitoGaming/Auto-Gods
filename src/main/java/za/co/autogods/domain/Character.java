package za.co.autogods.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Character {
    private String id;
    private String name;
    private List<CharacterType> characterTypes;
    private float health;
    private List<Action> actions;
    private float mana;
    private float maxMana;
    private float movementSpeed;
    private float attackSpeed;
    private Position hexagon;

}
