package ru.coolhabit.marvelcomposeapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import ru.coolhabit.marvelcomposeapp.R
import ru.coolhabit.marvelcomposeapp.extensions.COMICS_DETAILS
import ru.coolhabit.marvelcomposeapp.extensions.COMICS_KEY
import ru.coolhabit.marvelcomposeapp.navigation.navigate

@Composable
fun ComicsScreen(
    navController: NavController
) {
    val testComicsArray = listOf("Iron Man #1", "Spider Man #121", "Thor #321", "Hulk #23")

    Scaffold {
        LazyColumn {
            testComicsArray.map {
                item {
                    Text(it, modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_24))
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(COMICS_DETAILS, bundleOf(COMICS_KEY to it))
                        })
                }
            }
        }
    }
}
