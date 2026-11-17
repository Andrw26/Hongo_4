/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.Harbinger.Spore.Compat.GraftingCraftingCategory
 *  com.Harbinger.Spore.Compat.SurgeryCraftingCategory
 *  com.Harbinger.Spore.Screens.GraftingMenu
 *  com.Harbinger.Spore.Screens.SurgeryMenu
 *  com.Harbinger.Spore.core.SMenu
 *  mezz.jei.api.IModPlugin
 *  mezz.jei.api.JeiPlugin
 *  mezz.jei.api.registration.IRecipeTransferRegistration
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.inventory.MenuType
 */
package com.luminacherry.sporejeifix;

import com.Harbinger.Spore.Compat.GraftingCraftingCategory;
import com.Harbinger.Spore.Compat.SurgeryCraftingCategory;
import com.Harbinger.Spore.Screens.GraftingMenu;
import com.Harbinger.Spore.Screens.SurgeryMenu;
import com.Harbinger.Spore.core.SMenu;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeTransferRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;

@JeiPlugin
public final class SporeJeiFix
implements IModPlugin {
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath((String)"sporejeifix", (String)"jei_plugin");
    }

    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(SurgeryMenu.class, (MenuType)SMenu.SURGERY_MENU.get(), SurgeryCraftingCategory.SURGERY_TYPE, 0, 20, 21, 36);
        registration.addRecipeTransferHandler(GraftingMenu.class, (MenuType)SMenu.GRAFTING_MENU.get(), GraftingCraftingCategory.GRAFTING_TYPE, 21, 3, 0, 36);
    }
}

