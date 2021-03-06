package rcarmstrong20.vanilla_expansions.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class VeTotemItem extends Item
{
    public VeTotemItem(Item.Properties properties)
    {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getActiveItemStack();

        this.damageItem(stack, 1, player, (entity) ->
        {
            entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });

        /*
         * stack.damageItem(1, player, (entity) -> {
         * entity.sendBreakAnimation(EquipmentSlotType.MAINHAND); });
         */

        // System.out.println("Damage totem");

        return super.onItemRightClick(world, player, hand);
    }
}
