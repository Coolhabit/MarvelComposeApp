package ru.coolhabit.marvelcomposeapp.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.coolhabit.marvelcomposeapp.R

@Composable
fun SettingsScreen() {
    Scaffold {
        Text(stringResource(R.string.settings_screen_go_to), modifier = Modifier.padding(dimensionResource(R.dimen.padding_24)))
    }
}
