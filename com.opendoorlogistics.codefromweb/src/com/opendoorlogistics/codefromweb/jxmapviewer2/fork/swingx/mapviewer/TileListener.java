
package com.opendoorlogistics.codefromweb.jxmapviewer2.fork.swingx.mapviewer;

/**
 * Notified when the status of a tile has changed
 * @author Martin Steiger
 */
public interface TileListener
{
	/**
	 * Notification when a tile is loaded
	 * @param tile the tile
	 */
	public void tileLoaded(Tile tile);

}
