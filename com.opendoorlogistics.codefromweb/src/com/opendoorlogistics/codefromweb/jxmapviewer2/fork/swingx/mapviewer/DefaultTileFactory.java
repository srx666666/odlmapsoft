/*
 * DefaultTileFactory.java
 *
 * Created on June 27, 2006, 2:20 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.opendoorlogistics.codefromweb.jxmapviewer2.fork.swingx.mapviewer;

import java.awt.image.BufferedImage;

/**
 * A tile factory which configures itself using a TileFactoryInfo object and uses a Google Maps like mercator
 * projection.
 * @author joshy
 */
public class DefaultTileFactory extends AbstractTileFactory
{
	/**
	 * Creates a new instance of DefaultTileFactory using the spcified TileFactoryInfo
	 * @param info a TileFactoryInfo to configure this TileFactory
	 */
	public DefaultTileFactory(TileFactoryInfo info)
	{
		super(info);
	}

	@Override
	public BufferedImage renderSynchronously(int x, int y, int zoom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRenderedOffline() {
		return false;
	}

}
