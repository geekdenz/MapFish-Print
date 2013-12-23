/*
 * Copyright (C) 2013  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.map.readers;

import org.mapfish.print.utils.PJsonArray;

/**
 * Holds the information we need to manage an XYZ layer.
 */
public class XyzLayerInfo extends TileCacheLayerInfo {
    /**
     * Tolerance we accept when trying to determine the nearest resolution.
     */
    protected static final double RESOLUTION_TOLERANCE = 1.9;

    public XyzLayerInfo(String resolutions, int width, int height, float minX, float minY, float maxX, float maxY, String format) {
        super(resolutions, width, height, minX, minY, maxX, maxY, format);
    }

    public XyzLayerInfo(PJsonArray resolutions, int width, int height, float minX, float minY, float maxX, float maxY, String extension,
            float originX, float originY) {
        super(resolutions, width, height, minX, minY, maxX, maxY, extension, originX, originY);
    }

    @Override
    public double getResolutionTolerance() {
        return RESOLUTION_TOLERANCE;
    }

}
