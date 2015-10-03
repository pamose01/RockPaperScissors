package com.wesleyreisz.rockpaperscissors;

import android.content.res.ColorStateList;
import android.graphics.Color;

import com.wesleyreisz.rockpaperscissors.Game.GameType;
import com.wesleyreisz.rockpaperscissors.Game.Paper;
import com.wesleyreisz.rockpaperscissors.Game.Rock;
import com.wesleyreisz.rockpaperscissors.Game.Scissors;
import com.wesleyreisz.rockpaperscissors.Game.Lizard;
import com.wesleyreisz.rockpaperscissors.Game.Spock;

import java.util.Random;

/*
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    /*public static final String BEATS = "beats";
    public static final String LOSES_TO = "loses to";
    public static final String TIES = "ties";*/
    public static final String CUTS = "cuts";
    public static final String CUT_BY = "is cut by";
    public static final String DECAPITATES = "decapitates";
    public static final String DECAPITATED_BY = "is decapitated by";
    public static final String CRUSHES = "crushes";
    public static final String CRUSHED_BY = "is crushed by";
    public static final String EATS = "eats";
    public static final String EATEN_BY = "is eaten by";
    public static final String POISONS = "poisons";
    public static final String POISONED_BY = "is poisoned by";
    public static final String VAPORIZES = "vaporizes";
    public static final String VAPORIZED_BY = "is vaporized by";
    public static final String SMASHES = "smashes";
    public static final String SMASHED_BY = "is smashed by";
    public static final String DISPROVES = "disproves";
    public static final String DISPROVED_BY = "is disproved by";
    public static final String COVERS = "covers";
    public static final String COVERED_BY = "is covered by";
    public static final String TIES = "ties";



    public static Integer getComputerChoice(){
        Integer selectedValue;
        Random r = new Random(System.currentTimeMillis());

        selectedValue = r.nextInt(5);//
        if(selectedValue==0){
            return R.id.btnRock;
        }else if (selectedValue==1){
            return R.id.btnPaper;
        }else if (selectedValue==2){
            return R.id.btnScissors;
        }else if (selectedValue==3){
            return R.id.btnLizard;
        }else{
            return R.id.btnSpock;
        }
    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else if (buttonChoice==R.id.btnScissors){
            return R.drawable.scissors;
        }else if (buttonChoice==R.id.btnLizard){
            return R.drawable.lizard;
        }else{
            return R.drawable.spock;
        }
    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        GameType gameType;

        if (playerSelectedChoice==R.id.btnRock){
            gameType = new Rock();
        }else if  (playerSelectedChoice==R.id.btnPaper){
            gameType = new Paper();
        }else if  (playerSelectedChoice==R.id.btnScissors){
            gameType = new Scissors();
        }else if  (playerSelectedChoice==R.id.btnLizard){
            gameType = new Lizard();
        }else{
            gameType = new Spock();
        }
        return gameType.eval(computerSelectedChoice);
    }

    public static int defineTextColor(String msg) {
        if (GameUtils.EATEN_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.VAPORIZED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.DISPROVED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.CRUSHED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.CUT_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.POISONED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.SMASHED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.COVERED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;
        } else if (GameUtils.DECAPITATED_BY.equalsIgnoreCase(msg)) {
            return Color.RED;

        } else if (GameUtils.EATS.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.VAPORIZES.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.DISPROVES.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.CRUSHES.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.CUTS.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.POISONS.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.SMASHES.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.COVERS.equalsIgnoreCase(msg)) {
            return Color.GREEN;
        } else if (GameUtils.DECAPITATES.equalsIgnoreCase(msg)) {
            return Color.RED;


        }else {
            return Color.BLACK;
        }

    }
}