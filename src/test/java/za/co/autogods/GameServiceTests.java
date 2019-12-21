package za.co.autogods;

import org.junit.jupiter.api.Test;
import za.co.autogods.service.GameService;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameServiceTests {

    @Test
    void calculateDistanceBetweenHexesAdjacentY(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(0, 0), new Point(0, 1)), 1);
    }

    @Test
    void calculateDistanceBetweenHexesAdjacentx(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(0, 0), new Point(1, 0)), 1);
    }

    @Test
    void calculateDistanceBetweenHexesInSameX(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(0, 0), new Point(0, 4)), 4);
    }

    @Test
    void calculateDistanceBetweenHexesInSameY(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(0, 0), new Point(4, 0)), 4);
    }

    @Test
    void calculateDistanceBetweenHexesDiagonal(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(0, 0), new Point(3, 3)), 5);
    }

    @Test
    void calculateDistanceBetweenHexesWithOffset(){
        GameService gameService = new GameService();
        assertEquals(gameService.distanceBetweenHexes(new Point(2, 3), new Point(4, 1)), 3);
    }
}
