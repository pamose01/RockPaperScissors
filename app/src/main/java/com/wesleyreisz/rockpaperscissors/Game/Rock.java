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
            case R.id.btnScissors:
                return GameUtils.BEATS;

            case R.id.btnPaper:
            case R.id.btnSpock:
                return GameUtils.LOSES_TO;
            default:
                return GameUtils.TIES;

        }
    }
}
