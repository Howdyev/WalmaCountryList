# About this app
This simple Android application demonstrates how to fetch and display a list of country information using coroutines and the MVVM architecture.
Explicitly handle exceptions, errors for various scenarios

## Features
- Fetches a list of country information from a remote data source
- Displays the list of countries in a RecyclerView
- Implements the MVVM architecture
- Uses coroutines for asynchronous programming
- Uses sealed class `Resource` for handling states `Success`, `Message`, `Loading`

## Dependencies
The project uses the following dependencies:

- **Kotlin** Coroutines: For asynchronous programming and handling background tasks.
- **Retrofit**: For making network requests and interacting with the API.
- **Gson**: For serializing/deserializing JSON data.
- **RecyclerView**: For displaying a list of items efficiently.

## Prerequisites
- Android Studio Arctic Fox or higher
- Android SDK version 23 or higher

## Implementation Details
- The `Country` data class represents the structure of a country object with its properties such as name, capital, population, etc.
- The `Repository` class is responsible for fetching country information from a remote data source. It uses coroutines to perform the network requests asynchronously.
- The `MainViewModel` class acts as the intermediary between the repository and the UI components. It exposes the country information to be displayed in the UI.
- The `CountryAdapter` class is used by the RecyclerView to display a list of countries.
- The `MainActivity` class sets up the RecyclerView and observes the country information from the ViewModel.
