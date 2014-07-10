/*
 * FindBugs - Find Bugs in Java programs
 * Copyright (C) 2003-2008 University of Maryland
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package edu.umd.cs.findbugs.ba;

/**
 * This class was added to return the tuple of location and edge type for the CFG
 * method getPreviousLocations to let the calling function know what edge type the
 * location came from allowing filtering or other handling in the calling funciton
 * 
 * @author Zack Coker
 */
public class LocationAndEdgeType {
    //The location returned.
    Location loc;
    //The edge type transversed to get to that location
    Integer edgeType;
    
    public LocationAndEdgeType(Location location, int type)
    {
        loc = location;
        edgeType = new Integer(type);
    }

    /**
     * @param location
     */
    public LocationAndEdgeType(Location location) {
        loc = location;
        edgeType = null;
    }
    
    public Location getLocation()
    {
        return loc;
    }
    
    public Integer getEdgeType()
    {
        return edgeType;
    }

}
