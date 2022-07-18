package ru.coolhabit.marvelcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.coolhabit.marvelcomposeapp.extensions.COMICS_KEY
import ru.coolhabit.marvelcomposeapp.extensions.WORD_KEY
import ru.coolhabit.marvelcomposeapp.screens.ComicsDetailsScreen
import ru.coolhabit.marvelcomposeapp.screens.ComicsScreen
import ru.coolhabit.marvelcomposeapp.screens.HeroDetailsScreen
import ru.coolhabit.marvelcomposeapp.screens.HomeScreen
import ru.coolhabit.marvelcomposeapp.screens.MyAvengersScreen
import ru.coolhabit.marvelcomposeapp.screens.SettingsScreen
import ru.coolhabit.marvelcomposeapp.screens.Word
import ru.coolhabit.marvelcomposeapp.ui.theme.MarvelComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    val bottomItems = listOf(
                        stringResource(R.string.home_screen),
                        stringResource(R.string.comics_screen),
                        stringResource(R.string.my_avengers_screen),
                        stringResource(R.string.settings_screen)
                    )

                    Scaffold(
                        bottomBar = {
                            BottomNavigation {
                                bottomItems.forEach { screen ->
                                    BottomNavigationItem(
                                        selected = false,
                                        onClick = {
                                            navController.navigate(screen)
                                        },
                                        label = { Text(screen) },
                                        icon = {

                                        })
                                }
                            }
                        }
                    ) {
                        NavHost(navController = navController, startDestination = stringResource(R.string.home_screen)) {
                            composable(getString(R.string.home_screen)) { HomeScreen(navController) }
                            composable(getString(R.string.comics_screen)) { ComicsScreen(navController) }
                            composable(getString(R.string.my_avengers_screen)) { MyAvengersScreen() }
                            composable(getString(R.string.settings_screen)) { SettingsScreen() }
                            composable(getString(R.string.hero_details_screen)) {
                                navController.previousBackStackEntry?.arguments?.getParcelable<Word>(
                                    WORD_KEY
                                )?.let {
                                    HeroDetailsScreen(it)
                                }
                            }
                            composable(getString(R.string.comics_details_screen)) {
                                navController.previousBackStackEntry?.arguments?.getString(
                                    COMICS_KEY
                                )?.let {
                                    ComicsDetailsScreen(it)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
