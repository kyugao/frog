/*
 * Copyright 2018 the original author or authors. 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.github.drinkjava2.frog.brain;

/**
 * Cell is the basic unit of frog's brain
 * 
 * @author Yong Zhu
 * @since 1.0
 */
public class Cell {
	public static final float MAX_ENERGY_LIMIT = 100.0f;

	// this cell belong to frog's which organ
	public Organ organ;

	// energy of cell, energy got from food
	public float energy; // 每个细胞当前的能量值

}
