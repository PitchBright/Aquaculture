package com.teammetallurgy.aquaculture.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class AquaItemPickaxe extends ItemPickaxe {

    public AquaItemPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    /**
     * Sets the unlocalized name of this item to the string passed as the parameter, prefixed by "item."
     */
    @Override
    public Item setUnlocalizedName(String par1Str) {
        super.setUnlocalizedName(par1Str);
        return this;
    }

}
