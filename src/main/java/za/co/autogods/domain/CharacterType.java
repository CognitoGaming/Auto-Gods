package za.co.autogods.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class CharacterType {
    private Type type;
    private int typePoints;
}
