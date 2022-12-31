package com.demo.forevergems;

import java.util.ArrayList;

public class GemShape {
    private static final ArrayList<GemShape> gemArrayList = new ArrayList<>();

    private String idGem;
    private String GemName;

    public GemShape(String idGem, String gemName)
    {
        this.idGem = idGem;
        this.GemName = gemName;
    }

    public String getId() {
        return idGem;
    }

    public void setId(String idGem) {
        this.idGem = idGem;
    }

    public String getName() {
        return GemName;
    }

    public void setName(String gemName) {
        this.GemName = gemName;
    }

    public static void initGemShape()
    {
        gemArrayList.clear();

        GemShape gemShape1 = new GemShape("0", "Diamond Round");
        gemArrayList.add(gemShape1);

        GemShape gemShape2 = new GemShape("1", "Diamond Oval");
        gemArrayList.add(gemShape2);

        GemShape gemShape3 = new GemShape("2", "Diamond Pear");
        gemArrayList.add(gemShape3);

        GemShape gemShape4 = new GemShape("3", "Diamond Emerald");
        gemArrayList.add(gemShape4);


        GemShape gemShape5 = new GemShape("4", "Amethyst Round");
        gemArrayList.add(gemShape5);

        GemShape gemShape6 = new GemShape("5", "Amethyst Oval");
        gemArrayList.add(gemShape6);

        GemShape gemShape7 = new GemShape("6", "Amethyst Pear");
        gemArrayList.add(gemShape7);

        GemShape gemShape8 = new GemShape("7", "Amethyst Emerald");
        gemArrayList.add(gemShape8);


        GemShape gemShape9 = new GemShape("8", "Emerald Round");
        gemArrayList.add(gemShape9);

        GemShape gemShape10 = new GemShape("9", "Emerald Oval");
        gemArrayList.add(gemShape10);

        GemShape gemShape11 = new GemShape("10", "Emerald Pear");
        gemArrayList.add(gemShape11);

        GemShape gemShape12 = new GemShape("11", "Emerald Emerald");
        gemArrayList.add(gemShape12);


        GemShape gemShape13 = new GemShape("12", "Ruby Round");
        gemArrayList.add(gemShape13);

        GemShape gemShape14 = new GemShape("13", "Ruby Oval");
        gemArrayList.add(gemShape14);

        GemShape gemShape15 = new GemShape("14", "Ruby Pear");
        gemArrayList.add(gemShape15);

        GemShape gemShape16 = new GemShape("15", "Ruby Emerald");
        gemArrayList.add(gemShape16);


        GemShape gemShape17 = new GemShape("16", "Sapphire Round");
        gemArrayList.add(gemShape17);

        GemShape gemShape18 = new GemShape("17", "Sapphire Oval");
        gemArrayList.add(gemShape18);

        GemShape gemShape19 = new GemShape("18", "Sapphire Pear");
        gemArrayList.add(gemShape19);

        GemShape gemShape20 = new GemShape("19", "Sapphire Emerald");
        gemArrayList.add(gemShape20);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.diamond_round;
            case "1":
                return R.drawable.diamond_oval;
            case "2":
                return R.drawable.diamond_pear;
            case "3":
                return R.drawable.diamond_emerald;

            case "4":
                return R.drawable.amethyst_round;
            case "5":
                return R.drawable.amethyst_oval;
            case "6":
                return R.drawable.amethyst_pear;
            case "7":
                return R.drawable.amethyst_emerald;

            case "8":
                return R.drawable.emerald_round;
            case "9":
                return R.drawable.emerald_oval;
            case "10":
                return R.drawable.emerald_pear;
            case "11":
                return R.drawable.emerald_emerald;

            case "12":
                return R.drawable.ruby_round;
            case "13":
                return R.drawable.ruby_oval;
            case "14":
                return R.drawable.ruby_pear;
            case "15":
                return R.drawable.ruby_emerald;

            case "16":
                return R.drawable.sapphire_round;
            case "17":
                return R.drawable.sapphire_oval;
            case "18":
                return R.drawable.sapphire_pear;
            case "19":
                return R.drawable.sapphire_emerald;
        }
        return R.drawable.diamond_round;
    }

    public static ArrayList<GemShape> getGemShapeArrayList()
    {
        return gemArrayList;
    }
}
