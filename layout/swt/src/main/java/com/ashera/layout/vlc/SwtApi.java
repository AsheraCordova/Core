//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package com.ashera.layout.vlc;

import org.eclipse.swt.widgets.Composite;
import uk.co.caprica.vlcj.player.embedded.videosurface.VideoSurfaceAdapters;

public final class SwtApi {
    public final SwtMediaPlayerFactory factory;


    public void release() {
    }

    public SwtApi(SwtMediaPlayerFactory mediaPlayerFactory) {
    	this.factory  = mediaPlayerFactory;
    }

    public CompositeVideoSurface newCompositeVideoSurface(Composite composite) {
        return new CompositeVideoSurface(composite, VideoSurfaceAdapters.getVideoSurfaceAdapter());
    }
}
