package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class Rock implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        switch (opponentChoice){
            case R.id.btnLizard:
                return GameUtils.CRUSHES;
            case R.id.btnScissors:
                return GameUtils.CRUSHES;

            case R.id.btnPaper:
                return GameUtils.COVERED_BY;
            case R.id.btnSpock:
                return GameUtils.VAPORIZED_BY;

        }
        return GameUtils.TIES;
    }
}
