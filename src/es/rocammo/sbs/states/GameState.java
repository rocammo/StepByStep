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

package es.rocammo.sbs.states;

import es.rocammo.engine.Window;

public abstract class GameState {
    protected GameStateManager gsm;

    public abstract void init();

    public abstract void input(Window window);
    public abstract void update(float interval);
    public abstract void render(Window window);
}
