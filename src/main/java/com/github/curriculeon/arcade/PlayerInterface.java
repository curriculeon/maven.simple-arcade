package com.github.curriculeon.arcade;

import com.github.curriculeon.arcade.slots.SlotsReel;

/**
 * Created by leon on 7/21/2020.
 * All players of a game should abide by `PlayerInterface`.
 * All players must have reference to the `ArcadeAccount` used to log into the `Arcade` system.
 * All players are capable of `play`ing a game.
 */
public interface PlayerInterface<S> {
    /**
     * @return the `ArcadeAccount` used to log into the `Arcade` system to play this game
     */
    ArcadeAccount getArcadeAccount();

    /**
     * Defines how a specific implementation of `PlayerInterface` plays their respective game.
     * @param <SomeReturnType> specify any return type you would like here
     * @return whatever return value you would like
     */
    void play(SlotsReel gameComponent, String userInput);
}
