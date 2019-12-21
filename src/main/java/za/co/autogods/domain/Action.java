package za.co.autogods.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Action {

    private ActionType type;
    private Affect affect;
    private float affectDuration;
    private float damage;
    private float requiredMana;
    private float manaGeneration;

}
