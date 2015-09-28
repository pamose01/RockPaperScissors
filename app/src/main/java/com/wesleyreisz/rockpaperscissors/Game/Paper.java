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
            case R.id.btnRock:
                return GameUtils.BEATS;

            case R.id.btnScissors:
            case R.id.btnLizard:
                return GameUtils.LOSES_TO;

        }
        return GameUtils.TIES;
    }
}

