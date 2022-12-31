package com.demo.forevergems;

import java.util.ArrayList;

public class EarringMaterial
{
    private static final ArrayList<EarringMaterial> materialArrayList = new ArrayList<>();

    private String id;
    private String name;

    public EarringMaterial(String id, String name)
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

    public static void initEarringMaterial()
    {
        materialArrayList.clear();

        EarringMaterial material1 = new EarringMaterial("0", "Silver");
        materialArrayList.add(material1);

        EarringMaterial material2 = new EarringMaterial("1", "Gold");
        materialArrayList.add(material2);

        EarringMaterial material3 = new EarringMaterial("2", "Rose Gold");
        materialArrayList.add(material3);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.earring_silver;
            case "1":
                return R.drawable.earring_gold;
            case "2":

                return R.drawable.earring_rose;
        }
        return R.drawable.earring_silver;
    }

    public static ArrayList<EarringMaterial> getEarringMaterialArrayList()
    {
        return materialArrayList;
    }
}
