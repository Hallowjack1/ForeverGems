package com.demo.forevergems;

import java.util.ArrayList;

public class BraceletMaterial
{
    private static final ArrayList<BraceletMaterial> materialArrayList = new ArrayList<>();

    private String id;
    private String name;

    public BraceletMaterial(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void initBraceletMaterial()
    {
        materialArrayList.clear();

        BraceletMaterial material1 = new BraceletMaterial("0", "Silver");
        materialArrayList.add(material1);

        BraceletMaterial material2 = new BraceletMaterial("1", "Gold");
        materialArrayList.add(material2);

        BraceletMaterial material3 = new BraceletMaterial("2", "Rose Gold");
        materialArrayList.add(material3);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.bracelet_silver;
            case "1":
                return R.drawable.bracelet_gold;
            case "2":

                return R.drawable.bracelet_rose;
        }
        return R.drawable.bracelet_silver;
    }

    public static ArrayList<BraceletMaterial> getBraceletMaterialArrayList()
    {
        return materialArrayList;
    }
}
