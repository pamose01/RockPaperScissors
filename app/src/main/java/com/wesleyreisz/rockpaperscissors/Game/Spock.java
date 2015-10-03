package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Frosty on 9/27/2015.
 */
public class Spock implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnRock:
                return GameUtils.VAPORIZES;
            case R.id.btnScissors:
                return GameUtils.SMASHES;

            case R.id.btnPaper:
                return GameUtils.DISPROVED_BY;
            case R.id.btnLizard:
                return GameUtils.POISONED_BY;

                        }
        return GameUtils.TIES;
    }
}
