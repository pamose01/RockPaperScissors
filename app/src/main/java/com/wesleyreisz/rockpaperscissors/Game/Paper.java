package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class Paper implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnSpock:
                return GameUtils.DISPROVES;
            case R.id.btnRock:
                return GameUtils.COVERS;

            case R.id.btnScissors:
                return GameUtils.CUT_BY;
            case R.id.btnLizard:
                return GameUtils.EATEN_BY;

        }
        return GameUtils.TIES;
    }
}

