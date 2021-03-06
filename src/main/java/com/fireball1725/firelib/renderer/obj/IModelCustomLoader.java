/*
 * Copyright 2017 FireBall1725
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.fireball1725.firelib.renderer.obj;

import net.minecraft.util.ResourceLocation;

/**
 * Instances of this class act as factories for their model type
 *
 * @author cpw
 */
public interface IModelCustomLoader {
    /**
     * Get the main type name for this loader
     *
     * @return the type name
     */
    String getType();

    /**
     * Get resource suffixes this model loader recognizes
     *
     * @return a list of suffixes
     */
    String[] getSuffixes();

    /**
     * Load a model instance from the supplied path
     *
     * @param resource The ResourceLocation of the model
     * @return A model instance
     * @throws ModelFormatException if the model format is not correct
     */
    IModelCustom loadInstance(ResourceLocation resource) throws ModelFormatException;
}