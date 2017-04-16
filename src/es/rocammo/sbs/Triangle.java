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

import es.rocammo.engine.Window;

import java.util.Random;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Triangle {
    // Triangle Movement
    float x = 0; float y = 0;

    // Triangle Color
    float min = 0.0f;
    float max = 1.0f;
    Random rand = new Random();
    float redValue = 1.0f, blueValue = 1.0f, greenValue = 1.0f;

    public void input(Window window) {
        // Triangle Movement
        if(window.isKeyPressed(GLFW_KEY_A) && !(x < -0.5f)) { x-=0.025f; }
        if(window.isKeyPressed(GLFW_KEY_D) && !(x > 0.5f)) { x+=0.025f; }
        if(window.isKeyPressed(GLFW_KEY_W) && !(y > 0.5f)) { y+=0.025f; }
        if(window.isKeyPressed(GLFW_KEY_S) && !(y < -0.5f)) { y-=0.025f; }

        // Triangle Color
        if(window.isKeyPressed(GLFW_KEY_SPACE)) {
            redValue = rand.nextFloat() * (max - min) + min;
            blueValue = rand.nextFloat() * (max - min) + min;
            greenValue = rand.nextFloat() * (max - min) + min;
        }
    }

    public void render(Window window) {
        // Triangle Shape Initialization
        glBegin(GL_TRIANGLES);
            glColor3f(redValue, 0, 0);
            glVertex2f(-0.5f +x, -0.5f +y);
            glColor3f(0, blueValue, 0);
            glVertex2f(0.5f +x, -0.5f +y);
            glColor3f(0, 0, greenValue);
            glVertex2f(0.0f +x, 0.5f +y);
        glEnd();
    }
}
