/*
 * Copyright (C) 2019 MrBinWin (https://github.com/MrBinWin/),
 *                         Dmitry Kuznetsov <mrbinwin@gmail.com>
 *
 * This file is part of HungryApp.
 *
 * HungryApp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HungryApp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HungryApp.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.mrbinwin.hungryapp.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mrbinwin.hungryapp.data.AppDatabase.Companion.TABLE_NAME_RECIPE

/**
 * Room database model represents a recipe
 *
 */
@Entity(tableName = TABLE_NAME_RECIPE)
data class Recipe(
    @ColumnInfo var title: String,
    @ColumnInfo var ingredients: String = "",
    @ColumnInfo var directions: String = "",
    @ColumnInfo var cookingTime: String = "",
    @ColumnInfo var picture: String = ""
) {
    @PrimaryKey(autoGenerate = true) var id: Int? = null
}