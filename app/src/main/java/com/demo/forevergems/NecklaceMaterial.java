package com.demo.forevergems;

import java.util.ArrayList;

public class NecklaceMaterial
{
    private static final ArrayList<NecklaceMaterial> materialArrayList = new ArrayList<>();

    private String id;
    private String name;

    public NecklaceMaterial(String id, String name)
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

    public static void initNecklaceMaterial()
    {
        materialArrayList.clear();

        NecklaceMaterial material1 = new NecklaceMaterial("0", "Silver");
        materialArrayList.add(material1);

        NecklaceMaterial material2 = new NecklaceMaterial("1", "Gold");
        materialArrayList.add(material2);

        NecklaceMaterial material3 = new NecklaceMaterial("2", "Rose Gold");
        materialArrayList.add(material3);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.necklace_silver;
            case "1":
                return R.drawable.necklace_gold;
            case "2":

                return R.drawable.necklace_rose;
        }
        return R.drawable.necklace_silver;
    }

    public static ArrayList<NecklaceMaterial> getNecklaceMaterialArrayList()
    {
        return materialArrayList;
    }
}
