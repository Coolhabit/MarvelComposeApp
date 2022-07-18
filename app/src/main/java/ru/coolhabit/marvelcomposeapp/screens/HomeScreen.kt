package ru.coolhabit.marvelcomposeapp.screens

import android.os.Parcelable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import kotlinx.parcelize.Parcelize
import ru.coolhabit.marvelcomposeapp.R
import ru.coolhabit.marvelcomposeapp.extensions.HERO_DETAILS
import ru.coolhabit.marvelcomposeapp.extensions.WORD_KEY
import ru.coolhabit.marvelcomposeapp.navigation.navigate

@Parcelize
data class Word(val value: String): Parcelable

@Composable
fun HomeScreen(
    navController: NavController
) {
    val testArray = listOf(
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
        Word("Iron Man"),
        Word("Captain America"),
        Word("Thor"),
        Word("Hulk"),
        Word("Doctor Strange"),
    )

    Scaffold {
        LazyColumn {
            testArray.map {
                item {
                    Text(it.value, modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_24))
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(HERO_DETAILS, bundleOf(WORD_KEY to it))
                        })
                }
            }
        }
    }
}
