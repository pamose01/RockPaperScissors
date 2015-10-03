package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Frosty on 9/27/2015.
 */
public class Lizard implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnSpock:
                return GameUtils.POISONS;
            case R.id.btnPaper:
                  return GameUtils.EATS;

            case R.id.btnRock:
                return GameUtils.CRUSHED_BY;
            case R.id.btnScissors:
                return GameUtils.DECAPITATED_BY;

        }
        return GameUtils.TIES;
    }
}

