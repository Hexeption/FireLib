/*
 * Copyright 2017 FireBall1725
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.fireball1725.testmod2.common.blocks.test;

import com.fireball1725.firelib.blocks.BlockTileBase;
import com.fireball1725.firelib.util.TileHelper;
import com.fireball1725.testmod2.TestMod2;
import com.fireball1725.testmod2.common.tileentities.TileEntityTestBlock2;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestBlock2 extends BlockTileBase {


    public TestBlock2() {
        super(Material.IRON, "testblock", TestMod2.instance);
        this.setInternalName("testblock2");
        this.setTileEntity(TileEntityTestBlock2.class);
    }

    @Override
    public boolean hasGravity(World worldIn, BlockPos pos) {
        return true;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        }


        TileEntityTestBlock2 te = TileHelper.getTileEntity(worldIn, pos, TileEntityTestBlock2.class);
        if (te == null) {
            return false;
        }

        te.getGuiMaker().show(worldIn, playerIn, pos);

        return true;
    }
}