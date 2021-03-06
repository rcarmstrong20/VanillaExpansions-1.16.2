package rcarmstrong20.vanilla_expansions.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class VeDrinkItem extends Item
{
    private Item returnItem;

    public VeDrinkItem(Properties properties)
    {
        super(properties);
        this.returnItem = Items.GLASS_BOTTLE;
    }

    public VeDrinkItem(Properties properties, Item returnItemIn)
    {
        super(properties);
        this.returnItem = returnItemIn;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stackIn, World worldIn, LivingEntity livingEntityIn)
    {
        if (livingEntityIn instanceof PlayerEntity)
        {
            PlayerEntity playerEntity = (PlayerEntity) livingEntityIn;
            boolean flag = playerEntity.isCreative();

            if (!flag)
            {
                playerEntity.addItemStackToInventory(new ItemStack(returnItem, 1));
                return super.onItemUseFinish(stackIn, worldIn, livingEntityIn);
            }
        }
        return stackIn;
    }

    @Override
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.DRINK;
    }
}
