package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class Scissors implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnPaper:
                return GameUtils.CUTS;
            case R.id.btnLizard:
                return GameUtils.DECAPITATES;

            case R.id.btnSpock:
                return GameUtils.SMASHED_BY;
            case R.id.btnRock:
                return GameUtils.CRUSHED_BY;

        }
        return GameUtils.TIES;
    }
}
