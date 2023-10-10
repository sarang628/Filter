package com.sryang.screen_filter.ui

import android.graphics.drawable.shapes.Shape
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.R

@Preview
@Composable
fun Filter() {
    var type by remember { mutableStateOf("") }
    Column(Modifier.padding(start = 8.dp, end = 8.dp)) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "FoodType", onClick = {
                type = if (type == "FoodType") "" else "FoodType"
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Price", onClick = {
                type = if (type == "Price") "" else "Price"
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Rating", onClick = {
                type = if (type == "Rating") "" else "Rating"
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Distance", onClick = {
                type = if (type == "Distance") "" else "Distance"
            })
        }
        if (type == "FoodType") FoodType()
        if (type == "Price") Price()
        if (type == "Rating") Rating()
        if (type == "Distance") Distance()
    }

}

@Preview
@Composable
fun FoodType() {
    val foodType = remember { mutableStateListOf<String>() }
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Korean", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Korean")) {
                    foodType.remove("Korean")
                } else {
                    foodType.add("Korean")
                }
            }, isSelected = foodType.contains("Korean"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Japanese", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Japanese")) {
                    foodType.remove("Japanese")
                } else {
                    foodType.add("Japanese")
                }
            }, isSelected = foodType.contains("Japanese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Chinese", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Chinese")) {
                    foodType.remove("Chinese")
                } else {
                    foodType.add("Chinese")
                }
            }, isSelected = foodType.contains("Chinese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "American", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("American")) {
                    foodType.remove("American")
                } else {
                    foodType.add("American")
                }
            }, isSelected = foodType.contains("American"))
            Spacer(modifier = Modifier.width(3.dp))

        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Vietnam", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Vietnam")) {
                    foodType.remove("Vietnam")
                } else {
                    foodType.add("Vietnam")
                }
            }, isSelected = foodType.contains("Vietnam"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Italian", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Italian")) {
                    foodType.remove("Italian")
                } else {
                    foodType.add("Italian")
                }
            }, isSelected = foodType.contains("Italian"))
            FilterButton(text = "Spanish", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Spanish")) {
                    foodType.remove("Spanish")
                } else {
                    foodType.add("Spanish")
                }
            }, isSelected = foodType.contains("Spanish"))
            Spacer(modifier = Modifier.width(3.dp))
        }
    }

}

@Preview
@Composable
fun Price() {
    val price = remember { mutableStateListOf<String>() }
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "$", modifier = Modifier.weight(1f), onClick = {if (price.contains("$")) {
                price.remove("$")
            } else {
                price.add("$")
            }
            }, isSelected = price.contains("$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$", modifier = Modifier.weight(1f), onClick = {if (price.contains("$$")) {
                price.remove("$$")
            } else {
                price.add("$$")
            }
            }, isSelected = price.contains("$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$", modifier = Modifier.weight(1f), onClick = {if (price.contains("$$$")) {
                price.remove("$$$")
            } else {
                price.add("$$$")
            }
            }, isSelected = price.contains("$$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$$", modifier = Modifier.weight(1f), onClick = {if (price.contains("$$$$")) {
                price.remove("$$$$")
            } else {
                price.add("$$$$")
            }
            }, isSelected = price.contains("$$$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$$$", modifier = Modifier.weight(1f), onClick = {if (price.contains("$$$$$")) {
                price.remove("$$$$$")
            } else {
                price.add("$$$$$")
            }
            }, isSelected = price.contains("$$$$$"))

        }
    }
}

@Preview
@Composable
fun Rating() {
    var rating = remember { mutableStateListOf<String>() }
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "*", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "**", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "***", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "****", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "*****", modifier = Modifier.weight(1f), onClick = {})

        }
    }
}

@Preview
@Composable
fun Distance() {
    Column {
        var distance = remember { ("") }
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "100m", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "300m", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "500m", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "1km", modifier = Modifier.weight(1f), onClick = {})
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "2km", modifier = Modifier.weight(1f), onClick = {})

        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        border = BorderStroke(1.dp, colorResource(id = R.color.colorPrimary)),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (!isSelected) Color.White else Color.Green
        )
    ) {
        Text(
            text = text,
            color = colorResource(id = R.color.colorPrimary),
            maxLines = 1,
            modifier = Modifier.basicMarquee()
        )
    }
}

@Preview
@Composable
fun PreviewFilterButton() {
    FilterButton(text = "ds", onClick = {})
}