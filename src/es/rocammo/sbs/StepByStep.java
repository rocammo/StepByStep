/*
 * This file is part of StepByStep.
 * Copyright (C) 2017 Rodrigo Casamayor.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.rocammo.sbs;

import es.rocammo.engine.IGameLogic;
import es.rocammo.engine.Window;
import es.rocammo.sbs.states.GameStateManager;

public class StepByStep implements IGameLogic {
    private GameStateManager gsm;

    @Override
    public void init() throws Exception {
        gsm = new GameStateManager();
        gsm.setState(gsm.MENUSTATE);
    }

    @Override
    public void input(Window window) {
        gsm.input(window);
    }

    @Override
    public void update(float interval) {
        gsm.update(interval);
    }

    @Override
    public void render(Window window) {
        window.clear();
        gsm.render(window);
    }
}
