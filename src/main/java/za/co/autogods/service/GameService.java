package za.co.autogods.service;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;
import za.co.autogods.domain.*;
import za.co.autogods.domain.Character;

import java.awt.*;
import java.util.*;
import java.util.List;

@Service
public class GameService {
    private Board board;

    public void start() {
        setupBoard(7, 8);
    }

    /**
     * This method returns a board which is an array based on a cartesian representation of hexes
     * @param x - The size of the board in the x direction
     * @param y - The size of the board in the y direction
     * @return - An initialized board
     */
    private Board setupBoard(int x, int y) {
        this.board = new Board();
        this.board.setHexagons(new int[x][y]);
        return board;
    }

    public int distanceBetweenHexes(Point a, Point b){
        double x0 = a.getX() - Math.floor(a.getY()/2);
        double y0 = a.getY();
        double x1 = b.getX() - Math.floor(b.getY()/2);
        double y1 = b.getY();
        double dx = x1 - x0;
        double dy = y1 - y0;
        return (int)NumberUtils.max(Math.abs(dx), Math.abs(dy), Math.abs(dx+dy));
    }

    private Character createCharacters() {
        List<CharacterType> characterTypes = new ArrayList<>();
        characterTypes.add(new CharacterType(Type.ELECTRIC, 10));
        characterTypes.add(new CharacterType(Type.MAGE, 15));
        List<Action> actions = new ArrayList<>();

        actions.add(Action.builder()
                .type(ActionType.AUTO_ATTACK)
                .affect(Affect.NONE)
                .affectDuration(0)
                .damage(5)
                .requiredMana(0)
                .manaGeneration(5)
                .build());
        actions.add(Action.builder()
                .type(ActionType.ULTIMATE_ATTACK)
                .affect(Affect.STUN)
                .affectDuration(1.5f)
                .damage(20)
                .requiredMana(100)
                .manaGeneration(0)
                .build());

        Character.builder()
                .id(UUID.randomUUID().toString())
                .name("Zeus")
                .health(100)
                .actions(actions)
                .characterTypes(characterTypes)
                .attackSpeed(2)
                .movementSpeed(0.5f)
                .mana(0)
                .maxMana(100)
                .hexagon(new Position(1, 1));
        return null;
    }

}
