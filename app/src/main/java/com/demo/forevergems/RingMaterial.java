package com.demo.forevergems;

import java.util.ArrayList;

public class RingMaterial
{
    private static final ArrayList<RingMaterial> materialArrayList = new ArrayList<>();

    private String id;
    private String name;

    public RingMaterial(String id, String name)
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

    public static void initRingMaterial()
    {
        materialArrayList.clear();

        RingMaterial material1 = new RingMaterial("0", "Silver");
        materialArrayList.add(material1);

        RingMaterial material2 = new RingMaterial("1", "Gold");
        materialArrayList.add(material2);

        RingMaterial material3 = new RingMaterial("2", "Rose Gold");
        materialArrayList.add(material3);
    }

    public int getImage()
    {
        switch (getId())
        {
            case "0":
                return R.drawable.ring_silver;
            case "1":
                return R.drawable.ring_gold;
            case "2":

                return R.drawable.ring_rose;
        }
        return R.drawable.ring_silver;
    }

    public static ArrayList<RingMaterial> getRingMaterialArrayList()
    {
        return materialArrayList;
    }
}
