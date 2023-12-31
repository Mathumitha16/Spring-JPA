The project consists of the below five important files,

- `SongRepository.java`: Create an interface containing required methods.
- `SongJpaService.java`: Update the service class with logic for managing song data.
- `SongController`: Create the controller class to handle HTTP requests.
- `SongJpaRepository.java`: Create an interface which implements the `JpaRepository` interface.

The project is connected to H2 database which consists of Playlist table with the below Schema

#### PLAYLIST table

|    Columns    |  Type   |
| :-----------: | :-----: |
|    songId     | INTEGER |
|   songName    |  TEXT   |
|   lyricist    |  TEXT   |
|    singer     |  TEXT   |
| musicDirector |  TEXT   |



  
The following APIs are implemented

### API 1

#### Path: `/songs`

#### Method: `GET`

#### Description:

Returns a list of all songs in the `playlist`.

#### Response

```
[
    {
        "songId": 1,
        "songName": "Butta Bomma",
        "lyricist": "Ramajogayya Sastry",
        "singer": "Armaan Malik",
        "musicDirector": "Thaman S"
    },
   ...
]
```

### API 2

#### Path: `/songs`

#### Method: `POST`

#### Description:

Creates a new song in the `playlist`. `songId` is auto-incremented.

#### Request

```
{
    "songName": "Bala", 
    "lyricist": "Siddharth-Garima", 
    "singer": "Sachin-Jigar", 
    "musicDirector": "Sachin-Jigar"
}
```

#### Response

```
{
    "songId": 6,
    "songName": "Bala",
    "lyricist": "Siddharth-Garima",
    "singer": "Sachin-Jigar",
    "musicDirector": "Sachin-Jigar"
}
```

### API 3

#### Path: `/songs/{songId}`

#### Method: `GET`

#### Description:

Returns a song based on a `songId`. If the given `songId` is not found in the `playlist`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Response

```
{
    "songId": 3,
    "songName": "Tum Hi Ho",
    "lyricist": "Mithoon",
    "singer": "Arijit Singh",
    "musicDirector": "Mithoon"

}
```

### API 4

#### Path: `/songs/{songId}`

#### Method: `PUT`

#### Description:

Updates the details of a song in the `playlist` based on the `songId` and return the updated song details.
If the given `songId` is not found in the `playlist`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Request

```
{
    "singer": "Atif Aslam"
}
```

#### Response

```
{
    "songId": 3,
    "songName": "Tum Hi Ho",
    "lyricist": "Mithoon",
    "singer": "Atif Aslam",
    "musicDirector": "Mithoon"
}

```

### API 5

#### Path: `/songs/{songId}`

#### Method: `DELETE`

#### Description:

Deletes a song from the `playlist`  based on the `songId`. If the given `songId` is not found in the `playlist`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.
