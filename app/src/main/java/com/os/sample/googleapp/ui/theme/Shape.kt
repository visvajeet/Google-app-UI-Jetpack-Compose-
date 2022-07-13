package com.os.sample.googleapp.ui.theme

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Shapes

val customShapes = Shapes(
    extraSmall = Shapes.Full.copy(all = CornerSize(50)),
    small = Shapes.Full.copy(all = CornerSize(50)),
    medium = Shapes.Full.copy(all = CornerSize(5)),
    large = Shapes.Full.copy(all = CornerSize(50)),
    extraLarge = Shapes.Full.copy(all = CornerSize(50))
)